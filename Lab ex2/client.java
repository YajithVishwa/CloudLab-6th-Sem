import java.rmi.*;
import java.util.*;
public class client
{
 public static void main(String args[]){
try{
	System.out.println("Connected");
System.setProperty("java.rmi.server.hostname","192.168.0.247");
Adder stub=(Adder)Naming.lookup("rmi://192.168.0.248:5000/sonoo"); 
int[] arr=new int[100];
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter how many elements");
n=s.nextInt();
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
System.out.println(stub.add(arr,n));
}catch(Exception e){
System.out.println( e);}
}
}
