class Bingbang
{
public static void main(String arg[])
{
for(int a=1;a<=50;a++)
{
if((a%3==0)&&(a%5==0))
{
System.out.println("BING BANG");
}else
if(a%3==0)
{
System.out.println("BING");
}else
if(a%5==0)
{
System.out.println("BANG");
}else
{
System.out.println(a);
}}}}