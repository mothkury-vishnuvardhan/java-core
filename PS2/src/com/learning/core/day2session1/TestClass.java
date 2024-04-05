package com.learning.core.day2session1;

public class TestClass {
	public static void main(String[] args) {
		
		MedicineInfo tablet =new Tablet();
		MedicineInfo syrup=new Syrup();
		MedicineInfo ointment= new Ointment();
		
		tablet.displayLabel();
		syrup.displayLabel();
		ointment.displayLabel();
	}

}
