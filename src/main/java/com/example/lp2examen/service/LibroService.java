package com.example.lp2examen.service;

import java.util.List;

import com.example.lp2examen.entity.Libro;

public interface LibroService {

	List<Libro> readAll();

	Libro create(Libro al);

	Libro read(int id);

	void delete(int id);

	Libro update(Libro al);
	
	
}
