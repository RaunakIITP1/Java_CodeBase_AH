package Day1;

import java.util.Scanner;

public class productOfElements {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int [] arr = new int[n];

//        arr.length will give you the length of the array

        int product= 1;
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
            product*= arr[i];
        }
        System.out.println(product);
    }
}
