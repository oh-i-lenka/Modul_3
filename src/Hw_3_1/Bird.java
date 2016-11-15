package Hw_3_1;

public class Bird {

    public static void main(String[] args) {
        sing("walking");
        sing("flying");
        sing("singing");
        sing("a Bird");
    }

    public static void sing(String song){
       System.out.println((char)149 + "I am " + song);
    }
}
