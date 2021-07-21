
public class Person 
	 {
	 static int x=10;

	 void increment()
	 {
	 x = x + 1;
	 }
	 
	 	 
		

	public static void main(String[] args) {
		Person t1 = new Person();
		 Person t2 = new Person();
		 System.out.println(Person.x);
		 t1.increment();
		 t2.increment();
		 System.out.println(t1.x);
		 System.out.println(t2.x);
	}



	}


