package com.upao.pe.nutricampusrutina.repositorios;


import com.upao.pe.nutricampusrutina.modelos.Rutina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RutinaRepositorio extends JpaRepository<Rutina, Long> {
}
