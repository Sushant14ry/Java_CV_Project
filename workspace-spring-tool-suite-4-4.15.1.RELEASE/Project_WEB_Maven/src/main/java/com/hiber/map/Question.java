package com.hiber.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	@Column(name = "question_id")
	private int q_id;
	private String question;
	
	@OneToMany(mappedBy = "question",fetch = FetchType.LAZY,cascade =CascadeType.ALL)
	private List<Answer> answer;


	public int getQ_id() {
		return q_id;
	}


	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public List<Answer> getAnswer() {
		return answer;
	}


	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}


	public Question(int q_id, String question, List<Answer> answer) {
		super();
		this.q_id = q_id;
		this.question = question;
		this.answer = answer;
	}


	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
