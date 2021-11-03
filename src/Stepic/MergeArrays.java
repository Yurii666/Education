package Stepic;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int a1[] = {0,2,2};
        int a2[] = {1,3};
        int a3[] = new int[a1.length + a2.length];
        int count = 0;
        for(int i = 0;i<a1.length;i++){
            a3[count]=a1[i];
            count++;
        }
        System.out.println();
        for(int i=0;i< a2.length;i++){
            a3[count] = a2[i];
            count++;
        }
        Arrays.sort(a3);
        for(int i=0;i<a3.length;i++)
        System.out.print(a3[i]+" ");
    }
}
