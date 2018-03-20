package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() throws PersonException{
		
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add( new Course("CISC181",4,eMajor.COMPSI));
		courses.add( new Course("BUAD402",4,eMajor.BUSINESS));
		courses.add( new Course("PHYS245",4,eMajor.PHYSICS));
		
		
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		semesters.add( new Semester(new Date(100,8,28), new Date(100,12,15)));
		semesters.add( new Semester(new Date(190,1,18), new Date(190,5,25)));
		
		ArrayList<Section> sections = new ArrayList<Section>();
		sections.add( new Section(courses.get(0).getCourseID(),semesters.get(0).getSemesterID(),001));
		sections.add( new Section(courses.get(1).getCourseID(),semesters.get(0).getSemesterID(),002));
		sections.add(new Section(courses.get(2).getCourseID(),semesters.get(0).getSemesterID(),003));
		sections.add(new Section(courses.get(0).getCourseID(),semesters.get(1).getSemesterID(),001));
		sections.add(new Section(courses.get(1).getCourseID(),semesters.get(1).getSemesterID(),002));
		sections.add(new Section(courses.get(2).getCourseID(),semesters.get(1).getSemesterID(),003));

		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("that","one", "guy",new Date(), eMajor.CHEM,"Someplace", "(000)-000-0000", "incognito@fib.com"));
		students.add(new Student("some","body", "once",new Date(), eMajor.CHEM,"Someplace", "(000)-000-0000", "incognito@fib.com"));
		students.add(new Student("told","the", "world",new Date(), eMajor.CHEM,"Someplace", "(000)-000-0000", "incognito@fib.com"));
		students.add(new Student("was","gonna", "roll",new Date(), eMajor.CHEM,"Someplace", "(000)-000-0000", "incognito@fib.com"));
		students.add(new Student("me","I", "aint",new Date(), eMajor.CHEM,"Someplace", "(000)-000-0000", "incognito@fib.com"));
		students.add(new Student("the","sharpest", "tool",new Date(), eMajor.CHEM,"Someplace", "(000)-000-0000", "incognito@fib.com"));
		students.add(new Student("in","the", "shed",new Date(), eMajor.CHEM,"Someplace", "(000)-000-0000", "incognito@fib.com"));
		students.add(new Student("she","was", "looking",new Date(), eMajor.CHEM,"Someplace", "(000)-000-0000", "incognito@fib.com"));
		students.add(new Student("kinda","dumb", "with",new Date(), eMajor.CHEM,"Someplace", "(000)-000-0000", "incognito@fib.com"));
		students.add(new Student("her","finger", "and",new Date(), eMajor.CHEM,"Someplace", "(000)-000-0000", "incognito@fib.com"));
		
	}

	@Test
	public void test() {
		
	}
}