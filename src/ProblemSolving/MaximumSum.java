package ProblemSolving;

public class MaximumSum {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,-1,8};

        int sum = 0;
        for(int i: arr){
            sum+=i;
            if(sum<0)
                sum = 0;
        }
        System.out.println(sum);
    }
}
