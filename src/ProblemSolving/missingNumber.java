package ProblemSolving;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9,10};
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr) {
        int n = arr.length;
        int arrSum = 0;
        for(int i:arr){
            arrSum+=i;
        }
        return arrSum-(n*(n+1))/2;
    }
}
