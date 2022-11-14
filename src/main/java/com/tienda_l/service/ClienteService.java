
package com.tienda_l.service;
import com.tienda_l.domain.Articulo;
import com.tienda_l.domain.Cliente;
import java.util.List;
public interface ClienteService {
   public List<Cliente> getClientes();
   public Cliente getCliente(Cliente cliente);
   public void save (Cliente cliente);
   public void delete (Cliente cliente);
   public List<Cliente> getPorApellidos(String apellidos);
    
}
