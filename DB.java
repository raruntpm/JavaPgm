import java.sql.*;



class DB
{
  public static void main(String argv[])
        {

try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 

Connection con =null;
                              
con= DriverManager.getConnection("jdbc:odbc:mydb");
//     ("jdbc:edb://127.1.1.1:5432/mydb","iii","pp")
 Statement st = con.createStatement();
st.executeUpdate("insert into stu values('"+argv[0]+"','"+argv[1]+"')");
ResultSet rs=st.executeQuery("select * from stu");

while(rs.next())
{
System.out.println("Name:"+rs.getString(1)+":"+rs.getString(2));
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}

//string name="prabu";
//insert into stu values('"+name+"','hello how')




