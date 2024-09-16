package org.jsp.manytomanybi;

import java.util.List;

import javax.persistence.*;

@Entity
public class Batch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String batchCode;
	private String trainer;
	private String subject;
	
	@JoinTable(name = "batch_student_info",
			joinColumns = {@JoinColumn(name ="batch_id")},
			inverseJoinColumns = {@JoinColumn(name="std_id")})
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Batch [id=" + id + ", batchCode=" + batchCode + ", trainer=" + trainer + ", subject=" + subject + "]";
	}
	
}
