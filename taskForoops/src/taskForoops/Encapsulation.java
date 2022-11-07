package taskForoops;

 class Encapsulation {
	 int a;
	 public int getA() {             // getter method
		return a;
	}
	public void setA(int a) {        //setter method
		this.a = a;
	}
	
 

 public static void main (String[] args) {
	 Encapsulation  a =new Encapsulation();
	
    a.setA(5555);
    int x= a.getA();
	 System.out.println(x);
 }
}
// public int getB() {
//		return b;
//	}
//	public void setB(int b) {
//		this.b = b;
//	}
//	int b;