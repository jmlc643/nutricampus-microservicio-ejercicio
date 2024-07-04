package com.upao.pe.nutricampusrutina.modelos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ejercicios")
public class Ejercicio {
    @Id
    private String nombre;
    private String descripcion;
    private LocalTime tiempoEjercicio;
    private double caloriasQuemadas;
    private char velocidadEjercicio;
}
