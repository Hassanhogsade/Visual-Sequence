public class VisualSequence {

    public static void main(String[] args) {
//here im printing out all the tasks
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
    }
//
    public static void task1() {
//    	number of rows
        for (int i = 0; i < 4; i++) {
//        	number of stars per row
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
//            print new line
            System.out.println();
        }
    }
//
    public static void task2() {
        int count = 1;
//        number of rows
        for (int i = 0; i < 5; i++) {
//        	number of stars per row starting from 1 and increasing per row
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            count++;
//            print new line
            System.out.println();
        }
    }
//
    public static void task3() {
        int count = 5;
//        number of rows
        for (int i = 0; i < 5; i++) {
//        	number of spaces before the stars
            for (int j = count; j > 0; j--) {
                System.out.print(" ");
            }
//            number of stars per row starting from 5 down
            for (int j = 0; j <= 5 - count; j++) {
                System.out.print("*");
            }
            count--;
//            print new line
            System.out.println();
        }
    }
//
    public static void task4() {
        int spaces = 3;
        int stars = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            spaces--;
            stars += 2;
            System.out.println();
        }
    }
//
    public static void task5() {
        int spaces = 3;
        int stars = 1;
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print(count);
            }
            spaces--;
            stars += 2;
            count++;
            System.out.println();
        }
    }
//
    public static void task6() {
        int spaces = 3;
        int stars = 1;
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print(count);
            }
            spaces--;
            stars += 2;
            count++;
            System.out.println();
        }
    }
}

