import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girniz : ");
        int n = scanner.nextInt();
        int factoriyel = 1;

        for (int i =1 ; i<=n; i++){
            factoriyel *= i;

        }
        System.out.println(n + "! =" + factoriyel);

    }
}