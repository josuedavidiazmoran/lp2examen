package com.example.caso_biblioteca.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.caso_biblioteca.entity.Editorial;
import com.example.caso_biblioteca.service.EditorialService;

@Service
public class EditorialServiceImpl implements EditorialService{

	@Autowired
	//private EditorialRepository eRepo;
	
	@Override
	public List<Editorial> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Editorial create(Editorial al) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Editorial read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Editorial update(Editorial al) {
		// TODO Auto-generated method stub
		return null;
	}

}
