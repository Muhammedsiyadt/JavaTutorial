
class Shaham {
    String place = "kannur";

    Shaham() {
        System.out.println("Shaham's place is " + place);
    }
}

class Anshad extends Shaham {
    String place = "perinthalmanna";
    void PlaceChange(String place){
        super.place = "palakkad";
        System.out.println("Changed Place to " + place);
    }
}

public class SuperClass {
    public static void main(String[] args) {

        Anshad obj = new Anshad();
        obj.PlaceChange("Wayanad");

    }
}
