package trainstation;

public class Conductor extends Person{

	public void scannerRegister(){
		
		personName = scanPeople.next();
		personList.add(personName);
		System.out.println(personList);
	}
	
	
	public void showAmount() {
		System.out.println("Tryck 1 f�r ungdom\nTryck 2 f�r vuxen\nTryck 3 f�r pension�r\nTryck 4 f�r m�nga personer finns ombord p� t�get");
		people = scanPeople.nextInt();
		
		//System.out.println("Vad �r din �lder: ");
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
				System.out.println("Hur mycket kostar en M�nadskort ");
				break;
			case 3:
				System.out.println("S� h�r m�nga personer finns ombord");
				break;
			case 4:
				System.out.println("S� h�r m�nga personer finns ombord");
				break;
		}
		
	}
	
	
	
}
