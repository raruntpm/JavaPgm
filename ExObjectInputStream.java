import java.io.*;

class ExObjectInputStream
{
        public static void main(String argv[]) throws Exception
        {
                FileInputStream fin = new FileInputStream("Student.txt");

                ObjectInputStream in = new ObjectInputStream(fin);

                Student s1 = (Student) in.readObject();
                Student s2 = (Student) in.readObject();
                s1.Show();
                s2.Show();
                }
        }
