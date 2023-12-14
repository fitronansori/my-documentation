import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);

        // addFirst -> menambahkan data di awal
        list.addFirst("Z");
        System.out.println(list);

        // addLast -> menambahkan data di akhir
        list.addLast("Z");
        System.out.println(list);

        // menghapus data di awal
        list.removeFirst();
        // menghapus data di akhir
        list.removeLast();
        // menghapus data di index tertentu
        list.remove(2);

        System.out.println(list);
    }
}
