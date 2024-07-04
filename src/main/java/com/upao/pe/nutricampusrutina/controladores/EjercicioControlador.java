package com.upao.pe.nutricampusrutina.controladores;


import com.upao.pe.nutricampusrutina.modelos.Ejercicio;
import com.upao.pe.nutricampusrutina.servicios.EjercicioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ejercicio")
@CrossOrigin("https://develop--nutricampus.netlify.app")
public class EjercicioControlador {

    @Autowired private EjercicioServicio ejercicioServicio;

    @GetMapping("/listar/")
    public List<Ejercicio> listarEjercicios(){
        return ejercicioServicio.listarEjercicios();
    }

    @PostMapping("/crear/")
    public Ejercicio crearEjercicio(@RequestBody Ejercicio request){
        return ejercicioServicio.crearEjercicio(request);
    }

    @PutMapping("/editar/{nombre}")
    public Ejercicio editarEjercicio(@PathVariable String nombre, @RequestBody Ejercicio request){
        return ejercicioServicio.editarEjercicio(nombre, request);
    }

    @DeleteMapping("/eliminar/{nombre}")
    public List<Ejercicio> eliminarEjercicio(@PathVariable String nombre){
        return ejercicioServicio.eliminarEjercicio(nombre);
    }

    @GetMapping("/buscar/{nombre}")
    public Ejercicio buscarEjercicio(@PathVariable String nombre){
        return ejercicioServicio.buscarEjercicio(nombre);
    }
}
