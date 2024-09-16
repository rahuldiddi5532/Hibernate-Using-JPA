package com.jsp.manytooneuni;

import javax.persistence.*;

@Entity
public class AnswerData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String ansBy;
	
	private String ans;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private QuestionData question;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnsBy() {
		return ansBy;
	}

	public void setAnsBy(String ansBy) {
		this.ansBy = ansBy;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public QuestionData getQuestion() {
		return question;
	}

	public void setQuestion(QuestionData question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "AnswerData [id=" + id + ", ansBy=" + ansBy + ", ans=" + ans + "]";
	}
	
	
}
