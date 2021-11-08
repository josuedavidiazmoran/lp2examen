package com.example.caso_biblioteca.service;

import java.util.List;

import com.example.caso_biblioteca.entity.Autor;

public interface AutorService {

	List<Autor> readAll();

	Autor create(Autor al);

	Autor read(int id);

	void delete(int id);

	Autor update(Autor al);
	
}
