package com.geely.design.principle.openclose;

public class Test {
	public static void main(String[] args) {
		ICourse javaCourse = new JavaCourse(96, "Java从领导企业级电商开发", 348d);
		System.out.println("课程ID:"+javaCourse.getId()+" 课程名称:"+javaCourse.getName()+"\t课程价格:"+javaCourse.getPrice());
	}
}
