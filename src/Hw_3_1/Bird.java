package Hw_3_1;

public class Bird {

    public static void main(String[] args) {
        char mark = (char)149;
        sing(mark + "I am walking\n" + mark + "I am flying\n" + mark +"I am singing\n" + mark + "I am a Bird");
    }

    public static void sing(String song){
        System.out.println(song);
    }
}
