
class parameter{

    public String name;
    public int age;

    public parameter(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}


public class prameterizedConstructor {
    
    public static void main(String[] args) {
        parameter object = new parameter("shaham", 23);
    }
}
