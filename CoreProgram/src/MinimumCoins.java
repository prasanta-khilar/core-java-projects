import java.util.*;

public class MinimumCoins {
    public static void main(String[] args) {
        int amount = 183;
        int[] denominations = {100, 50, 10, 5, 2, 1};

        Map<Integer, Integer> result = new LinkedHashMap<>();

        for (int coin : denominations) {
            if (amount >= coin) {
                int count = amount / coin;  // how many coins of this denomination
                amount = amount % coin;     // remaining amount
                result.put(coin, count);
            }
        }

        // Print the result
        result.forEach((coin, count) ->
                System.out.println(coin + " x " + count)
        );
    }
}
