package guru.qa;

public class Main {
    public static void main(String[] args) {
        byte byte1 = -1;
        byte byte2 = 127;
        System.out.println("Byte: " + (byte1 - byte2));

        short short1 = -32768;
        short short2 = -1;
        System.out.println("Short: " + (short1 + short2));


        int a = Integer.MAX_VALUE;
        int b = 1;
        System.out.println("Переполнение int: " + (a + b));

        int int1 = 21;
        int int2 = 5;
        int int3 = int1 / int2;
        System.out.println("Int (/): " + int3);
        System.out.println("Int (%): " + int1 % int2);
        System.out.println("Int (/ + %): " + int3 + "," + (int1 % int2));
        if (int1 / int2 == int3 && int2 > 2) {
            System.out.println("Логическое выражение верно!");
        }

        float float1 = 0.5f;
        float float2 = 1.3f;
        float float3 = 0.6f;
        float floatMath = ((float1 + float2) * float3);
        System.out.println("Float: " + floatMath);
        if (floatMath >= 1) {
            System.out.println("Выражение верное: 1 >= " + floatMath);
        } else {
            System.out.println("Выражение не верное");
        }

        double double1 = 100.0d;
        double double2 = 300.0d;
        double double3 = 1.0d;
        int int4 = 1;

        System.out.println("int = 1, double = 1.0 это: " + ((int4 == double3) ? "верно" : "не верно"));

        if (double1 == double2) {
            System.out.println("Не равны");
        } else if (double2 - (double1 * 2) + 1 == ++double1) {
            System.out.println("Все правильно =)");
        } else {
            System.out.println("Ошибка");
        }

        String str1 = "Тут написано жираф";
        String str2 = "Тут написано зебра";
        if (str1 != str2) {
            System.out.println("Текста: " + "*" + str1 + "*" + " и " + "*" + str2 + "*" + " не совпадают");
        }
    }
}
