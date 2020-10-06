class throwsdemo {
	static void demoproc() throws NullPointerException {

		System.out.println("inside throwone");
		throw new NullPointerException("demo");	// it has no try catch block.so caller must guard itself

	}

	public static void main(String args[]){

		try{
			demoproc();
		}

		catch (NullPointerException e) {
			System.out.println("caught :"+e);
		}
	}
}