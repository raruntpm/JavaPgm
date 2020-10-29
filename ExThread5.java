import java.sql.*;
class First extends Thread
{
        public void run()
        {
                for (int i=1;i<=5;i++)
                {
                        System.out.println("first = " + i);

    
                System.out.println("End of First");
                }
        }
}
class Second extends Thread
{
        public void run()
        {
                for (int j=1;j<=5;j++)
                {
                        System.out.println("second = " + j);
                        try
                        {
                               // sleep(50);
                                }
                        catch(Exception e)
                        {
                                }
                        }

                System.out.println("End of Second");
                }
        }

class Third extends Thread
{
        public void run()
        {
                for (int k=1;k<=5;k++)
                {
                        System.out.println("third = " + k);
                        try
                        {
                               // sleep(50);
                                }
                        catch(Exception e)
                        {
                                }
                        }

                System.out.println("End of Third ");

                }
        }

class ExThread5
{
        public static void main(String argv[])
        {
                First o1 = new First();
                Second o2 = new Second();
                Third o3 = new Third();

//                o1.setPriority(Thread.MIN_PRIORITY);
                o1.setPriority(10);
//                o2.setPriority(Thread.NORM_PRIORITY);
                o2.setPriority(5);
//                o3.setPriority(Thread.MAX_PRIORITY);
                o3.setPriority(5);

                o1.start();
                o3.start();
                o2.start();


                for (int m=1;m<=5;m++)
                {
                        System.out.println("m = " + m);

                        try
                        {
                                //Thread.sleep(50);
                                }
                        catch(Exception e)
                        {
                                }
                        }

                System.out.println("End of Main");
                }
        }

