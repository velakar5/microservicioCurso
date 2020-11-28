package com.formacionbdi.microservicios.cursos.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.formacionbdi.microservicios.commons.services.CommonServiceImpl;
import com.formacionbdi.microservicios.cursos.models.entity.Curso;
import com.formacionbdi.microservicios.cursos.models.repository.CursoRepository;

@Service
public class CursoServiceImp extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {

	

}
