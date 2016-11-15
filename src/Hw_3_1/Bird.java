package Hw_3_1;

public class Bird {

    public static void main(String[] args) {
        sing("I am walking");
        sing("I am flying");
        sing("I am singing");
        sing("I am a Bird");
    }

    public static void sing(String song){
       System.out.println((char)149 + song);
    }
}
