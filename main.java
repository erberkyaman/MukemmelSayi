import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        n = input.nextInt();

        for (int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;

            }
        }
        if(sum==n){
            System.out.print(n +" Bir Mükemmel Sayıdır");
        }else {
            System.out.print(n +" Bir Mükemmel Sayı Değildir");
        }

    }
}
