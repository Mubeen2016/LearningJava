package com.learningJava;

public class Datatypes {

	public static void main(String[] args) {
		 double Result = calcFeetAndInchesToCentimeters(6,0);
		 calcFeetAndInchesToCentimeters(100);
		}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches){
	    if ( feet >= 0){
	        if ((inches >= 0 ) && (inches <= 12)){
	            double results = (feet * 30.48) + (inches * 2.54);
	            System.out.println("Feet : " + feet + " " +"Inches : " + inches + "= " + results + "cm");
	            return results;
	        }
	    }
	    System.out.println("invalid feet or inches parameter");
	    return -1;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches){
		if(inches<0){
			return -1;
		}
		double feet =(int)inches/12;
		double remainingInches =(int)inches%12;
		System.out.println(inches+"inches is ewual to"+feet+ "feet and" + remainingInches+"inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}
	 
}
