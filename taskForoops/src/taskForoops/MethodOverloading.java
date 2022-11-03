package taskForoops;

class ClassA{
	void a(String str) {						//by passing arguments
		System.out.println("ClassA   "+ str);
	}
	void ab(){									//Method to override
		System.out.println("ClassA ab");
	}
}

class ClassB extends ClassA{
	void a(int x) {
		System.out.println("ClassB    "+ x);
	}
	void ab(){
		System.out.println("ClassB ab");
	}
}
public class MethodOverloading {
	public static void main(String [] argu) {
		
	//method Overloading
	ClassB b =new ClassB();
	b.a("Akash");
	b.a(05);
	//method Overriding
	 ClassA a2 =new ClassA();
	 a2.ab();
    ClassA a1  =new ClassB();
    a1.ab();
   
    
}
}