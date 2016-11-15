package Hw_3_1;

public class Bird {

    public static void main(String[] args) {
        String line1, line2, line3, line4;
        line1 = "I am walking";
        line2 = "I am flying";
        line3 = "I am singing";
        line4 = "I am a Bird";
        sing(line1, line2, line3, line4);
    }

    public static void sing(String line1, String line2, String line3, String line4){
        char mark = (char)149;
        System.out.println(mark + line1 + "\n" + mark + line2 + "\n" + mark + line3 + "\n" + mark + line4);
    }
}
