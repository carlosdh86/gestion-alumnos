package com.cice.gestionalumnos.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Data
@Entity
@Table(name = "AlumnoOld")
@NoArgsConstructor
@AllArgsConstructor

public class AlumnodOldEntity {
    @Id
    @GeneratedValue

    @Column(name = "id")
    private long idAlumnoOld;

    @Column(name = "nombreCompleto")
    private String nombreCompleto;

    @Column(name = "fechaNacimiento")
    private String fechaNacimiento;

}
