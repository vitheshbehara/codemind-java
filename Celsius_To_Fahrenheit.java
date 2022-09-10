import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int celsius;
        Scanner Sc=new Scanner(System.in);
        celsius=Sc.nextInt();
        double fahrenheit=(1.8)*celsius+32;
        System.out.printf("%.2f",fahrenheit);
    }
}