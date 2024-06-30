package com.upao.pe.nutricampusrutina.repositorios;


import com.upao.pe.nutricampusrutina.modelos.Ejercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EjercicioRepositorio extends JpaRepository<Ejercicio, Long> {
    Optional<Ejercicio> findByNombre(String nombre);
}
