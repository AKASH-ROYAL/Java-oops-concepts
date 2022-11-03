package taskForoops;
 class Z {
 
	 void z() {
		  System.out.println("class Zz");              
		 }
	 void x() {
		  System.out.println("class Zx");              
		 }
	 void y() {
		  System.out.println("class Zy ");              
		 }
	 }
class	 Const extends  Z{
	 Const() {
		 
		  z();
	      y();
		  x();
	 }
	 
 }
public class Constructor {
	 public static void main(String argu[]) {
		 Const c = new Const();
}
}
