package itp.instituto.estudianteservice.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;
@Data
@Entity
@Table(name="tbl_estudiantes")
public class Estudiante implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_id" , unique = true ,length = 20, nullable = false)
    private String numberID;


    @Column(name="first_name", nullable=false)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Curso curso;

    private String state;
}
