class newthread implements Runnable {
	Thread t;
	newthread() {
		t=new Thread(this,"hello");
		System.out.println("child thread:"+t);
		t.start();
	}
	public void run() {
		try{
			for (int n=5;n>0;n--){
				System.out.println(n);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("child");
		}
		System.out.println("exiting child");
	}
}





class current{
	public static void main(String args[]){
		new newthread();

		try{
			for (int n=5;n>0;n--){
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("main");
		}
	}
}