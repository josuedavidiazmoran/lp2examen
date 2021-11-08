package com.example.lp2examen.service;

import java.util.List;

import com.example.lp2examen.entity.Editorial;

public interface EditorialService {

	List<Editorial> readAll();

	Editorial create(Editorial al);

	Editorial read(int id);

	void delete(int id);

	Editorial update(Editorial al);
	
	
}
