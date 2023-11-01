package com.udea.fechas.fechaFestiva.dominio.festivo;


import com.udea.fechas.fechaFestiva.dominio.tipo.Tipo;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name = "festivo")
@Entity(name = "Festivo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Festivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String nombre;
    private int dia;
    private int mes;
    @Column(name = "diaspascua")
    private int diasPascua;
    @ManyToOne
    @JoinColumn(name = "idtipo", referencedColumnName = "id")
    private Tipo tipo;

    @Transient
    private Date fecha;


    public Festivo(String nombre, int dia, int mes, int diasPascua, Tipo tipo) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.diasPascua = diasPascua;
        this.tipo = tipo;
    }
}
