import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Inserisci il tuo noome");
        String nome = scanner.nextLine();
        System.out.println("Inserisci la tua eta");
        int eta = scanner.nextInt();
        System.out.println("Ciao "+nome+", hai "+ eta+" anni");

        scanner.close();
    }
}
