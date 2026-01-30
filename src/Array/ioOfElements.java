package Array;

import java.util.Scanner;

public class ioOfElements {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of elements");
        int n= sc.nextInt();
        int [] arr1= new int[n];
        System.out.println("enter the array elements");
        for(int i=0; i<n;  i++)
        {

            arr1[i]= sc.nextInt();
        }
        System.out.println("printing the array elements");
        for(int i=0; i<n;  i++)
        {

            System.out.print(arr1[i] + " ");
        }

    }
}
