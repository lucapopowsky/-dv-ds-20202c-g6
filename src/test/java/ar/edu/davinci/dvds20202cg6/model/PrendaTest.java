package ar.edu.davinci.dvds20202cg6.model;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class PrendaTest {

	@Test
	void testBuilder() {
		//instanciamos prenda
		
		
		
		//GIVEN-THEN(los dos juntos)
		/*Prenda prenda = Prenda.builder()
				.id(1L)
				.descripcion("Camisa")
				.tipo(TipoPrenda.CAMISA)
				.precioBase(new BigDecimal(10.2D))
				//metodo build
				.build();
				*/
		
		
		//GIVEN
		
		Long id =1L;
		
		String camisa = "Camisa";
		TipoPrenda tipo = TipoPrenda.CAMISA;
		BigDecimal precio = new BigDecimal(10.2D);
		
		//THEN
		
		Prenda prenda = Prenda.builder()
				.id(id)
				.descripcion(camisa)
				.tipo(tipo)
				.precioBase(precio)
				.build();
		
		//WHEN
		//que prenda no sea nula
		assertNotNull(prenda);
		assertEquals(id,prenda.getId());
		assertEquals(camisa,prenda.getDescripcion());
		assertEquals(tipo,prenda.getTipo());
		assertEquals(precio,prenda.getPrecioBase());
		
	}

}
