package com.upao.pe.nutricampusrutina.servicios;


import com.upao.pe.nutricampusrutina.modelos.Ejercicio;
import com.upao.pe.nutricampusrutina.repositorios.EjercicioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EjercicioServicio {

    @Autowired private EjercicioRepositorio ejercicioRepositorio;

    // READ
    public List<Ejercicio> listarEjercicios(){return ejercicioRepositorio.findAll();}

    // CREATE
    public Ejercicio crearEjercicio(Ejercicio request){
        if(ejercicioRepositorio.existsByNombre(request.getNombre())){
            throw new RuntimeException("El ejercicio ya existe");
        }
        Ejercicio ejercicio = new Ejercicio(request.getNombre(), request.getDescripcion(), request.getTiempoEjercicio(), request.getCaloriasQuemadas(), request.getVelocidadEjercicio());
        return ejercicioRepositorio.save(ejercicio);
    }

    // UPDATE
    public Ejercicio editarEjercicio(String nombre, Ejercicio request){
        Ejercicio ejercicio = buscarEjercicio(nombre);
        ejercicioRepositorio.delete(ejercicio);
        return crearEjercicio(request);
    }

    // DELETE
    public List<Ejercicio> eliminarEjercicio(String nombre){
        Ejercicio ejercicio = buscarEjercicio(nombre);
        ejercicioRepositorio.delete(ejercicio);
        return listarEjercicios();
    }

    public Ejercicio buscarEjercicio(String nombre){
        Optional<Ejercicio> ejercicio = ejercicioRepositorio.findByNombre(nombre);
        if(ejercicio.isEmpty()){
            throw new RuntimeException("Ejercicio no encontrado");
        }
        return ejercicio.get();
    }
}
