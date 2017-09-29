public class Solution {

    public static void main(String []args){

        int [] A = {1,2,1,3,4,5,7,6};
        Solution a = new Solution();
        System.out.println(a.findPeak(A));

    }
    /*
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {

        if(A == null || A.length == 0){
            return 0;
        }
        int start = 0;
        int end = A.length -1 ;

        while(start + 1 < end){
            int mid = (end - start)/2 + start;
            if(A[mid] < A[mid - 1]){
                end = mid;
            }
            else if(A[mid] < A[mid + 1]){
                start = mid;
            }
            else{
                return mid;
            }
        }
        if(A[start] > A[end]){
            return start;
        }
        else{
            return end;
        }

    }
}