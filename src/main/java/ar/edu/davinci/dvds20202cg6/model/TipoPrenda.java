package ar.edu.davinci.dvds20202cg6.model;

public enum TipoPrenda {
		SACO("Saco"),
	 PANTALON("Pantalon"),
	 CAMISA("Camisa"),
	 CAMPERA("Campera"),
	 TAPADO("Tapado"),
	 CHAQUETA("Chaqueta");
	
	private String descripcion;
	
	TipoPrenda(String descripcion){
		this.descripcion= descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
}
