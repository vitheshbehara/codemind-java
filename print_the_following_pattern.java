import java.util.Scanner;
class Main
{
 public static void main(String[] args)
 {
   Scanner Sc=new Scanner(System.in);

         int r,i,j,k;
         int c=1;
         r=Sc.nextInt();
     
        for(i=0;i<r;i++)
        {
        for(j=r-1;j>i;j--)
        {
            System.out.print(" ");
        }
        for(k=0;k<c;k++)
        {
            System.out.print(c-j);
        }
        c=c+2;
        System.out.println();
        }
      Sc.close();
  }
 }