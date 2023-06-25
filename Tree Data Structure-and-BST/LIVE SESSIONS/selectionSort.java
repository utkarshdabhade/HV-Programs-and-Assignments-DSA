import java.util.Arrays;

public class selectionSort {
    public static void selection(int arr[]){
        for (int i =0; i<arr.length-1;i++) //finding smallest value from unsorted array
        {
            int minIndex = i;
            for (int j = i+1; j<arr.length;j++)
            {
                if (arr[j]<arr[minIndex]) {
                   minIndex = j;
                    
                }                 
                }
                int temp = arr[minIndex];
                   arr[minIndex] = arr[i];
                   arr[i] = temp;
            }
        }
    


public static void main(String[] args) {
    int arr[] = {20,10,30,5,7};
    selection(arr);
    System.out.println(Arrays.toString(arr));
    for (int i=0; i<arr.length; i++)
    {
        System.out.print(arr[i] + " ");
    }
}   
}
 



