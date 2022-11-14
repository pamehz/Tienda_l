
package com.tienda_l.dao;

import com.tienda_l.domain.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Long> {
    List <Cliente> findByApellidos (String apellidos);
}
