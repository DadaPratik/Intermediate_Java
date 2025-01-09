package collectionFramework.arrayList;
import java.util.ArrayList;
public class AddingItemsToIndex {

    public static void main(String[] args) {
        ArrayList<String> item = new ArrayList<>();
        item.add("Cappuccino");
        item.add("Chocolates");
        System.out.println(item);
        item.add(0,"Cake");
        item.add(3,"Cookies");
        System.out.println("Updated ArrayList: " + item);
    }
}
