public class Secondsmallest{
    public static int findSecondsmalles(int[] arr){
        if(arr.length< 2){
            System.out.print("Array must contain at least 2 element.");
            return 0;
        }
        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;

        for(int num : arr){
            if (num < small){
                secondsmall = small;
                small = num;
            }
            else if(num > small && num < secondsmall){
                secondsmall = num;
            }
        }

        if(secondsmall == Integer.MAX_VALUE){
            System.out.println("No second element found.");
            return 0;
        }

        return secondsmall;
    }

    public static void main(String args[]){
        int[] numbers = {5,2,8,3,1,6};
        System.out.println("Second Smallest Element : "+findSecondsmalles(numbers));
    }
}