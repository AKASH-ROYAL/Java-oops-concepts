package taskForoops;

 class Encapsulation {
	 int a;
	 public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
 
	int b;
 public static void main (String[] args) {
	 Encapsulation  a =new Encapsulation();
	
    a.setA(5);
    int x= a.getA();
	 System.out.println(x);
 }
}
