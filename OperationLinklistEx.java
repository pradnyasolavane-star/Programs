package programTaskD3;
import java.util.*;
public class OperationLinklistEx
{

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
         LinkedList<Integer> ll = new LinkedList<>();

         while(true) 
         {
           System.out.println("1.Insertion   2.Deletion   3.Insert at last   4.insert at first  5.Display  6.exit");
           System.out.println("enter your choice:");
  
           int ch = sc.nextInt();
            sc.nextLine();  
  
          switch(ch)
          {
                case 1:
                        System.out.println("\nenter element to add:");
                        int n = sc.nextInt();
                        ll.add(n);
                        break;
          
                case 2:
                         System.out.println("\nenter element to delete:");
                          int n1 = sc.nextInt();
                          int i=ll.indexOf(n1);
                          ll.remove(i);
                         break;
          
                case 3:
                         System.out.println("enter element to insert at last:");
                         int ele=sc.nextInt();
                         ll.addLast(ele);
                         break;
          
                case 4:
                	     System.out.println("enter element to insert at first:");
                         int ele1=sc.nextInt();
                         ll.addFirst(ele1);
                         break;
                         
                case 5:
                	    if(ll.isEmpty())
                	    {
                	    	System.out.println("list is empty");
                	    }
                	    else
                	    {
                           Iterator<Integer> itr=ll.iterator();
                           while(itr.hasNext())
                           {
                        	 System.out.println(itr.next());
                            }
                           System.out.println("");
                	    }
                         break;
          
                case 6:
                        System.out.println("Exit");
                        System.exit(0);
                        break;
          
               default:
                        System.out.println("Invalid choice!");
              }
           
        }
  
	}

}
