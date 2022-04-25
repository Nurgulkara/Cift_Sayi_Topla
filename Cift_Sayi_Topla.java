import java.util.Scanner;

public class Cift_Sayi_Topla {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n, toplam=0;

        do {
            System.out.print("Sayi giriniz: ");
            n=inp.nextInt();
            if(n % 2 == 0 && (n & 4) ==0){
                toplam +=n;

            }
        } while (n > 1);
        System.out.println("Toplam: " + toplam);

    }
}
