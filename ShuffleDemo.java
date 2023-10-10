
package com.exe.java;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Shaswat mishra
 */


public class ShuffleDemo {
    public static void main(String arg[])
    {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println("length of the Array: "+arr.length);
        shuffleArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void shuffleArray(int []array)
    {
        Random random=new Random();
        int len=array.length;
        for(int i=len-1;i>0;i--)
        {
            int j=random.nextInt(i+1);
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            
        }
        
        
    }
    
}
