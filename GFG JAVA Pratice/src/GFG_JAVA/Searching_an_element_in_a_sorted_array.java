package GFG_JAVA;

public class Searching_an_element_in_a_sorted_array {
    public static void main(String[] args) {

        int[] myarr = {1,2,3,4,6};
        int target = 6;

        int res = searchInSorted(myarr,target);
        System.out.println(res);
    }

    static int searchInSorted(int[] arr, int K) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start+(end-start)/2;

            if(K>arr[mid]){
                start = mid+1;
            }

            if(K<arr[mid]){
                end = mid-1;
            }

            if(K==arr[mid]){
                return 1;
            }
        }

        return -1;

    }
}
