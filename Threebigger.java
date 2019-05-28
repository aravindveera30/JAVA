class Threebigger{
public static void main (String arg[]){
int a=56,b=40,c=20;
if(a>b)
{
if(a>c)
{
System.out.println("a is big");
}
else if(c>a)
{
System.out.println("c is big");
}
else
{
System.out.println("a&c are greater than b");
}
}
else if(b>a)
{
if(b>c)
{
System.out.println("b is big");
}
else if(c>b)
{
System.out.println("c is big");
}
else
{
System.out.println("b&c are greater than a");
}
}
else if((a>c)&&(b>c))
{
System.out.println("a&b are greater than c");
}
else if((c>a)&&(c>b))
{
System.out.println("c is big");
}
else
{
System.out.println("a,b,c are equal");
}
}}