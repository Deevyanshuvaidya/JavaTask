public class Binarysearch{
    public static int binary(int [] arr, int search){
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int mid = left + (right - left)/2;

            if(arr[mid]==search){
                return mid;
            }
            else if(search < arr[mid]){
                right = mid -1;
            }

            else{
                left = mid+1;
            }
        }

        return -1;
    }

    public static void main(String args []){
        int [] sortedarray = {2,5,8,12,16,23,38,56};
        int search = 16;
        int result = binary(sortedarray,search);

        if(result != -1){
            System.out.println("Element found at index : "+result);
        }
        
        else{
            System.out.println("Element not found in given array ");
        }
    }
}