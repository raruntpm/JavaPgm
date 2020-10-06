class multicatch{

public static void main(String args[]){
try{


int a =args.length;
System.out.println("a=" +a);
int b=40/a;
int c[]={1};
c[43]=99;
}


catch(ArithmeticException e){
System.out.println("divide by 0 "+e);
}

catch(ArrayIndexOutOfBoundsException e){
System.out.println("array index oob: "+e);
}


}
}