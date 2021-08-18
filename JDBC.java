import java.sql.*;
public class Test2
{
public static void main(String []args)
{try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connectioncon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
PreparedStatement ps=con.prepareStatement("insert into new values(?,?)");
ps.setInt(1, 369);
ps.setString(2, "samsung");
int i=ps.executeUpdate();
System.out.println(“added to database”);
   }
catch(Exception e)
{
System.out.println(e);
}
}}

