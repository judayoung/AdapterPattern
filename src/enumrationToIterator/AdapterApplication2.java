package enumrationToIterator;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.function.Consumer;

public class AdapterApplication2 {

    public static void main(String[] args) {
        System.out.println("Let's translate old Enumeration to new Iterator!");
        System.out.println();

        Hashtable<String, Integer> nameAgeTable = new Hashtable<>();
        nameAgeTable.put("mom", 48);
        nameAgeTable.put("dad", 50);
        nameAgeTable.put("sun", 18);
        System.out.println(nameAgeTable);
        System.out.println();

        System.out.println("Get Elements one by one by iteraterAdaper");
        Enumeration<Integer> elements = nameAgeTable.elements();
        IteratorAdapter iteratorAdapter = new IteratorAdapter(elements);
        while (iteratorAdapter.hasNext()) {
            System.out.print(iteratorAdapter.next() + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("If iteratorAdapter.remove()...");
        iteratorAdapter.remove();
    }

}
