class Notedenominations
{
public static void main(String arg[])
{
int a=7800,l=0,m=0,n=0,o=0;
for(int b=1;a>=(b*2000); b++)
{
l=l+1;
}
System.out.println("2000"+"--"+l);
int d=a-(l*2000);
for(int e=1;d>=(e*500);e++)
{
m=m+1;
}
System.out.println("500"+" --"+m);
int f=d-(m*500);
for(int g=1;f>=(g*200);g++)
{
n=n+1;
}
System.out.println("200"+" --"+n);
int h=f-(n*200);
for(int i=1;h>=(i*100);i++)
{
o=o+1;
}	
System.out.println("100"+" --"+o);
}}
	