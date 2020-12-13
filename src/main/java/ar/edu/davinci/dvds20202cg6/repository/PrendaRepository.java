package ar.edu.davinci.dvds20202cg6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds20202cg6.model.Prenda;


@Repository 

public interface PrendaRepository extends JpaRepository<Prenda, Long> {
	//instanciamos
	//T = clase de la cual voy hacer el repositorio osea Prenda por eso me pide que la importe
	//id= id es la clase de la clase prenda que es el id de esa clase
	
} 
