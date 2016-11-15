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
        check(10,5);
        System.out.println(check(0,5));
    }
}
