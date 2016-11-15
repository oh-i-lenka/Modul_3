package Hw_3_2;

public class Adder extends Arithmetic {

    static boolean check(Integer a, Integer b){
        if (a >= b) {
            return (true);
        } else {
            return (false);
        }
    }

    public static void main(String[] args) {
        System.out.println(check(10,5));
        System.out.println(check(0,5));
        System.out.println(add(345,1000));
    }
}
