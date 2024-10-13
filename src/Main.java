import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth;

        System.out.print("Enter your birth month (1-12): ");

        while(!in.hasNextInt()) {
            in.nextLine();
            System.out.print("Please input an integer value between 1 and 12: ");
        }
        birthMonth = in.nextInt();
        while (birthMonth < 1 || birthMonth > 12){
            in.nextLine();
            System.out.print("Please input an integer value between 1 and 12: ");
            if (in.hasNextInt()) {
                birthMonth = in.nextInt();
            }
        }
        System.out.println("Your birth month is: " + birthMonth);

        //while(in.hasNextInt())
    }
}