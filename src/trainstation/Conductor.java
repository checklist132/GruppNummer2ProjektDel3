package trainstation;

public class Conductor extends Person{

	public void scannerRegister(){
		System.out.println("Skriv in din namn tack!: ");
		
		
		int i = 0;
		while( i < 5) {
		
		personName = scanPeople.next();
		personList.add(personName);
		i++;
		}
		
		
	}
	
	
	public void showAmount() {
		System.out.println("Tryck 1: Ungdom\nTryck 2: Vuxen\nTryck 3: Pension�r\nTryck 4 Antal personer ombord p� t�get");
		people = scanPeople.nextInt();
		
		//System.out.println("Vad �r din �lder: ");
		//personAge = scanPeople.nextInt();
		
		
		switch(people) {
			case 1:
				System.out.println("Ungdomsbiljett kostar 20 kr och en m�nadskort kostar 450\nKnappa in 1 f�r ungdomsbiljett; Knappa in 2 f�r m�nadskort. ");
				x = scanPeople.nextInt();
				switch (x) {
				case 1:
					System.out.println("Ungdomsbiljett! " + personList.get(0));
					break;
				case 2:
					System.out.println("M�nadskort! " + personList.get(0));
					break;
				}
				break;
			case 2:
				System.out.println("Vuxenbiljett kostar 35 kr och en m�nadskort kostar 600 kr ");
				switch(y) {
				case 1:
					System.out.println("Ungdomsbiljett! " + personList.get(0));
					break;
				case 2:
					System.out.println("M�nadskort! " + personList.get(0));
					break;
				}
				break;
			case 3:
				System.out.println("Pension�rbiljett kostar 20 kr och en m�nadskort kostar 450");
				switch(g) {
				case 1:
					System.out.println("Ungdomsbiljett! " + personList.get(0));
					break;
				case 2:
					System.out.println("M�nadskort! " + personList.get(0));
					break;
				}
				break;
			case 4:
				System.out.println("S� h�r m�nga personer finns ombord");
				System.out.println(personList);
				System.out.println(personList.size());
				break;		
		}
		
		
		System.out.println("Tack f�r ditt �rende!");
	}
	
	
	
}
