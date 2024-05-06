
class One{

    One(){
        System.out.println("Super Constructor");
    } 
}

class Two extends One{

    Two(){
        super();
       
    }
}

public class superConstructor {
    public static void main(String[] args) {

        Two obj = new Two();

    }
}
