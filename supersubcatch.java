class throwdemo {
static void demoproc() {
try {

throw new NullPointerException("demo");
}

catch (NullPointerException e) {
System.out.println("caught inside");
throw e;	//rethrow
}

}

public static void main(String args[]){

try(){
demoproc();
}

catch (NullPointerException e) {
System.out.println("recaught :"+e);
}
}
}