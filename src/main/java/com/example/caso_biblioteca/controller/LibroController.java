package com.example.caso_biblioteca.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.caso_biblioteca.entity.Libro;
import com.example.caso_biblioteca.service.LibroService;

@RestController
@RequestMapping("/api/libro")
public class LibroController {

	@Autowired
	private LibroService libroService;

	@GetMapping("/")
	public String get() {
		return "TODO OK";
	}
	
	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Libro> save(@RequestBody Libro lib) {
		try {
			Libro l = libroService.create(lib);
			return new ResponseEntity<>(l, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
	@GetMapping("/all")
	public ResponseEntity<List<Libro>> list() {
		try {
			List<Libro> list = new ArrayList<>();
			list = libroService.readAll();
			if (list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// BUSCAR {ID}
	@GetMapping("/read/{id}")
	public ResponseEntity<Libro> search(@PathVariable("id") int id) {
		Libro libro = libroService.read(id);
		if (libro.getIdlibro() > 0) {
			return new ResponseEntity<>(libro, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// ELIMINAR
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id) {
		try {
			libroService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// ACTUALIZAR {ID}
	@PutMapping("/update/{id}")
	public ResponseEntity<Libro> update(@RequestBody Libro l, @PathVariable("id") int id) {
		try {
			Libro li = libroService.read(id);
			if (li.getIdlibro() > 0) {
				li.setTitulo(l.getTitulo());
				li.setPaginas(l.getPaginas());
				li.setDescripcion(l.getDescripcion());
				li.setAutor(l.getAutor());
				li.setEditorial(l.getEditorial());

				return new ResponseEntity<>(libroService.create(li), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
