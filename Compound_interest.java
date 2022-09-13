import java.util.Scanner;
  
class Main
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        double principle, rate, time;
        principle=Sc.nextDouble();
        rate=Sc.nextDouble();
        time=Sc.nextDouble();
        double CI = principle *
                    (Math.pow((1 + rate / 100), time));
          
        System.out.format("%.2f",CI);
    }
}