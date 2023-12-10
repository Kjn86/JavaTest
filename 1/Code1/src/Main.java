import java.util.Arrays;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        System.out.println(cars.length);

        //------------------------------------------------------------------------
        // initiated a list
        LinkedList<String> list = new LinkedList<>();

        //// add element to list
        list.add("A");

        list.add("B");

        list.add("C");

        list.add(3, "D");

        // print out the list
        System.out.println(list);

        //size out the list
        System.out.println("\nSize out list:"+list.size()+"\n");

        /// change element to list
        list.set(1, "Foo");

        System.out.println("Updated List: " + list);

        /// delete element to list
        list.remove(0);

        System.out.println("List after Index removal " + list);

        list.remove("Foo");

        System.out.println("List after Object removal " + list);

        /// duyet qua các phan tư trong list
        LinkedList<String> list1 = new LinkedList<>(

                Arrays.asList("A", "B", "C", "D", "E")

        );

        // using index to iterate through the list

        for(int index = 0; index < list1.size();index++) {

            System.out.println("Element of list at index " + index + " is: " + list1.get(index));

        }

        // using foreach to iterate through the list

        for(String val : list1) {

            System.out.print(val + "\t");

        }

        ///Chuyển danh sách thành mảng
        Object[] ak1 = list1.toArray();
        System.out.println("\n\nLinkedList: " + list1);
        System.out.println("\nFrom LinkedList to array: " + ak1);

        for (Object val : ak1) {
            System.out.print(val + "\t");
        }

        /// xoa phần tử đầu tiên

        System.out.println("\nLinkedList " + list1);

        list1.removeFirst();

        System.out.println("LinkedList after removal " + list1);

        ///
        /// xoa phần cuối cùng

        System.out.println("\nLinkedList " + list1);

        list1.removeLast();

        System.out.println("LinkedList after removal " + list1);
    }
}