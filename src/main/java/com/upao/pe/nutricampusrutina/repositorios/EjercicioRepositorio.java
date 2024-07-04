package com.upao.pe.nutricampusrutina.repositorios;


import com.upao.pe.nutricampusrutina.modelos.Ejercicio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EjercicioRepositorio extends MongoRepository<Ejercicio, String> {
    Optional<Ejercicio> findByNombre(String nombre);

    boolean existsByNombre(String nombre);
}
