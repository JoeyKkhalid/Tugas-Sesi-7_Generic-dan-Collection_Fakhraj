import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;

public class Collection {
    public static void main(String[] args) {
        // Contoh ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        System.out.println("ArrayList: " + arrayList);

        // Contoh ArrayDeque
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addLast(2);
        System.out.println("ArrayDeque: " + arrayDeque);
    }
}
