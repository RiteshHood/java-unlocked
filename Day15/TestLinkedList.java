
import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] arg) {

        // creating the linked list.
        LinkedList<Integer> numbers = new LinkedList<>();

        // Adding some numbers.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        numbers.addFirst(5);
        numbers.addLast(40);
        System.out.println(numbers);
        System.out.println("The element 2nd position: "+numbers.get(2));
        System.out.println("The first element: "+numbers.getFirst());
        System.out.println("The last element: "+numbers.getLast());

        numbers.remove(1);
        numbers.removeFirst();
        numbers.removeLast();
        
        System.out.println("size of the LinkedList: "+numbers.size());
        System.out.println("is empty: " +numbers.isEmpty());


    }
}
