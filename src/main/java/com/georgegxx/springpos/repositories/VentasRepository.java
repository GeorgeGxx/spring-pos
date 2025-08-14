package com.georgegxx.springpos.repositories;

import com.georgegxx.springpos.entities.Venta;
import org.springframework.data.repository.CrudRepository;

public interface VentasRepository extends CrudRepository<Venta, Integer> {
}
