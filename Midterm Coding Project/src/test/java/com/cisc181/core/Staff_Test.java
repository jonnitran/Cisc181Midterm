package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		ArrayList<Staff> staffs = new ArrayList<Staff>();
		
		staffs.add(new Staff("Jim","bob","sherwood", new Date(), "Address place", "(000)-000-0000", "fakemail@fbi.com", "Midnight", 1, 1000.0, new Date(),eTitle.MR));
		staffs.add(new Staff("Snowy","cold","boi", new Date(), "Address place", "(000)-000-0000", "incognito@fbi.com", "Midnight", 1, 2000.0, new Date(),eTitle.MR));
		staffs.add(new Staff("pam","sue","malarky", new Date(), "Address place", "(000)-000-0000", "fakemail@fbi.com", "Midnight", 1, 5.0, new Date(),eTitle.MR));
		staffs.add(new Staff("dat","boi","boi", new Date(), "Address place", "(000)-000-0000", "fakemail@fbi.com", "Midnight", 1, 9999.0, new Date(),eTitle.MR));
		staffs.add(new Staff("dab","on","haters", new Date(), "Address place", "(000)-000-0000", "fakemail@fbi.com", "Midnight", 1, 2250.0, new Date(),eTitle.MR));

		double predictedAvg = 1000 + 2000+ 5 + 9999 + 2250;
		predictedAvg = predictedAvg / 5;
		
		double realAvg = staffs.get(0).getSalary() + staffs.get(1).getSalary() + staffs.get(2).getSalary() + staffs.get(3).getSalary() + staffs.get(4).getSalary();
		realAvg = realAvg / 5;
		
		assertEquals(predictedAvg,realAvg);
	}	
	
	@Test(expected = PersonException.class)
	public void TestPhone() throws PersonException{
		ArrayList<Staff> staffs = new ArrayList<Staff>();
 
		staffs.add(new Staff("Snowy","cold","boi", new Date(), "Address place", "(00)-000-0000", "incognito@fbi.com", "Midnight", 1, 2000.0, new Date(),eTitle.MR));
	}
	
	
	@Test(expected = PersonException.class)
	public void TestDOB() throws PersonException{
		ArrayList<Staff> staffs = new ArrayList<Staff>();
		 
		staffs.add(new Staff("Snowy","cold","boi", new Date(2,90,85), "Address place", "(00)-000-0000", "incognito@fbi.com", "Midnight", 1, 2000.0, new Date(),eTitle.MR));
	}

}
