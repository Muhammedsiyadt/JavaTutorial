
// Inheritance is We created a class. there are many properties and methods 
// we want to use in another class that same methods and properties. 
// We can use Inheritance .
// Extends is a key value pair for inheritance

class Class1 {
    int num = 10;
    int num2 = 20;

    public int sum(int num, int sum2) {
        return num + num2;
    }
}

class Class2 extends Class1 {
    public void print() {
        System.out.println(sum(num, num2));
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Class2 obj = new Class2();
        obj.sum(10, 90);
        obj.print();
    }

}
