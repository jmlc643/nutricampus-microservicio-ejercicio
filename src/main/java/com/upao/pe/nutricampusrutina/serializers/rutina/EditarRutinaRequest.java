package com.upao.pe.nutricampusrutina.serializers.rutina;


import com.upao.pe.nutricampusrutina.modelos.EjercicioRutina;
import com.upao.pe.nutricampusrutina.serializers.RutinaCronograma;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
public class EditarRutinaRequest {
    private LocalTime tiempo;
    private List<EjercicioRutina> ejercicioRutinas;
    private List<RutinaCronograma> rutinaCronogramas;
}
