package ar.edu.davinci.dvds20202cg6.service;

import ar.edu.davinci.dvds20202cg6.controller.rest.request.PrendaInsertRequest;
import ar.edu.davinci.dvds20202cg6.controller.rest.response.PrendaResponse;
import ar.edu.davinci.dvds20202cg6.model.Prenda;

public class PrendaConverter {
	
	public Prenda convertToPrenda(final PrendaInsertRequest prendaInsertRequest) {
		Prenda prenda = Prenda.builder().build();
		return prenda;
	}
	
	public PrendaResponse convertToPrendaResponse(final Prenda prenda) {
		PrendaResponse prendaResponse= PrendaResponse.builder().build();
		return prendaResponse;
		
	}
	
}
