package trainstation;

public class Conductor extends Person{

	public void scannerRegister(){
		
		personName = scanPeople.next();
		personList.add(personName);
		System.out.println(personList);
	}
	
	
	public void showAmount() {
		System.out.println("Tryck 1 för ungdom\nTryck 2 för vuxen\nTryck 3 för pensionär\nTryck 4 för många personer finns ombord på tåget");
		people = scanPeople.nextInt();
		
		//System.out.println("Vad är din ålder: ");
		//personAge = scanPeople.nextInt();
		
		
		
		switch(people) {
			case 1:
				System.out.println("Vad kostar en Enkelbiljett ");
				if (personAge == g) {
					System.out.println("Yes");
				}
				else {
					System.out.println("no");
				}
				break;
			case 2:
				System.out.println("Hur mycket kostar en Månadskort ");
				break;
			case 3:
				System.out.println("Så här många personer finns ombord");
				break;
			case 4:
				System.out.println("Så här många personer finns ombord");
				break;
		}
		
	}
	
	
	
}
