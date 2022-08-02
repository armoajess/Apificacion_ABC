package com.apificacion.detalle;

import java.util.Date;

public class Response {

    private Date fecha;
    private String enlace;
    private String enlace_Foto;
    private String titulo;
    private String resumen;


    public Response() {
    }

    public Response(Date fecha, String enlace, String enlace_Foto, String titulo,
                             String resumen) {
        this.fecha = fecha;
        this.enlace = enlace;
        this.enlace_Foto = enlace_Foto;
        this.titulo = titulo;
        this.resumen = resumen;

    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getEnlace_Foto() {
        return enlace_Foto;
    }

    public void setEnlace_Foto(String enlace_Foto) {
        this.enlace_Foto = enlace_Foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }


}
