public class Divider {
    public static void main(String[] args){
        int x = 30, y = 90;
        int remainder = remainder(y,x);
        int q = quotient(y,x);
        System.out.println(remainder);
        System.out.println(q);
    }
    public static int remainder(int numerator, int denominator){
        return numerator % denominator;
    }
    public static int quotient(int numerator,int denominator){
        return numerator / denominator;
    }
}
