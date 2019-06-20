class Secondelementarray
{
public static void main(String arg[])
{
int a[]={2,1,3,5,9,8,16,18,10,4};
int max=0,min=0;
for(int x=0;x<a.length;x++)
{
if(a[x]>max)
{
max=a[x];
}}
System.out.println(max);
for(int x=0;x<a.length;x++)
{
if(a[x]!=max)
{
if(a[x]>min)
{
min=a[x];
}}}
System.out.print(min);
}}	