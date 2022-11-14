
package com.tienda_l.dao;

import com.tienda_l.domain.Articulo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ArticuloDao extends CrudRepository <Articulo, Long>{
    List <Articulo> findByExistencias (int existencias);
    List <Articulo> findByExistenciasOrIdCategoria (int existencias, Long idCategoria);
    
}
