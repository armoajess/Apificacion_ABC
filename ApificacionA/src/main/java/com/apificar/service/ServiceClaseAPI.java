package com.apificar.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

@Service
public class ServiceClaseAPI implements Service1 {

    private final RestTemplate clienteRest;

    public ServiceClaseAPI(RestTemplate clienteRest) {
        this.clienteRest = clienteRest;
    }

    @Override
    public String findByStr(String valor) {
        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("valor", valor);
        String url = "https://www.abc.com.py/buscar/".concat(valor);

        try {
            var response = clienteRest.getForEntity(url, String.class, pathVariables);
            if (response.getStatusCode() == HttpStatus.OK) {
                return response.getBody();
            }
        } catch (HttpClientErrorException httpex) {
            return "RESPUESTA DEL SERVIDOR: " + httpex.getStatusCode() + " - " + httpex.getResponseBodyAsString();
        } catch (RestClientException restex) {
            return "SIN RESPUESTA DEL SERVIDOR: " + restex.getMessage();
        }

        return null;
    }
	}


