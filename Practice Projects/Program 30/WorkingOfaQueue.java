package www.jagan.learning;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingOfaQueue 
{
public static void main(String[] args)
{
        		Queue<String> queue = new LinkedList<>();
        		queue.add("Bangalore");
        		queue.add("Hyderabad");
        		queue.add("Delhi");
        		queue.add("Noida");
        		queue.add("Chennai");
System.out.println("Queue is : " + queue);
        		System.out.println("Head of Queue : " + queue.peek());
        		queue.remove();
        		System.out.println("After removing Head of Queue : " + queue);
        		System.out.println("Head of queue is :"+ queue.peek());
        		System.out.println("Size of Queue : " + queue.size());
    	}
}
