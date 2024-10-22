import java.util.Queue;
import java.util.LinkedList;

public class Queues {
public static void main(String[] args){
    Queue<String> queue = new LinkedList<String>();
    queue.offer("Subhan");
    queue.offer("Arham");
    queue.offer("Salaar");
    queue.offer("Madara Uchiha");
    queue.offer("Luffy");
    queue.offer("Roronoa Zoro");
    // queue.poll();
    // System.out.println(queue.isEmpty());
    // System.out.println(queue.size());
    // System.out.println(queue.contains("Luffy"));
    // System.out.println(queue.contains("Talha"));
    System.out.println(queue);
    // System.out.println(queue.peek());

    }
}