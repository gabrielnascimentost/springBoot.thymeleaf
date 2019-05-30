package br.ufjf.dcc193.thymeleaf;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

/**
 * Atividade
 */

@Entity
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "É preciso um título!")
    private String titulo;
    @PositiveOrZero(message = "É preciso 0 ou mais tomates!")
    private Integer tomatoes;

    public Atividade(){

    }
    
    public Atividade(String nome){
        this.titulo = nome;
        this.tomatoes = 0;
    }

    public Atividade(String nome, Integer tomatoes){
        this.titulo = nome;
        this.tomatoes = tomatoes;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the tomatoes
     */
    public Integer getTomatoes() {
        return tomatoes;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param tomatoes the tomatoes to set
     */
    public void setTomatoes(Integer tomatoes) {
        this.tomatoes = tomatoes;
    }

    @Override
    public String toString() {
        return "[{'Título:"+ this.titulo +", Tomates: "+ this.tomatoes+"'}]";
    }


}