package Day2_Searching;

public class LinearSearch {

    static void main(String[] args) {


        int [] arr = {68, 92, 35, 43, 26};

        int target= 43;

        int index=-1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]== target){
                index= i;
                break;
            }


        }
        if(index!=-1){
            System.out.print("element exist " + index);
        }
        else{
            System.out.print("element does not exist ");
        }
    }
}
