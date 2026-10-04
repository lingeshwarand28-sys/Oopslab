import java.util.*;

public class ArrayListExample {
    public static void main(String arg[]) {
        ArrayList<String> obj1 = new ArrayList<String>();

        obj1.add("Ajeet");
        obj1.add("Harry");
        obj1.add("Chaitanya");
        obj1.add("steve");
        obj1.add("Anuj");

        System.out.println("\nCurrently the array list obj1 has following elements:" + obj1);

        obj1.add("Babu");
        obj1.add("Kamal");

        ArrayList<String> obj2 = new ArrayList<String>();
        obj2.add("Alice");
        obj2.add("Bob");
        obj2.add("Raj");

        obj1.addAll(obj2);

        System.out.println("\nArrayList obj1 after addAll:" + obj1);

        obj1.add(0, "Rahul");
        obj1.add(0, "Justin");

        System.out.println("\nArrayList obj1 after adding elements at the given index:" + obj1);

        System.out.println("\nEnter the search element:");
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();

        System.out.println("\nArrayList obj1 contains the string " + search + ": " + obj1.contains(search));

        obj1.remove("Chaitanya");
        obj1.remove("Harry");

        System.out.println("\nCurrent array list of obj1 after removing elements is:" + obj1);

        obj1.remove(1);

        System.out.println("\nCurrent array list of obj1 after removing element through index is:" + obj1);

        System.out.println("\nEnter the letter to display all the strings starting with the given letter:");
        search = input.nextLine();

        ArrayList<String> obj3 = new ArrayList<String>();

        for (int i = 0; i < obj1.size(); i++) {
            if (obj1.get(i).toUpperCase().startsWith(search.toUpperCase())) {
                obj3.add(obj1.get(i));
            }
        }

        if (obj3.size() > 0) {
            System.out.println("\nArrayList obj1 contains all the strings starting with given " + search + ": " + obj3);
        } else {
            System.out.println("\nNo name starts with " + search + " letter in ArrayList obj1");
        }

        input.close();
    }
}
