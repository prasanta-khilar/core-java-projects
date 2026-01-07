import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReverseString {
    public static void main(String[] args) {

        String input = "prasanta";
        String reduce = Stream.of(input.split("")).reduce("", (x, y) -> y + x);
        System.out.println(reduce);
        System.out.println("reverse String: " + reduce);

    }
}