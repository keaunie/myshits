package killingfloor;

public class method {

    public static double power(int base, int exponent) {
       if (exponent == 0){
       return 1;
      
       }
       
       return base * power(base, exponent - 1);
        
    }

    public static void main(String[] args) {
        double total = power (2,4);
        System.out.println(total);
    }
}
