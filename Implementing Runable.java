class Frst implements Runnable
{
Thread t;
Frst()
{
t=new Thread(this);
System.out.println("Good Morning");
t.start();
}
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("Good Morning"+i);
try{
t.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}}}}
class sec implements Runnable
{
Thread t;
sec()
{
t=new Thread(this);
System.out.println("hello");
t.start();
}
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("hello"+i);
try{
t.sleep(2000);
}
catch(Exception e)
{
System.out.println(e);
}}}}
class third implements Runnable
{
Thread t;
third()
{
t=new Thread(this);
System.out.println("welcome");
t.start();
}
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("welcome"+i);
try{
t.sleep(3000);
}
catch(Exception e)
{
System.out.println(e);
}}}}
public class Thrrun
{
public static void main(String arg[])
{
new Frst();
new sec();
new third();}}
