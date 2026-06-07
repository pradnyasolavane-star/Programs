 package programTaskD3;
 import java.util.*;
 import java.util.ArrayList;
 
class StudArraylist
{
	public static void main(String[] args)
	{
            Scanner sc = new Scanner(System.in);
            ArrayList<String> al = new ArrayList<>();
 
         while(true) {
     
         System.out.println("1.Add element  2.Delete element  3.update element  4.Display  5.exit");
         System.out.println("enter your choice:");
     
         int ch = sc.nextInt();
         sc.nextLine();  // ← IMPORTANT: Consume the newline after nextInt()
     
        switch(ch)
        {
           case 1:
             System.out.println("\nenter element to add:");
             String name = sc.nextLine();
             al.add(name);
             break;
             
         case 2:
             System.out.println("\nenter element to delete:");
             String name1 = sc.nextLine();
             al.remove(name1);
             break;
             
         case 3:
                 System.out.println("enter element that needs to be updated:");    
                 String update=sc.next();
                 System.out.println("enter element to  updated:");    
                 String ele=sc.next();
                 int i=al.indexOf(update);
                 if(al.contains(update))
                 {
                	 al.set(i, ele);
                 }
                break;
             
         case 4:
             System.out.println("\nArrayList: " + al);
             System.out.println("");
             break;
             
         case 5:
             System.out.println("Exit");
             System.exit(0);
             break;
             
         default:
             System.out.println("Invalid choice!");
        }
      }
       
   }
}