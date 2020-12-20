package ar.edu.davinci.dvds20202cg6.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import ar.edu.davinci.dvds20202cg6.model.VentaEfectivo;


/*

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class VentaRepositoryTest {
   private final Logger LOGGER = LoggerFactory.getLogger(PrendaRepository.class);
   
   @Autowired
   private VentaEfectivoRepository ventaEfectivoRepository;
	
   @Test
	void testFindAll() {
		assertNotNull(ventaEfectivoRepository, "El repositorio es nulo.");
		List<VentaEfectivo> ventas = ventaEfectivoRepository.findAll();
		
		LOGGER.info("Clientes encontrados: " + ventas.size());

		assertNotNull(ventas, "La lista de ventas es nula.");
		assertTrue(ventas.size() > 0, "No existen ventas.");
		
	}
   
   @Test
	void testFindAllById() {
		
		Long id = 3L;
		Optional<VentaEfectivo> ventaOpcional = ventaEfectivoRepository.findById(id);
		if (ventaOpcional.isPresent()){
			VentaEfectivo venta = ventaOpcional.get();
			
			LOGGER.info("Venta encontrada: " + venta);
			assertEquals("Cecilia", venta.getCliente().getNombre());
			
		}
      }
}
*/