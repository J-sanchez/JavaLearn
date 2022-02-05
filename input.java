import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite sport? ");
        String name = scanner.nextLine();
        System.out.println("Where are you from? ");
        String loc = scanner.nextLine();

        System.out.println("I enjoy: " +name);
        System.out.println("I have never been to " +loc);

    }
}