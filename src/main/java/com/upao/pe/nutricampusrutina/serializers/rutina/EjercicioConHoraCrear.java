package com.upao.pe.nutricampusrutina.serializers.rutina;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class EjercicioConHoraCrear {
    private int repeticiones;
    private String ejercicio;
    private LocalDateTime fecha;
}
