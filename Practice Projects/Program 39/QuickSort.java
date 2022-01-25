package www.jagan.learning;

public class QuickSort
{
   
    int partition(int arr[], int low, int high)			// 
    {
        int pivot = arr[high];	//	here pivot is initialized to high(pivot works as duplicate for high) which is at right
        int i = (low-1); // index of smaller element     
        for (int j=low; j<high; j++)
        { 
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1; 	// this will return to pi
    }



    void sort(int arr[], int low, int high)// the values called from main will be passed to here (i.e, arr,0,n-1)
    {
        if (low < high)				// only if low is less than high
        {

            int pi = partition(arr, low, high);

            
            sort(arr, low, pi-1);	// before pi
            sort(arr, pi+1, high);	// afer pi
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1); //calling sort method. the values will go to to sort

        System.out.println("sorted array");
        printArray(arr);
    }
}
