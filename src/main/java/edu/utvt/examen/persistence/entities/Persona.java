package edu.utvt.examen.persistence.entities;


import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "te_personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 12)
    private Long id;
    
    @Column(length = 50, nullable = false)
    private String Nombre;
    
	@Column(length = 12)
    private Integer Edad;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private Date fechaNacimiento;
	
	@OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Item> items;

}