import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n;

        // eleman sayısı kullanıcıdan alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Sıralanacak Eleman Sayısı: ");
        n = input.nextInt();

        // boş liste oluşturulur
        int[] liste = new int[n];

        // liste eleman sayısı kadar kullanıcıdan girdi alınır.
        for(int i= 0; i< liste.length ; i++){
            System.out.print(i + ". elemanı giriniz: ");
            liste[i] = input.nextInt();

        }
        System.out.println("Liste: " + Arrays.toString(liste));
        Arrays.sort(liste); // liste küçükten büyüğe sıralanır
        System.out.println("Listeni küçükten büyüğe sıralanmış hali: " + Arrays.toString(liste));
    }
}