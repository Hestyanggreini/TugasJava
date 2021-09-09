import java.util.Scanner;

public class Problem1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int bilangan;
        boolean prima = true;
        
        System.out.print("Masukkan Bilangan : ");
        bilangan = scan.nextInt();
        
        for(int i = 2; i <= bilangan/2; i++){
            if(bilangan%i == 0){
                prima = false;
                break;
            }
        }
        if(prima){
            System.out.println(bilangan+" adalah Bilangan Prima");
        }else{
            System.out.println(bilangan+" bukan Bilangan Prima");
        }
    }
}
