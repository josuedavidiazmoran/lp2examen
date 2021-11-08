package com.example.lp2examen.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2examen.entity.Autor;
import com.example.lp2examen.service.AutorService;

@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	//private PersonaRepository pRepo;
	
	@Override
	public List<Autor> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autor create(Autor al) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autor read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Autor update(Autor al) {
		// TODO Auto-generated method stub
		return null;
	}

}
