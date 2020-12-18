

public class ThreadMultiDemo {
	public static void main(String args[]) {
		B ob2 = new B();
		A ob1 = new A();

		try { 

			ob2.t.join();ob1.t.join(); 

		} catch (InterruptedException e) {

		System.out.println("Main thread Interrupted");

		}

		System.out.println("Main thread exiting."); }
}

class A implements Runnable {

Thread t;

A() {


t = new Thread(this, "Demo Thread");


t.start(); 

}


public void run() {

try {

for(int i = 25; i > 0; i--) {

System.out.println("CSE " );

Thread.sleep(2000);

}

} catch (InterruptedException e) {

System.out.println("CSE interrupted.");

}

System.out.println("Exiting CSE thread.");

}

}
class B implements Runnable {

Thread t;

B() {


t = new Thread(this, "Demo Thread");
t.start(); 

}


public void run() {

try {

for(int i = 5; i > 0; i--) {

System.out.println("BMS College of Engineering " );

Thread.sleep(10000);

}

} catch (InterruptedException e) {

System.out.println("BMS interrupted.");

}

System.out.println("Exiting BMS thread.");

}

}