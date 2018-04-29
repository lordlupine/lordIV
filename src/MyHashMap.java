import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<Integer, String>();

        m.put(10, "srujan");
        m.put(20, "ayush");
        m.put(30, "apurva");

        for (Integer integer : m.keySet()) {
            System.out.println(m.get(integer));
        }
        System.out.println(m.containsValue("srujan"));

        m.remove(10);
        System.out.println(m);
        List<? extends Number> l = new ArrayList<Integer>();

        for (Number number : l) {
            System.out.println(number);
        }

        if(m instanceof Map)
        {
            System.out.println("I m hashmap");
        }
        else
        {

            System.out.println("Not hashmap");
        }

    }
}
