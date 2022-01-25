package www.jagan.learning;
public class SingleAndMultiArrays 
{
	public static void main(String[] args) 
    {
		//single dimension array
		int arr[]= {9,15,16,143,13};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		//Two dimensional array
        int[][] arrNew = { { 0, 2 }, { 4, 6 } }; 
  
        for (int i = 0; i < 2; i++) 
        {               
            for (int j = 0; j < 2; j++) 
            {           
                System.out.print(arrNew[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 

}

