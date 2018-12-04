package com.geely.design.principle.openclose;

public class JavaCourse implements ICourse {

	private Integer id;
	private String name;
	private Double price;
	
	
	public JavaCourse(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

}
