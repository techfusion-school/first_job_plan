import java.util.List;

@SuppressWarnings({"unused", "ConstantValue", "SameParameterValue"})
public class ArithmeticAndControlStructures_1 {

    public static void main(String[] args) {

        int num = 5;
        num++;
        num--;
        --num;
        num += 3;

        // условия
        int a = 5;
        int b = 3;
        if (a == 5 && b == 3) {
            System.out.println("a == 5");
        }

        // циклы
        int counter = 5;
        while (counter-- > 0) {
            System.out.println("counter = " + counter);
        }

        counter = 5;
        for (int i = 0; i < counter; i++) {
            System.out.println("counter = " + counter);
        }

        List<Integer> numList = List.of(1, 2, 3, 4, 5);
        for (Integer i : numList) {
            System.out.println(i);
        }

        do {
            System.out.println("counter = " + counter);
        } while (--counter > 0);

        // switch
        checkBoxSize(BoxSize.SMALL);
    }

    private static void checkBoxSize(BoxSize boxSize) {
        switch (boxSize) { // новый синтаксис https://openjdk.org/jeps/361 заменяет case X: ... break
            case SMALL -> {
                System.out.println("Small box");
            }
            case MEDIUM -> {
                System.out.println("Medium box");
            }
            case LARGE -> {
                System.out.println("Large box");
            }
        }
    }
}

enum BoxSize {
    SMALL,
    MEDIUM,
    LARGE
}
