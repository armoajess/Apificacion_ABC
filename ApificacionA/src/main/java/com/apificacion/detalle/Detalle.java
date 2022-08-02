package com.apificacion.detalle;


	public class Detalle{

	    private String estado;
	    private String mensaje;
	    private Response[] detalle;

	    public Detalle() {
	    }

	    public Detalle(String estado, String mensaje, Response[] detalle) {
	        this.estado = estado;
	        this.mensaje = mensaje;
	        this.detalle = detalle;
	    }

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getMensaje() {
			return mensaje;
		}

		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}

		public Response[] getDetalle() {
			return detalle;
		}

		public void setDetalle(Response[] detalle) {
			this.detalle = detalle;
		}
}