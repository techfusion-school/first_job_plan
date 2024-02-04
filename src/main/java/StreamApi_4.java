import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi_4 {

    public static void main(String[] args) {
        List<Integer> source = List.of(-1, 2, -3, 4);

        // map / filter
        List<Integer> result = source.stream()
                .filter(num -> num > 0)
                .map(num -> num * 2)
                .toList();

        System.out.printf("Stream source to result list %s\n", result);

        // коллекторы
        Map<Integer, String> resultHashMap = source.stream()
                .collect(Collectors.toMap(num -> num, Object::toString));

        System.out.printf("Stream source to result hashMap %s\n", result);

        // любой ли цикл можно легко заменить на stream API? Stream reduce API?
        int sum = 0;
        int multiply = 1;
        for (Integer num : List.of(1, 2, 3, 4, 5)) {
            sum += num;
            multiply *= num;
        }
        System.out.printf("Sum = %s, multiply = %s\n", sum, multiply);
    }
}
