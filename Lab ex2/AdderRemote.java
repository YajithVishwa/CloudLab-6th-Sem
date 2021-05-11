import java.rmi.*;
import java.rmi.server.*;
public class AdderRemote extends UnicastRemoteObject implements Adder{
 AdderRemote() throws RemoteException{
super();
 }
public int add(int a[],int n){
int i, j, min_idx;
for (i = 0; i < n-1; i++)
{
min_idx = i;
for (j = i+1; j < n; j++)
{
if (a[j] < a[min_idx])
{
min_idx = j;
}
}
int temp = a[min_idx];
a[min_idx] = a[i];
a[i] = temp;
}
for(i=0;i<n;i++)
{
System.out.println(a[i]+"\n");
}
return n;
}
}