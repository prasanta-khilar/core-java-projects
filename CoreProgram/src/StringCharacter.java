import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCharacter {



    public static void main(String[] args) {

        String str = "my name is prasantakhilar";
        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()));

        System.out.println("String value:"+collect);

        List<Map.Entry<String, Long>> collect1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).toList();

        System.out.println("Greater than one :"+ collect1);
        Map.Entry<String, Long> stringLongEntry = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
        System.out.println("String max  Entry :"+stringLongEntry);
    }
}
