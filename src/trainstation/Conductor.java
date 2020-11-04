package trainstation;

public class Conductor extends Person{

	public void scannerRegister(){
		System.out.println("Skriv in din namn tack!: ");
		personName = scanPeople.next();
		personList.add(personName);
		
	}
	
	
	public void showAmount() {
		System.out.println("Tryck 1: Ungdom\nTryck 2: Vuxen\nTryck 3: Pensionär\nTryck 4 Antal personer ombord på tåget");
		people = scanPeople.nextInt();
		
		//System.out.println("Vad är din ålder: ");
		//personAge = scanPeople.nextInt();
		
		
		
		switch(people) {
			case 1:
				System.out.println("Ungdomsbiljett kostar 20 kr och en månadskort kostar 450\nKnappa in 1 för ungdomsbiljett; Knappa in 2 för månadskort. ");
				x = scanPeople.nextInt();
				switch (x) {
				case 1:
					System.out.println("Ungdomsbiljett! " + personList.get(0));
					break;
				case 2:
					System.out.println("Månadskort! " + personList.get(0));
					break;
				}
				break;
			case 2:
				System.out.println("Vuxenbiljett kostar 35 kr och en månadskort kostar 600 kr ");
				switch(y) {
				case 1:
					System.out.println("Ungdomsbiljett! " + personList.get(0));
					break;
				case 2:
					System.out.println("Månadskort! " + personList.get(0));
					break;
				}
				break;
			case 3:
				System.out.println("Pensionärbiljett kostar 20 kr och en månadskort kostar 450");
				switch(g) {
				case 1:
					System.out.println("Ungdomsbiljett! " + personList.get(0));
					break;
				case 2:
					System.out.println("Månadskort! " + personList.get(0));
					break;
				}
				break;
			case 4:
				System.out.println("Så här många personer finns ombord");
				System.out.println(personList);
				System.out.println(personList.size());
				break;		
		}
		
		
		System.out.println("Tack för ditt ärende!");
	}
	
	
	
}
