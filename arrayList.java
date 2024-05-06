import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Siyad");
        list.add("Sinan");
        list.add("Sabith");
        list.add("Basith");

        // list.remove(0);
        int size = list.size();
        System.out.println(size);
        System.out.println(list); 

        list.add(0,"Haseena");
        list.add(1,"Ebrahim");
        System.out.println(list);

    }
}
