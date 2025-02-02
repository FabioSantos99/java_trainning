import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(5);
        list.add(7);
        
        for (Integer x: list) {
            System.out.println(x);
        }
        List<Integer> result = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        System.out.println("---------");
        System.out.println(list.indexOf(4));
        for (Integer y: result) {
            System.out.println(y);
        }

    }
}
