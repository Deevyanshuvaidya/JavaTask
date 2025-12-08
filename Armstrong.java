public class Armstrong{
    public static boolean isarm(int num){
        int original = num;
        int count = 0;

        int temp=num;

        while(temp>0){
            temp/=10;
            count++;
        }
        int sum =0;
        temp = num;

        while(temp>0){
            int digit = temp % 10;
            sum+=Math.pow(digit,count);
            temp/=10;
        }

        return sum == original;
    }

    public static void main(String args[]){
        int number = 153;

        if(isarm(number)){
            System.out.println(number+" is an Armstrong Number.");
        }
        else{
            System.out.println(number+" is not an Armstrong Number.");
        }
    }
}