package br.unicap.estagiario.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private Estagiario estagiario;
	private Coordenador autor;
	private String feedback;
	
	public Feedback(Estagiario e, Coordenador autor, String feedback) {
		super();
		this.estagiario = e;
		this.autor = autor;
		this.feedback = feedback;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Estagiario getE() {
		return estagiario;
	}
	public void setE(Estagiario e) {
		this.estagiario = e;
	}
	public Coordenador getAutor() {
		return autor;
	}
	public void setAutor(Coordenador autor) {
		this.autor = autor;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Feedback [e=" + estagiario + ", autor=" + autor + ", feedback=" + feedback + "]";
	}
}
