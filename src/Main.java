public class Main {
    public static void main(String[] args) {
        // Домашнее задание 9
        System.out.println("Домашнее задание 9");
        //{ // Задача 1
// Объявите три массива:
// 1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
// 2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 – сразу заполнив его значениями.
// 3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
// с помощью ключевого слова или сразу заполненный элементами.
        //System.out.println("Задача 1");
        //{
        //int[] ints = new int[]{1, 2, 3};
        //double[] doubles = {1.57, 7.654, 9.986};
        //char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        //String[] months = new String[10];
        //int[] numbers = new int[10];

        //for (String month : months) {
        //System.out.println(month);
        //}
        //System.out.println(Arrays.toString(months));
        //}
        //}
        { // Задача 1 и 2 (вар.1)
            // Объявите три массива:
            // 1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
            // 2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 – сразу заполнив его значениями.
            // 3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
            // с помощью ключевого слова или сразу заполненный элементами.
            // Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
            // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива
            // и первым элементом следующего не нужна.
            System.out.println("Задача 1 и 2 (вар.1)");
            {
                int[] ints = new int[]{1, 2, 3};
                for (int i = 0; i < ints.length; i++) {               // или i <= ints.length - 1
                    if (i > 0) {
                        System.out.print(", ");
                    }
                    System.out.print(ints[i]);
                }
                System.out.println();
                double[] doubles = {1.57, 7.654, 9.986};
                for (int i = 0; i < doubles.length; i++) {           // или i <= doubles.length - 1
                    if (i > 0) {
                        System.out.print(", ");
                    }
                    System.out.print(doubles[i]);
                }
                System.out.println();
                char[] chars = new char[]{'a', '+', 'c', '-', 'e', '*', '/'};
                for (int i = 0; i < chars.length; i++) {             // или i <= chars.length - 1
                    if (i > 0) {
                        System.out.print(", ");
                    }
                    System.out.print(chars[i]);
                }
                System.out.println();
            }
        }
        { // Задача 1 и 2 (вар.2)
            // Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
            // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива
            // и первым элементом следующего не нужна.
            System.out.println("Задача 1 и 2 (вар.2)");
            {
                int[] ints = new int[]{1, 2, 3};
                double[] doubles = {1.57, 7.654, 9.986};
                char[] chars = {'a', ')', '!', '-', '@', '#', '%'};
                for (int i = 0; i < ints.length; i++) {
                    if (i < ints.length - 1) {                // или i <= ints.length - 2
                        System.out.print(ints[i] + ", ");
                    } else
                        System.out.print(ints[i]);
                }
                System.out.println();

                for (int i = 0; i < doubles.length; i++) {
                    if (i < doubles.length - 1) {             // или i <= doubles.length - 2
                        System.out.print(doubles[i] + ", ");
                    } else
                        System.out.print(doubles[i]);
                }
                System.out.println();

                for (int i = 0; i < chars.length; i++) {      // или i <= chars.length - 2
                    if (i < chars.length - 1) {
                        System.out.print(chars[i] + ", ");
                    } else
                        System.out.print(chars[i]);
                }
                System.out.println();
            }
        }
        { // Задача 3
            // Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента
            // массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива
            // располагаются на одной строчке, а элементы другого массива – на другой.
            // Запятая между последним элементом одного массива и первым элементом следующего не нужна.
            // (Если во втором задании в консоль у вас вывелся результат:
            // 1, 2, 3
            // 1.57, 7.654, 9.986
            // *произвольные элементы третьего массива*
            // То в третьем задании результат должен быть:
            // 3, 2, 1
            // 9.986, 7.654, 1.57
            // *произвольные элементы третьего массива в обратном порядке*)
            System.out.println("Задача 3");
            {
                int[] ints = new int[]{1, 2, 3};
                double[] doubles = {1.57, 7.654, 9.986};
                char[] chars = {'a', ')', '!', '-', '@', '#', '%'};
                for (int i = ints.length - 1; i >= 0; i--) {        // i-- или i = i - 1
                    System.out.print(ints[i]);
                    if (i > 0) {                                    //(i != 0)
                        System.out.print(", "); //System.out.print(ints[i] + ", ");
                    }
                    //System.out.print(ints[i]);
                }
                System.out.println();

                for (int i = doubles.length - 1; i >= 0; i--) {
                    if (i > 0) {
                        System.out.print(doubles[i] + ", ");
                    } else
                        System.out.print(doubles[i]);
                }
                System.out.println();

                for (int i = chars.length - 1; i >= 0; i--) {
                    System.out.print(chars[i]);
                    if (i > 0) {                                   //(i != 0)
                        System.out.print(", "); //System.out.print(chars[i] + ", ");
                    }
                        //System.out.print(chars[i]);
                }
                System.out.println();
            }
        }
        { // Задача 4
            // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
            // Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
            // Распечатайте результат преобразования в консоль.
            System.out.println("Задача 4");
            {
                int[] ints = new int[]{1, 2, 3};
                for (int i = 0; i < ints.length; i++) {
                    if (ints[i] % 2 != 0) {
                        ints[i]++;                         //ints[i] = ints[i] + 1;
                    }
                    if (i > 0) {
                        System.out.print(", ");
                    }
                    System.out.print(ints[i]);
                }
            }
        }
    }
}