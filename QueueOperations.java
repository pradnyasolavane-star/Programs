package programTaskD3;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOperations
{
    
    public static void main(String[] args) 
    {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int ch;
        
        while (true) {
            System.out.println("\n=== QUEUE OPERATIONS ===");
            System.out.println("1. Enqueue (Add)   2.Dequeue 3.peek  4.is empty   5.display   6.exit\n");
           
            System.out.print("Enter choice: ");
            
            ch = sc.nextInt();
            
            switch (ch) {
                case 1:
                    System.out.print("Enter number to enqueue: ");
                    int num = sc.nextInt();
                    queue.offer(num);
                    break;
                
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty!");
                    } 
                    else 
                    {
                        int removed = queue.poll();
                        System.out.println(removed + " removed from queue");
                    }
                    break;
                
                case 3:
                    if (queue.isEmpty()) 
                    {
                        System.out.println("Queue is empty!");
                    } 
                    else
                    {
                        System.out.println("Front element: " + queue.peek());
                    }
                    break;
                
                case 4:
                    if (queue.isEmpty()) 
                    {
                        System.out.println("Queue is empty!");
                    } 
                    else
                    {
                        System.out.println("Queue is not empty!");
                    }
                    break;
                
                case 5:
                    if (queue.isEmpty()) 
                    {
                        System.out.println("Queue is empty!");
                    } 
                    else 
                    {
                        System.out.println("Queue: " + queue);
                    }
                    break;
                
                case 6:
                    System.out.println("Exits");
                    
                    return;
                
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
