import java.util.Scanner;
public class perkenalan{
    public static void main(String[] args) {
        Scanner  userInput = new Scanner(System.in);
        System.out.println("Masukkan nama anda  :");
        String nama = userInput.nextLine();
        System.out.println("Masukkan NIM anda  :");
        String nim = userInput.nextLine();


        System.out.println("Halo !!! nama saya " + nama + ", Dengan NIM " + nim);
    }
}