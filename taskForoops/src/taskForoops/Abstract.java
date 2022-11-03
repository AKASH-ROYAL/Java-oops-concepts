package taskForoops;
																		//Abstract class
abstract class Alpha {

public abstract void methodB();
public void methodA() {
System.out.println("method A");
}
}
class Beta extends Alpha {
public void methodB() {
System.out.println("Method B");
}
}

public class Abstract {
public static void main(String[] args) {
 Beta beta =new Beta();
beta.methodA();
beta.methodB();
}
}




