import java.util.Scanner;
class online
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in)
System.out.println("please login with your pin");
int pin=sc.nextInt();
System.out.println("please select the type");
String type=sc.nextline();
switch(type)
{
case'student':
System.out.println("you will get 30% discount");
break
case'diet':
System.out.println("you will get 25% discount on diet foods");
break
case'buffey':
System.out.println("you will get 19% discount on total");
break
default
System.out.println("for regular order 10% ");
}
}
}
