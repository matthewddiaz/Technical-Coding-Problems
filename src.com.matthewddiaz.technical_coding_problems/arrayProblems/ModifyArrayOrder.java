package arrayProblems;

/**
 * Created by matthewdiaz on 10/11/16.
 */
public class ModifyArrayOrder {

    /**
     * Question 2: Given at Microsoft Final Interview
     *
     * This method converts the array of the form
     * input: [a1,a2,a3,b1,b2,b3]
     *
     * into the following order
     * output: [a1,b1,a2,b2,a3,b3]
     * @param arr
     * @return
     */
    public String[] modifyOrder(String[] arr){
        int mid = arr.length/2;
        for(int i = 0; i < mid; i++){
            int bPosition = mid + i;
            String bValue = arr[bPosition];
            int endPosition = 2*i + 1;
            for(int x = bPosition; x >= endPosition; x--){
                arr[x] = arr[x-1];
            }
            arr[endPosition] = bValue;
        }
        return arr;
    }
}
