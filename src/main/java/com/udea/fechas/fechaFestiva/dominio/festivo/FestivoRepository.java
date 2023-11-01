package com.udea.fechas.fechaFestiva.dominio.festivo;

import com.udea.fechas.fechaFestiva.dominio.festivo.Festivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FestivoRepository extends JpaRepository<Festivo,Long>{
}
