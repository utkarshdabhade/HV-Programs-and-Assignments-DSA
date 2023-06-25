import java.lang.reflect.Array;

public class binary2 {
    public static int binary(int start, int end, int[] arr, int value){
    while(start<=end){
        int mid= (start+end)/2;
       if(arr[mid] == value)
         {
             return mid;
         }
         if(value<arr[mid]){
//             end = mid -1;
            return binary(start, mid-1, arr,value);
       }
         else{
//             start = mid+1;
return binary(mid+1,end,arr,value);
   }
            
}
    return -1;

}

public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int value=6;
    System.out.println(binary(0, arr.length, arr, value));

}
    
}
