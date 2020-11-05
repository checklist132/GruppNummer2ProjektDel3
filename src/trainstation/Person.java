package trainstation;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Person {
	
	String personName; 
	int personAge;
	int personAmount;
	int people;
	int x;
	int y;
	int g;
	
	/*public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public int getPersonAmount() {
		return personAmount;
	}

	public void setPersonAmount(int personAmount) {
		this.personAmount = personAmount;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}*/

	ArrayList<String> personList = new ArrayList<>();
	
	Scanner scanPeople = new Scanner(System.in);
	
	/*public Person(String personName, int personAge, int personAmount, int people, int x, int y, int g) {
		this.personName = personName;
		this.personAge = personAge;
		this.personAmount = personAmount;
		this.people = people;
		this.x = x;
		this.y = y;
		this.g = g;
	}*/

	public abstract void showAmount();
	
	public abstract void scannerRegister();
		
		

}
