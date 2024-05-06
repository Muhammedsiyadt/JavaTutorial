public class MethodOverLoading {
    
    public int sum(int num1 , int num2){
        return num1 + num2;
    }

    public int sum(int x , int y , int z){
        return x + y + z;
    }

    public double sum(double a , int b){
        return a + b;
    }
    
    
    
    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        System.out.println(obj.sum(10, 20 , 30));
    }
}
