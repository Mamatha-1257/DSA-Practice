/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0)
        {
            int income=sc.nextInt();
            int tax=0;
            if(income>1000000)
                tax=income/4;
            else if(income>100000)
                tax=income/5;
            else if(income>1000)
                tax=income/10;
            System.out.println(tax);
        }
    }
}
