package com.udea.fechas.fechaFestiva.dominio.festivo;

import java.util.Date;
import java.util.List;

public interface IFestivoServicio {
    public boolean esFestivo(Date Fecha);

    public List<FestivoDto> obtenerFestivos(int año);

    public boolean esFechaValida(String strFecha);
}
