import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Menambahkan data ke queue / enqueue data / offer data
        queue.add("A");
        queue.add("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        System.out.println(queue);

        // Menghapus data dari queue / dequeue data
        String data = queue.remove();
        System.out.println(data);

        data = queue.poll();
        System.out.println(data);

        System.out.println(queue);

        // Mengambil data dari queue / peek data
        data = queue.peek();
        System.out.println(data);
    }
}
