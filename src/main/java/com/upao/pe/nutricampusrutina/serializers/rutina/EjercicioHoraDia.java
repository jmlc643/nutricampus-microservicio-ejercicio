package com.upao.pe.nutricampusrutina.serializers.rutina;


import com.upao.pe.nutricampusrutina.serializers.ejercicio.EjercicioSerializer;
import com.upao.pe.nutricampusrutina.serializers.hora_dia.HoraDiaSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EjercicioHoraDia {
    private int repeticiones;
    private EjercicioSerializer ejercicio;
    private HoraDiaSerializer fecha;
}
