class Switch
{
public static void main(String arg[])
{
int a=1;
double b= 1000;
switch(a)
{
case 1:  
        b=b+(20*(b/100));
        System.out.println("mon tue fri"+b);
break;
case 2:
        b=b+(10*(b/100));
        System.out.println("wed thur"+b);
break;
}}}