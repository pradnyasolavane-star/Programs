package programTaskD3;
import java.util.*;
import java.util.HashMap;
public class StudRecordHashmap
{

 public static void main(String[] args)
{
	         Scanner sc = new Scanner(System.in);

	         HashMap<String, Integer> map = new LinkedHashMap<>();

	         System.out.print("Enter number of records: ");
	         int n = sc.nextInt();
	         sc.nextLine();

	         for(int i = 0; i < n; i++)
	         {
	             System.out.print("Enter student name: ");
	             String name = sc.nextLine();

	             System.out.print("Enter student marks: ");
	             int marks = sc.nextInt();
	             sc.nextLine();

	             map.put(name, marks);
	         }
	         
	         System.out.println("\nStudent Records:");

	         for(Map.Entry<String, Integer> entry : map.entrySet())
	         {
	             System.out.println(entry.getKey() + " : " + entry.getValue());
	         }
	         

	         System.out.print("\nEnter name to search: ");
	         String searchName = sc.nextLine();

	         if(map.containsKey(searchName))
	         {
	             System.out.println("Marks = " + map.get(searchName));
	         }
	         else
	         {
	             System.out.println("Student not found");
	         }

	         sc.close();
	     
      }
}