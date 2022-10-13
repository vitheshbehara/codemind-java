import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        String s1;
        s1=Sc.nextLine();
        int word_count=0;
        for(int i=0;i<s1.length();i++)
        {
           char ch=s1.charAt(i);
           if(ch==' ')
             word_count++;
        }
        System.out.println(word_count+1);
    }
}