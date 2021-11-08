package com.example.lp2examen.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "editoriales")
public class Editorial implements Serializable{

	private static final long serialVersionUID = 8739503533530437481L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ideditorial;
	
	private String editorial;
	
	//Relaciones
	
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "editorial")
	@JsonIgnore
	private List<Libro> libro = new ArrayList<>();
	
}