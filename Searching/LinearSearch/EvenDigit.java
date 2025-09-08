package Searching.LinearSearch;

public class EvenDigit {
    public static void main(String[] args) {
        int [] nums = {12,2,4786,51,678} ;
        int result = findNumbers(nums);
        System.out.println(result);
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
        
    }
        static boolean even(int nums) {
        int numberOfDigits = digits(nums);
        return numberOfDigits % 2 == 0;
    }
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
}