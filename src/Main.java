public class Main {
    public static void main(String[] args) {
        count(30);
        countDown(30);
        countThree(6);
        countTwo(5);
        figureOne();
        figureTwo();
        figureThree();
    }

    public static void count(int times) {
        int number = 0;
        for(int i = 0; i <= times; i++) {
            System.out.println(number);
            number++;
        }
    }

    public static void countDown(int times) {
        int number = 30;
        for(int i = 0; i <= times; i++) {
            System.out.println(number);
            number--;
        }
    }

    public static void countThree(int times) {
        int number = 0;
        for(int i = 0; i <= times; i++) {
            System.out.println(number);
            number = number + 3;
        }
    }

    public static void countTwo(int times) {
        int number = 10;
        for(int i = 0; i <= times; i++) {
            System.out.println(number);
            number = number - 2;
        }
    }

    public static void figureOne() {
        int max = 1;
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <=max; col++) {
                System.out.print("*");
            }
            System.out.println();
            max++;
        }
    }

    public static void figureTwo() {
        int max = 5;
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <=max; col++) {
                System.out.print("*");
            }
            System.out.println();
            max--;
        }
    }

    public static void figureThree() {
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <=5; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}