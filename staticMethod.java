
class details{
    details(){

    }

    static String name(String name){
        return "His name is " + name;
    }
    
    String age(int age){
        return "Age is " +  age;
    }
}

public class staticMethod {
    
    public static void main(String[] args) {

        details obj = new details();

        // We can invoke without create object.we can call classname.staticMethodName.then assign value in method
        System.out.println(details.name("Siyad"));

        // If we want to invoke other methods and properties we must create object of the class  
        System.out.println(obj.age(21));
        
        
    }
}
