package ar.edu.davinci.dvds20202cg6.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds20202cg6.model.Item;

@Repository

public  interface ItemRepository extends JpaRepository<Item, Long>  {

}
