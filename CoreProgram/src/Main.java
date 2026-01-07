import java.util.LinkedHashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] denominator = {100,50,10,5,2,1};
        int amount = 185;
        Map<Integer,Integer> result = new LinkedHashMap<>();
        for(int coin : denominator){
            if(amount>=coin){
                int count = amount / coin; // 1
                 amount = amount % coin; //remaining 83
                result.put(coin,count);
            }
        }
        result.forEach(( coin, count)-> System.out.println(coin +":"+count)
    );
    }
}