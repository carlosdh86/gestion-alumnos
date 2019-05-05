package com.cice.gestionalumnos.service.impl;

import com.cice.gestionalumnos.repository.dao.AlumnosOldDAO;
import com.cice.gestionalumnos.repository.entity.AlumnodOldEntity;
import com.cice.gestionalumnos.service.AlumnosService;
import com.cice.gestionalumnos.web.dto.AlumnoOldDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.Optional;

@Service
public class AlumnosServicesImpl implements AlumnosService {

    @Autowired
    AlumnosOldDAO alumnosOldDAO;

    @Override
    public AlumnoOldDTO search(AlumnoOldDTO alumno) {
        //String nombreCompleto = alumno.getPrimerApellido()+" "+alumno.getSegundoApellido()+ " " + alumno.getNombre();
        String nombreCompleto = generateFullName(alumno);
        String fechaNacimiento = alumno.getFechaNacimiento();

        AlumnoOldDTO alumnoOldDTO = null;

        Optional<AlumnodOldEntity> alumnoOptional = alumnosOldDAO.findByNombreCompletoAndFechaNacimiento(nombreCompleto, fechaNacimiento);
        if (alumnoOptional.isPresent()) {
            alumnoOldDTO = convertEntityToDto(alumnoOptional.get());
        }
        System.out.println("El DTO es "+alumnoOldDTO);
        return alumnoOldDTO;
    }

    private String generateFullName(AlumnoOldDTO alumno) {
        return String.format("%s %s, %s", alumno.getPrimerApellido(),
                                alumno.getSegundoApellido(),alumno.getNombre());

    }

    private AlumnoOldDTO convertEntityToDto (AlumnodOldEntity entity) {



        return new AlumnoOldDTO();
    }
}
