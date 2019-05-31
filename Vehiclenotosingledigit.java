class Vehiclenotosingledigit
{
public static void main(String arg[])
{
int sum,a,b=1;
for(sum=7746;b>0;)
{
a=sum%10;
b=sum/10;
sum=a+b;
}
System.out.println(sum);
}}