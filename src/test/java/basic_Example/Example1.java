package basic_Example;

public class Example1 {
    public static void main(String[] args) {
     int n = 5,r=1;
        for (int i = 1; i <= n; i++) {
            r = i*r;
        }
        System.out.println("Factorial Number is : "+r);
    }
}
