package com.example.caso_biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.caso_biblioteca.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

}
