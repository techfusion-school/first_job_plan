@SuppressWarnings({"unused", "ConstantValue"})
public class PrimitiveTypesAndObjects_0 {

    public static void main(String[] args) {

        // примитивные типы, их размеры (в спеке и в JVM (HotSpot)), области значений
        short b; // 2
        char c; // 2
        byte a; // 4
        int d; // 4
        float e; // 4
        double f; // 8
        long g; // 8

        // представление примитивов в памяти программ (для масок)
        byte mask = -1; // 11111111

        // Integer vs int
        Integer intObj = 100;
        int intPrimitive = 100;
        Double nullableDouble = null;

        // equals & references
        System.out.println(intObj == intPrimitive); // false

        // массив примитивов и массив объектов
        int[] intArr = new int[]{1, 2, 3};
        Integer[] intObjArr = new Integer[]{1, 2, 3};

    }
}
