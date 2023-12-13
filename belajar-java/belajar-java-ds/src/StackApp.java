import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // menambahkan elemen ke dalam stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        // menghapus elemen dari stack
        int Pop = stack.pop();
        System.out.println(Pop); // 5

        // mengambil elemen terakhir dari stack
        int elemenTerakhir = stack.peek();
        System.out.println(elemenTerakhir); // 4

        // mengambil ukuran stack
        int ukuran = stack.size();
        System.out.println(ukuran); // 4
    }
}
