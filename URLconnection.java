import java.io.*;
import java.net.*;
class connection 
{
public static void main(String[] args){
try
{
URL url=new URL("https://developers.virustotal.com/reference#file-search");
URLConnection urlcon=url.openConnection();
InputStream stream=urlcon.getInputStream();
int i;
while((i=stream.read())!=-1)
{
System.out.print((char)i);
}
}
catch(Exception e){System.out.println(e);}
}
}
