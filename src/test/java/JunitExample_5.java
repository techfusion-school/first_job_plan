import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@SuppressWarnings("NewClassNamingConvention")
public class JunitExample_5 {

    @Test
    public void shouldCheckNumbersAddition() {
        // given
        int a = 3;
        int b = 8;

        // when
        int sum = a + b;

        // then
        Assertions.assertEquals(11, sum);
    }

    @Test
    public void shouldFilterPositiveValues() {
        // given
        PositiveIntegerFilter positiveIntegerFilter = new PositiveIntegerFilter();

        // when
        List<Integer> positiveIntegers = positiveIntegerFilter.filterValues(List.of(-1, 2, -3, 5));

        // then
        Assertions.assertEquals(List.of(2, 5), positiveIntegers);
    }
}

class PositiveIntegerFilter {

    public List<Integer> filterValues(Collection<Integer> list) {
        return list.stream()
                .filter(num -> num >= 0)
                .toList();
    }
}
