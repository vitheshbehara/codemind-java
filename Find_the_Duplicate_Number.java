import java.util.Scanner;
class String13
{
  public static void main(String args[])
  {
    Scanner Sc=new Scanner(System.in);
    int n,x[],i,j;
    n=Sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
      x[i]=Sc.nextInt();
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(x[i]==x[j])
              System.out.println(x[i]);
        }
    }
  }
}