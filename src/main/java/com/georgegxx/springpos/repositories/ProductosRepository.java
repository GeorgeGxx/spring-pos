package com.georgegxx.springpos.repositories;

import com.georgegxx.springpos.entities.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductosRepository extends CrudRepository<Producto, Integer> {

    Producto findFirstByCodigo(String codigo);
}
