import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Classwork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String[] input = scanner.nextLine().split("\\s");
        //List<Integer> numbers =Arrays.stream(input).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
//
        //int n = Integer.parseInt(scanner.nextLine());
        //Collections.reverse(numbers);
//
        //numbers.stream().filter(e -> e % n != 0).forEach(e -> System.out.println(e));


        int n = Integer.parseInt(scanner.nextLine());

        Arrays.stream(Arrays.stream((scanner.nextLine().split("\\s"))).filter(wordWithNLength).forEach(e -> System.out.println(e));

    }


}
