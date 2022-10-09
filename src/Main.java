import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen araç tipini giriniz. \n1.Taksi \n2.Minibüs\n3.Diğer araçlar");
        int vehicle = scanner.nextInt();
        System.out.println("Araç otoparkta kaç saat kaldı?");
        int time = scanner.nextInt();
        switch (vehicle){
            case 1:
                System.out.println("Otopark ücreti : "+ (((time-1) * 5  * 1.20) + 5));
                break;
            case 2:
                System.out.println("Otopark ücreti : "+ (((time-1) * 6  * 1.21) + 6));
                break;
            case 3:
                System.out.println("Otopark ücreti : "+ (((time-1) * 8  * 1.25) + 8));
                break;
            default:
                System.out.println("Yanlış araç tipi girdiniz");
        }

    }
}
