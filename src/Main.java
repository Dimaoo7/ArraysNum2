public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        int[ ] arr = generateRandomArray();
        System.out.println("Задача 1");
        int operation = 0;
        int sum = 0;
        for (int j : arr) {
            operation++;
            sum = sum + j;
            System.out.println(operation + " " + sum );
        }


    }
    public  static  void  task2 () {
        int[ ] arr = generateRandomArray();
        System.out.println("Задача 2");
        int maxOfSum = -1;
        int minOfSum = 210000;

        for (int j : arr) {
            if (maxOfSum < j) {
                maxOfSum = j;
            }

        }
        System.out.println("Максимальная сумма: " + maxOfSum);

        for (int j : arr) {
            if (minOfSum > j) {
                minOfSum = j;
            }

        }
        System.out.println("Минимальныя сумма: "+ minOfSum);
        }

    public static void task3 () {
        int[ ] arr = generateRandomArray();
        System.out.println("Задача 3");

        double sum = 0;
        double average;
        for (int j : arr) {
            sum = sum + j;

        }
        average = sum / 30;
        System.out.println(" Средняя сумма трат за месяц составила "+ average +" рублей");
    }

    public static void task4 () {
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        int i = reverseFullName.length -1;
        for (; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

        }

    }


