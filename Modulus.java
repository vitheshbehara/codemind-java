import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,modulus;
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        
        modulus=a%b;
        
        System.out.println(modulus);
    }
}