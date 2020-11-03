package trainstation;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Person {
	
	String personName; 
	int personAge;
	int personAmount;
	int people;
	
	ArrayList<String> personList = new ArrayList<>();
	
	Scanner scanPeople = new Scanner(System.in);
	
	public abstract void showAmount();
		
		
		

}
