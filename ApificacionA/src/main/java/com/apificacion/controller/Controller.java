package com.apificacion.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

import com.apificacion.detalle.Detalle;
import com.apificar.service.DAT_POST;
import com.apificar.service.Service1;


	@RestController()
	@RequestMapping("/api-implementado")
	public class Controller {

	    @Autowired(required=false)
	    @Qualifier("serviceRestTemplate")
	    private Service1 service1;
	    private DAT_POST post;
	    
	  
	    @ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "OK",
	    content = @Content(schema = @Schema(implementation = String.class))),
	    @ApiResponse(responseCode = "400", description = "Parametro Invalido",
	    content = @Content),
	    @ApiResponse(responseCode = "404", description = "Parametro de busqueda no existe",
	    content = @Content)})

	    @PostMapping("/save")
		public void guardar(@RequestBody Detalle detalle) {
			post.save(detalle);
		}

	    @GetMapping(value = "/consulta/{text}")
	    public String consulta(@PathVariable String text) {
	        return service1.findByStr(text);
	    }
	}

