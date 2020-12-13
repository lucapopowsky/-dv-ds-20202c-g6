package ar.edu.davinci.dvds20202cg6.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.davinci.dvds20202cg6.controller.TiendaAppRest;
import ar.edu.davinci.dvds20202cg6.model.Prenda;
import ar.edu.davinci.dvds20202cg6.service.PrendaService;


//controlador rest
@RestController
public class PrendaController extends TiendaAppRest {
	private final Logger LOGGER = LoggerFactory.getLogger(PrendaController.class);
	@Autowired
	private PrendaService prendaService;
	//metodo de listado
	@GetMapping(path = "/prendas")
	public List<Prenda> getListAll(){
		LOGGER.info("Listar todas las prendas");
		return prendaService.listAll();
		
	}
	
}
