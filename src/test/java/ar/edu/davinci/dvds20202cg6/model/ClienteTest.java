package ar.edu.davinci.dvds20202cg6.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;

class ClienteTest {
	
	@Test
	void testBuilder(){
		
		Long id =2L;
		
		String nombre = "Lucho";
		String apellido = "Mosquera";
		String razonSocial = nombre + " " + apellido;
		//THEN
		
		Cliente cliente = Cliente.builder()
				.id(id)
				.nombre(nombre)
				.apellido(apellido)
				.build();
		
		//WHEN
		//verifica que cliente no este null 
		
		assertNotNull(cliente);
		assertEquals(id,cliente.getId());
		assertEquals(nombre,cliente.getNombre());
		assertEquals(apellido,cliente.getApellido());
		assertEquals(razonSocial, cliente.getRazonSocial());
	}
	
}
