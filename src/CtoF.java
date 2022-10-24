import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cTemp = 0;
        int fTemp = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the temperature in celsius: ");
            if (in.hasNextInt()) {
                cTemp = in.nextInt();
                in.nextLine();

                fTemp = (cTemp * 9 / 5) + 32;

                System.out.println("The temperature in fahrenheit is: " + fTemp + " degrees");
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid temperature");
            }
        }while(!done);
    }
}