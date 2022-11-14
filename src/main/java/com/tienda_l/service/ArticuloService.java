
package com.tienda_l.service;
import com.tienda_l.domain.Articulo;
import java.util.List;
public interface ArticuloService {
   public List<Articulo> getArticulos(boolean activos);
   public Articulo getArticulo(Articulo articulo);
   public void save (Articulo articulo);
   public void delete (Articulo articulo);
   public List<Articulo> getPorExistencias(int existencias);
   public List<Articulo> getPorExistenciasCategorias(int existencias, Long idCategoria);
    
}
