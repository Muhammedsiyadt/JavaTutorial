import java.util.HashMap;


public class HashMapSample {
    
    public static void main(String[] args) {
        HashMap<String, Integer> data = new HashMap<String, Integer>();
        data.put("A", 10);
        data.put("B", 15);
        data.put("C", 20);

        // Get using for add a data
        System.out.println(data.get("A"));
        System.out.println(data.get("B"));
        System.out.println(data.get("C"));

        // Remove using for delete dat 
        data.remove("A");
        System.out.println(data);

        // containsKey Using for check the Key is there ot not
        if(data.containsKey("F")){
            System.out.println("This item is there");
        }else{
            System.out.println("This item is no there");
        }

        // Clear Using For clearing full data in hashmap
        data.clear();
        System.out.println(data);

    }
}
