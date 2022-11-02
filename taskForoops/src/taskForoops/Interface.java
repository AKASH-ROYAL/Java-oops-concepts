package taskForoops;

interface Interface1 {
	  public void  Method1();                            // First interface method
	}

	interface  Interface2 {
	  public void  Method2();                       // Second interface method
	}

	
	class DemoClass implements  Interface1,  Interface2 {                  // Multiple interfaces or inheritance
	  public void Method1() {
	    System.out.println("Some text..");
	  }
	  public void Method2() {
	    System.out.println("Some other text...");
	  }
	}

	public class Interface{
	  public static void main(String[] args) {
	    DemoClass myObj = new DemoClass();
	    myObj. Method1();
	    myObj.  Method2();
	  }
	}

 
