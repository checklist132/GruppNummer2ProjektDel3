package trainstation;

public class Conductor extends Person{

	public void showAmount() {
		personName = scanPeople.next();
		personList.add(personName);
		System.out.println(personList);
		
		people = scanPeople.nextInt();
		
		personAge = scanPeople.nextInt();
		
		switch(people) {
			case 1:
				System.out.println("S� h�r m�nga personer finns ombord");
				break;
			case 2:
				System.out.println("Vad kostar en Enkelbiljett ");
				break;
			case 3:
				System.out.println("Hur mycket kostar en M�nadskort ");
				break;
		}
		
	}
	
}
