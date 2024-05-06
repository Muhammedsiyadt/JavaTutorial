
class name{

    public int age;

    // This is the constructor.that means suppose we want to exicute any task when we create a object
    // constructor name is same name of the class.that will exicute when creating a object of class
    public name(){
        System.out.println("Constructor is started..");
        age = 21;
    }
}



public class constructor {
    
    public static void main(String[] args) {
        name obj = new name();
        System.out.println(obj.age);
       
    }

}
