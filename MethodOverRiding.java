

class Brototype{
    void placement(){
        System.out.println("Brototype");
    }
}

class Bridgeon extends Brototype{
    @Override
    void placement(){
        System.out.println("Bridgeon");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        Bridgeon obj = new Bridgeon();
        obj.placement();
    }
}
