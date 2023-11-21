package com.udea.fechas.fechaFestiva.controllers;

import com.udea.fechas.fechaFestiva.dominio.festivo.FestivoDto;
import com.udea.fechas.fechaFestiva.dominio.festivo.FestivoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/festivos")
public class FestivoController {

    @Autowired
    private FestivoServicio servicio;

    @GetMapping("/verificar/{año}/{mes}/{dia}")
    public ResponseEntity<String> Festivo(@PathVariable int año, @PathVariable int mes, @PathVariable int dia) {
        if (servicio.esFechaValida(año + "-" + mes + "-" + dia)) {

            Date fecha = new Date(año - 1900, mes - 1, dia);

            if (servicio.esFestivo(fecha)) {
                return ResponseEntity.ok("Es festivo");
            }
            else{
                return ResponseEntity.ok("No es festivo");
            }

        } else {
            return ResponseEntity.badRequest().body("Fecha NO valida");
        }
    }

    @RequestMapping(value = "/obtener/{ano}", method = RequestMethod.GET)
    public List<FestivoDto> listaFestivo(@PathVariable int ano) {
        return servicio.obtenerFestivos(ano);
    }


}
