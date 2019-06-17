package codingBat;

public class Person {
	public static int instanceCount;

	// if it is not static the it belongs to the OBJECT not CLASS, IT ONLY UPDATES 1
	// -> 1 KERE ARTMA OLAYI
	// static koyarsak sinifa ait olur ve loop 1, 2, 3 olarak artis saglar

	public int localCount;

	public Person() {
		instanceCount++; // class a ait
		localCount++; // object e  ait
		
	}
}
