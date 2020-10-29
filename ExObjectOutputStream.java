import java.io.*;

class Student implements Serializable
{
        int RollNo;
        String Name, Degree;
        float Perc;

        Student(int RollNo, String Name, String Degree, float Perc)
        {
                this.RollNo = RollNo;
                this.Name = Name;
                this.Degree = Degree;
                this.Perc = Perc;
                }

        public void Show()
        {
                System.out.println("RollNo : "  + RollNo);
                System.out.println("Name   : "  + Name);
                System.out.println("Degree : "  + Degree);
                System.out.println("Perc   : "  + Perc);
                }
        }

class ExObjectOutputStream
{
        public static void main(String argv[]) throws Exception
        {
                FileOutputStream fout = new FileOutputStream("Student.txt");

                ObjectOutputStream out = new ObjectOutputStream(fout);

                Student s = new Student(100,"Sam","MCA",80.45f);
                Student s1 = new Student(100,"Ram","MCA",80.45f);
                s.Show();
                

                out.writeObject(s);
                out.writeObject(s1);
                }
        }
