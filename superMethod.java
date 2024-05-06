
class Color1{

    void getColor(){
        System.out.println("Iam Super Method");
    }
}

class Color2 extends Color1{

    void setColor(){
        super.getColor();
        System.out.println("Iam Child Method");
    }
}



public class superMethod {
    public static void main(String[] args) {
        
        Color2 obj = new Color2();
        obj.setColor();
        

    }
}
