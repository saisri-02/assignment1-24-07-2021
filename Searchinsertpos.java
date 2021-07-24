import java.util.*;
public class Searchinsertpos
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size : ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array elements : ");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int s=arr.length;
System.out.println("Enter the element to be inserted : ");
int k=sc.nextInt( );
System.out.println("Position of inserted element : ");
int found=0,pos=-1;
for(int i=0;i<n;i++)
{
if(arr[i]>=k)
{
found=1;
pos=i;
System.out.println(pos);
break;
}
}
}
}

output:

Enter the size : 
4
Enter array elements : 
1 3 5 6
Enter the element to be inserted: 
0
Position of inserted element : 
0

Enter the size : 
4
Enter array elements : 
1 3 5 6
Enter the element to be inserted : 
2
Position of inserted element : 
1
