import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = inp.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");
        int[] list =new int[n];
        int i = 1;
        while ( i <= n){
            System.out.println(i + ". Elemanı: ");
            list[i-1] = inp.nextInt();
            i++;
        }
        Arrays.sort(list);
        System.out.print("Sıralama : ");
        for (int j = 0; j<list.length; j++){
            System.out.print(list[j] + " ");
        }
    }
}