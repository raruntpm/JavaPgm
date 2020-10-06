class newthread implements Runnable {
	Thread t;
	String name;

	newthread(String threadname) {
		name=threadname;
		t=new Thread(this,name);
		System.out.println("new thread:"+t);
		t.start();
	}
	public void run() {
		try{
			for (int n=5;n>0;n--){
				System.out.println(name + ";" +n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("child");
		}
		System.out.println(name +"exiting child");
	}
}

class current{
	public static void main(String args[]){
		new newthread("one");
		new newthread("two");
		new newthread("three");

		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			System.out.println("main");
		}
		System.out.println("main thread exiting");
	}
}