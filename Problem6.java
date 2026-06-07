package programTaskD3;
import java.sql.*;
import java.util.Scanner;

public class Problem6 
{
    static final String URL = "jdbc:mysql://localhost:3306/student";
    static final String USER = "root";
    static final String PASSWORD = "root";
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        while (true) 
        {
            System.out.println("\n1. Insert\n2. Update\n3. Delete\n4. View\n5. Exit");
            System.out.print("Choose: ");
            
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                	    insert();
                	    break;
                case 2:
                	   update();
                	   break;
                case 3:
                	    delete();
                	    break;
                case 4:
                	     view();
                	     break;
                case 5:
                       
                           System.exit(0);
                        
                       break;
               default :System.out.println("Invalid choice!");
            }
        }
    }
    
    static void insert() 
    {
    	Connection conn=null;
    	PreparedStatement pstmt=null;
        try 
        {
             conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.print("Roll: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            
            String sql = "INSERT INTO student2(roll, name, gpa) VALUES(?,?,?)";
            	pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, roll);
                pstmt.setString(2, name);
                pstmt.setDouble(3, gpa);
                pstmt.executeUpdate();
                System.out.println("✓ Inserted!");
            
        } 
        catch (SQLException e)
        {
            System.out.println("✗ Error: " + e.getMessage());
        }
        finally 
        {
        	try 
        	{
        	   if(conn!=null)
        		   conn.close();
        	}
        catch(SQLException e) {System.out.print(e);}
        }
    }
    
    static void update() 
    {
    	 Connection conn=null;
    	PreparedStatement pstmt=null;
        try {
        	 conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.print("Roll to update: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("New Name: ");
            String name = sc.nextLine();
            System.out.print("New GPA: ");
            double gpa = sc.nextDouble();
            
            String sql = "UPDATE student2 SET name=?, gpa=? WHERE roll=?";
           
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, name);
                pstmt.setDouble(2, gpa);
                pstmt.setInt(3, roll);
                
                int rows = pstmt.executeUpdate();
                System.out.println(rows > 0 ? "✓ Updated!" : "✗ Roll not found!");
        } 
        catch (SQLException e) 
        {
            System.out.println("✗ Error: " + e.getMessage());
        }
        finally 
        {
        	try 
        	{
        	   if(conn!=null)
        		   conn.close();
        	}
        catch(SQLException e) {System.out.print(e);}
        }
    }
    
    static void delete()
    {
    	Connection conn=null;
    	PreparedStatement pstmt=null;
        try 
        {
        	conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.print("Roll to delete: ");
            int roll = sc.nextInt();
            
            String sql = "DELETE FROM student2 WHERE roll=?";
            
             pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, roll);
                
                int rows = pstmt.executeUpdate();
                System.out.println(rows > 0 ? "✓ Deleted!" : "✗ Roll not found!");
            
        }
        catch (SQLException e)
        {
            System.out.println("✗ Error: " + e.getMessage());
        }
        finally 
        {
        	try 
        	{
        	   if(conn!=null)
        		   conn.close();
        	}
        catch(SQLException e) {System.out.print(e);}
        }
}
    
    
    static void view()
    {
    	Connection conn=null;
    	
        try 
        {
         conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = "SELECT * FROM student2";
           
            Statement stmt = conn.createStatement();
            
                ResultSet rs = stmt.executeQuery(sql);
               
                System.out.println("\n--- Student Records ---");
                while (rs.next()) 
                {
                    System.out.println("Roll: " + rs.getInt("roll") + 
                                     ", Name: " + rs.getString("name") + 
                                     ", GPA: " + rs.getDouble("gpa"));
            }
        }
        catch (SQLException e) 
        {
            System.out.println("✗ Error: " + e.getMessage());
        }
        finally 
        {
        	try 
        	{
        	   if(conn!=null)
        		   conn.close();
        	}
        catch(SQLException e) {System.out.print(e);}
        }
     }
}