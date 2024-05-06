// import java.util.Random;

// public class HelloWorld {

//   public int generate(int num){

//     Random  r = new Random();
//     int n = r.nextInt(num);
//     return n;

//   }
//   public static void main(String[] args) {

//     HelloWorld helloWorld = new HelloWorld();
//     System.out.println(helloWorld.generate(10));
    
//   }

// }  

public class HelloWorld {

  public static void main(String[] args) {
    String[] colours = {"White","Blue","Black"};
   
    String[] backGround = colours.clone(); 
    
    for (String s : backGround) {
      System.out.println(s); 
    }
  } 
}