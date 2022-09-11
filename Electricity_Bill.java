import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n;
        String s1,s2;
        double bill=0;
        double total=0;
        double netbill=0;
        s1=Sc.nextLine();
        s2=Sc.nextLine();
        n=Sc.nextInt();
        
        if(n<=199)
          bill=(n*1.20);
        else if(n>=200 && n<400)
          bill=(n*1.50);
        else if(n>=400 && n<600)
          bill=(n*1.80);
        else
          bill=(n*2.00);
          if(bill>400)
            netbill=bill*(15/100.0);
            if(netbill>100)
              total=bill+netbill;
            else
              total=bill+netbill+100;
              System.out.printf("%.2f",total);
        
    }
}