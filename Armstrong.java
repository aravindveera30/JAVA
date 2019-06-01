class Arm
{
public static void main(String g[])
{
int a=975,b=0;
int temp=a;
for(;a>0;)
{
b=b+((a%10)*(a%10)*(a%10));
a=a/10;
}
System.out.print(b);
if(temp==b)
{System.out.print("Armstrong");
}
else
{
System.out.print("Not Armstrong");
}
}}