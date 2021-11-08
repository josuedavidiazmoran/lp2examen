package com.example.lp2examen.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2examen.entity.Libro;
import com.example.lp2examen.repository.LibroRepository;
import com.example.lp2examen.service.LibroService;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroRepository lRepo;
	
	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return lRepo.findAll();
	}

	@Override
	public Libro create(Libro al) {
		// TODO Auto-generated method stub
		return lRepo.save(al);
	}

	@Override
	public Libro read(int id) {
		// TODO Auto-generated method stub
		return lRepo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		lRepo.deleteById(id);
	}

	@Override
	public Libro update(Libro al) {
		// TODO Auto-generated method stub
		return lRepo.save(al);
	}

}
