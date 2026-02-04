package Day1;

import java.util.Scanner;

public class sumOfElements {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of elements");
        int n= sc.nextInt();
        int [] arr1= new int[n];
        System.out.println("enter the array elements");
        int sum =0;
        for(int i=0; i<n;  i++)
        {

            arr1[i]= sc.nextInt();
            sum += arr1[i];
        }
        System.out.println(sum);

    }
}
