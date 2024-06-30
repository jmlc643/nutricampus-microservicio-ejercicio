package com.upao.pe.nutricampusrutina.controladores;


import com.upao.pe.nutricampusrutina.serializers.ejercicio.EditarEjercicioRequest;
import com.upao.pe.nutricampusrutina.serializers.ejercicio.EjercicioSerializer;
import com.upao.pe.nutricampusrutina.servicios.EjercicioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ejercicio")
public class EjercicioControlador {

    @Autowired private EjercicioServicio ejercicioServicio;

    @GetMapping("/listar/")
    public List<EjercicioSerializer> listarEjercicios(){
        return ejercicioServicio.listarEjercicios();
    }

    @PostMapping("/crear/")
    public EjercicioSerializer crearEjercicio(@RequestBody EjercicioSerializer request){
        return ejercicioServicio.crearEjercicio(request);
    }

    @PutMapping("/editar/{nombre}")
    public EjercicioSerializer editarEjercicio(@PathVariable String nombre, @RequestBody EditarEjercicioRequest request){
        return ejercicioServicio.editarEjercicio(nombre, request);
    }

    @DeleteMapping("/eliminar/{nombre}")
    public List<EjercicioSerializer> eliminarEjercicio(@PathVariable String nombre){
        return ejercicioServicio.eliminarEjercicio(nombre);
    }
}
