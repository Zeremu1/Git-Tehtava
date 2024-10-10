import java.util.Scanner;

public class IkaOhjelma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ikäsi on: ");
        int ika = scanner.nextInt();

        if (ika >= 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
        } else {
            System.out.println("Olet aikuinen");
        }

        scanner.close();

    }
}