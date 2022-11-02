package taskForoops;

class A{
	protected  void a() {
	  System.out.println("class A");
	 }
	}
	class B extends A {                                 //simplem inheritance
	 void b() {
	  System.out.println("class B");              
	 }
	}
	class C extends B {									      //multiple inheritance
	 void c() {
	  System.out.println("Class C");
	 }
	}
	class D extends B { 							    //Heirachical inheritance
		 void d() {
		  System.out.println("class D ");
		 }
		}
//	class E extends C,B,A,{ 							    //multiple inheritance is not possible like this
//		 void e() {
//		  System.out.println("class E");
//		 }
//		}
	public class Inheritance{
	 public static void main(String argu[]) {
	 C c_o = new C();
	 D d_o = new D();
	 
	 
	  c_o.a();
	  c_o.b();
	  c_o.c();
	  d_o.d();
	  d_o.b();
	 }
	}

