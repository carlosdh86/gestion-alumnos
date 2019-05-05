package com.cice.gestionalumnos.repository.dao;

import com.cice.gestionalumnos.repository.entity.AlumnodOldEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlumnosOldDAO extends JpaRepository<AlumnodOldEntity,Long> {

    Optional<AlumnodOldEntity> findByNombreCompletoAndFechaNacimiento(String nombreCompleto,
                                                                     String fechaNacimiento);
}
