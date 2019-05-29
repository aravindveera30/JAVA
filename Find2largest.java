class Find2largest
{
public static void main (String arg[])
{
int a=10,b=15,c=20;
if((a>b)&&(a>c))
{
  if (b>c)
{
System.out.println("second largest b");
}
else
{
System.out.println("second largest c");
}}
else if ((b>a)&&(b>c))
{
if(a>c)
{
System.out.println("second largest a");
}
else
{
System.out.println("second largest c");
}}
else if (a>b)
{
System.out.println("second largest a");
}
else
{
System.out.println("second largest b");
}}}