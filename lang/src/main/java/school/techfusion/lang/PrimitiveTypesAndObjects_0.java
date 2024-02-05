package school.techfusion.lang;

@SuppressWarnings({"unused", "ConstantValue"})
public class PrimitiveTypesAndObjects_0 {

    public static void main(String[] args) {
        // примитивные типы, их размеры (в спеке и в JVM (HotSpot)), области значений
        boolean a; // 1
        byte b; // 1
        short c; // 2
        char d; // 2
        int e; // 4
        float f; // 4
        double g; // 8
        long h; // 8

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
