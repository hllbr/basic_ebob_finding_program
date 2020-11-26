
import java.util.Scanner;

/*
ebob_finding_program
 */
public class Main {
    public static int ebob(int a,int b){
        int ebob = 1 ;
        for(int i = 1;i<=a &&i<=b;i++){
            if((a%i==0) && (b%i==0)){
                ebob = i;
            }
        }
        return ebob;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz = ");
        int a = scn.nextInt();
        System.out.println("Lütfen bir sayı giriniz = ");
        int b =scn.nextInt();
        System.out.println("girmiş olduğunuz sayıların ebobu = " +ebob(a, b));
        
        
    }
    
}
