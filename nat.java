import java.io.*;
import java.util.*;
class nat
{
public static void main(String[] args)
{
int a,b,sum=0;
Scanner s=new Scanner(System.in);
System.out.print("a:");
a=s.nextInt();
System.out.print("b:");
b=s.nextInt();
for(int i=a;i<=b;i++)
{
sum=sum+i;
}
System.out.print("The answer is:"+sum);
}
}
