package com.udea.fechas.fechaFestiva.dominio.tipo;


import jakarta.persistence.*;
import lombok.*;

@Table(name = "tipo")
@Entity(name = "Tipo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String tipo;

    public Tipo(String tipo) {
        this.tipo = tipo;
    }
}
