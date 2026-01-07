import java.util.stream.Stream;

public class StringRotation {

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "ADCB";

        boolean isRotation = s1.length() == s2.length() && (s1 + s1).contains(s2);

        System.out.println("Is '" + s2 + "' rotation of '" + s1 + "'? " + isRotation);
    }
}
