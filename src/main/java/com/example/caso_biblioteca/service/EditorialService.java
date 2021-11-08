package com.example.caso_biblioteca.service;

import java.util.List;

import com.example.caso_biblioteca.entity.Editorial;

public interface EditorialService {

	List<Editorial> readAll();

	Editorial create(Editorial al);

	Editorial read(int id);

	void delete(int id);

	Editorial update(Editorial al);
	
	
}
