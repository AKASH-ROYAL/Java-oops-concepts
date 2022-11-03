package taskForoops;

interface Interface1 {
	  public void  Method1();                            // First interface method
	}

	interface  Interface2 {
	  public void  Method2();                       // Second interface method
	}

	
	class A1 implements  Interface1,  Interface2 {                  // Multiple interfaces or inheritance
	  public void Method1() {
	    System.out.println("Some text..");
	  }
	  public void Method2() {
	    System.out.println("Some other text...");
	  }
	}

	public class Interface{
	  public static void main(String[] args) {
	  A1 myObj = new A1();
	    myObj. Method1();
	    myObj.  Method2();
	  }
	}

 
