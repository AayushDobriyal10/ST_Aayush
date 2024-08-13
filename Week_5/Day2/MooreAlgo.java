package Week_5.Day2;

public class MooreAlgo {
    static int mooreAlgorithm(int[] nums){
        int count = 0 ;
        int candidate = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int curr = nums[i];
            if(count==0)
                candidate = curr;
            if(curr==candidate)
                count++;
            else
                count--;
        }
        return candidate;
    }
}
