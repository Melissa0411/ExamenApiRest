package edu.utvt.examen.persistence.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "te_item")
	public class Item {
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Id
		@Column(length = 12)
	    private Long id;
	    
	    @Column(length = 50, nullable = false)
	    private String nombre;
	    
	    
	    private Double precio;

	    @ManyToOne
	    @JoinColumn(name = "persona_id")
	    private Persona persona;
}
