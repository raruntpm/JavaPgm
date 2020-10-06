class arun
{

int binarySearch(int[] array, int value, int left, int right) {

      if (left > right)

            return -1;

      int middle = (left + right) / 2;

      if (array[middle] == value)

            return middle;

      else if (array[middle] > value)

            return binarySearch(array, value, left, middle - 1);

      else

            return binarySearch(array, value, middle + 1, right);           

}


public static void main(String args[])
{

int a[]={2,3,4,8,10,56,84};
int b;
arun obj=new arun();
b=obj.binarySearch(a,56,0,a.length-1);

	System.out.print(b);

}
}