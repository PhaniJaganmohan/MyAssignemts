package www.jagan.learning;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){

        int[] arr = {20,320,420,520,550,600};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int searchValue = sc.nextInt();
            int result = (int) linear(arr,searchValue);

            if(result==-1){

                System.out.println("Element not in the array");
            } else {

                System.out.println("Element found at "+result);
            }


        }




public static int linear(int arr[], int x) {

   
    for (int i = 0; i < arr.length; i++) {

        if (arr[i] == x) {

            return i;

         }
     }

            return -1;

   }

}
