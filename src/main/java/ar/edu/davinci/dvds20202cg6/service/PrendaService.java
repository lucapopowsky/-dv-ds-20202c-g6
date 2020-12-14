package ar.edu.davinci.dvds20202cg6.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ar.edu.davinci.dvds20202cg6.model.Prenda;


public interface PrendaService {

	public List<Prenda> listAll();
	//resultado paginado
	public Page<Prenda> list(Pageable pageable);
	public Prenda findById(Long id);
	public Prenda save(Prenda prenda);
	public void delete(Prenda prenda);
	public long count();
	public void delete(Long id);
	

}
