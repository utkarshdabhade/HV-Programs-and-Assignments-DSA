import java.util.Arrays;

public class insertionSort {
public static void insertion(int arr[])
{
    for (int index=1; index<arr.length; index++)
    {
        int current = arr[index];
        int j = index -1;
        while (j>=0 && arr[j]>current)
        {
            arr[j+1]=arr[j];
            j = j-1;
        }
        arr[j+1]=current;
    }



}
public static void main(String[] args) {
    int arr[] = {20,10,30,5,7};
    insertion(arr);
    System.out.println(Arrays.toString(arr));
    for (int i=0; i<arr.length; i++)
    {
        System.out.print(arr[i] + " ");
    }
}    
}
