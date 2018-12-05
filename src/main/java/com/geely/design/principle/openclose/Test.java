package com.geely.design.principle.openclose;

public class Test {
	public static void main(String[] args) {
		ICourse javaCourse = new JavaDiscountCourse(96, "Java从领导企业级电商开发", 348d);
		JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) javaCourse;
		System.out.println("课程ID:"+javaDiscountCourse.getId()+" 课程名称:"+javaDiscountCourse.getName()+"\t课程原价："+javaDiscountCourse.getPrice()+"\t课程折扣价格:"+javaCourse.getPrice());

	}
}
