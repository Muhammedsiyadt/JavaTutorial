
// This is a class. School is Name of the class
class School{
    public int id = 123;
    public String name;

    public int showId(){
        return id;
    }

    public String showName(){
       return name;
    }
}

public class Class { 
    public static void main(String[] args) {

        // Creating a new object of class School 
        School object = new School(); 
        // School: This is a class name. In Java, a class serves as a blueprint for objects
        // object: This is a variable name. It's used to reference an instance of the School class.
        // new: This keyword is used to create a new instance of a class. It allocates memory for the object and initializes its fields to their default values.
        // School(): This is a constructor call. Constructors are special methods used for initializing objects.
         

        System.out.println(object.showId());
        object.name = "Siyad";
        object.id = 124;
        System.out.println(object.showName());

    }
}
