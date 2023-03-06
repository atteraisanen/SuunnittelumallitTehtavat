import java.util.Arrays;
import java.util.List;

public class ListConverterTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five");

        EveryElementStrategy strategy1 = new EveryElementStrategy();
        System.out.println(strategy1.listToString(list));

        EveryOtherElementStrategy strategy2 = new EveryOtherElementStrategy();
        System.out.println(strategy2.listToString(list));

        EveryThirdElementStrategy strategy3 = new EveryThirdElementStrategy();
        System.out.println(strategy3.listToString(list));
    }
}