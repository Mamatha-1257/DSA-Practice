import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String[]args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            long mod=(long)1e9+7l;
            long[]A=new long[n];
            for(int i=0;i<n;i++)
                A[i]=sc.nextLong();
            for(int i=0;i<k;i++)
                for(int j=1;j<n;j++)
                    A[j]=(A[j]+A[j-1])%mod;
            for(int i=0;i<n;i++)
                System.out.print(A[i]+" ");
            System.out.println("");
        }
    }
}
