import java.util.Scanner;

public class IkaOhjelma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ikäsi on: ");
        int ika = scanner.nextInt();

        if (ika >= 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
            if (ika >= 15) {
                System.out.println("Saat ajaa mopolla");
            }
            if (ika >= 16) {
                System.out.println("Saat ajaa kevarilla");
            }
        } 
        else if (ika == 18) {
            System.out.println("Olet täysi-ikäinen ja saat ajaa autoa");
        } 
        else if (ika >= 65) {
            System.out.println("Olet eläikeläinen");
        } 
        else {
            System.out.println("Olet aikuinen");
            if (ika == 20) {
                System.out.println("Hyvää parikymppistä");
            }
            if (ika == 30) {
                System.out.println("Hyvää kolmekymppistä");
            }
            if (ika == 40) {
                System.out.println("Hyvää nelikymppistä");
            }
            if (ika == 50) {
                System.out.println("Hyvää viisikymppistä");
            }
            if (ika == 60) {
                System.out.println("Hyvää kuusikymppistä");
            }
            if (ika == 70) {
                System.out.println("Hyvää seitsemänkymppistä");
            }
            if (ika == 80) {
                System.out.println("Hyvää kahdeksankymppistä");
            }
            if (ika == 90) {
                System.out.println("Hyvää yhdeksänkymppistä");
            }
        }

        scanner.close();

    }
}