package codingBat;

public class Main {

	public static void main(String[] args) {

		System.out.println(Calculator.add(25, 18));

		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();

		System.out.println("(" + person3.localCount + "," + Person.instanceCount + ")");
		// instanceCount static olan variable
		for (int i = 0; i < 10; i++) {
			Person person = new Person();
			System.out.print(Person.instanceCount + "         ");

			System.out.println(person.localCount);
		}
	}

}
/*
 * localCount will only be equal to 1 for each of the objects since it's a
 * separate variable for each object, while instanceCount is shared and will
 * continue to increment to become 4.
 * 
 */
