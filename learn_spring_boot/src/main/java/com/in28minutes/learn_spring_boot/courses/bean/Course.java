package com.in28minutes.learn_spring_boot.courses.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
//@Entity(name = "Course1")
public class Course {
	
	@Id
	@GeneratedValue
	private long id;
//	@Column(name = "course_name")
	private String name;
	private String author;
	
	public Course() {
		
	}
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
