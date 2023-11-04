// package club-onboarding.javaProblems.trappingRainwater;

public class solution {
    public int trap(int[] A) {
        int[] leftMax = new int [A.length];
        int leftMaxHeight = 0;
        for(int i = 0; i < A.length; i++){
            if(leftMaxHeight < A[i]){
                leftMaxHeight = A[i];
            }
            leftMax[i] = leftMaxHeight;
        }

        int[] rightMax = new int [A.length];
        int rightMaxHeight = 0;
        rightMax[A.length - 1] = 0;
        for(int i = A.length - 2; i >= 0; i--){
            if(rightMaxHeight < A[i + 1]){
                rightMaxHeight = A[i + 1];
            }
            rightMax[i] = rightMaxHeight;
        }

        int waterCapacity = 0;
        for(int i = 1; i < A.length - 1; i++){
            leftMaxHeight = leftMax[i];
            rightMaxHeight = rightMax[i];
            if( leftMaxHeight >= A[i] && rightMaxHeight >= A[i]){
                if(leftMaxHeight > rightMaxHeight){                                                                                                                                       
                    waterCapacity += rightMaxHeight - A[i];
                }
                else{
                    waterCapacity += leftMaxHeight - A[i];
                }
            }
        }
        return waterCapacity;
    }
}