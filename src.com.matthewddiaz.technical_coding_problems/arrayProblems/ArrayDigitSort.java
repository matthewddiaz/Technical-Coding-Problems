package arrayProblems;

/**
 * Created by matthewdiaz on 7/4/17.
 */
public class ArrayDigitSort {
    int[] digitRootSort(int[] a) {
        int[] aux = new int[a.length];
        digitRootSort(a, aux, 0, a.length - 1);
        return a;
    }

    private void digitRootSort(int[] a, int[] aux, int start, int end){
        if(start < end){
            //find middle index
            int mid = (start + end)/2;
            digitRootSort(a, aux, start, mid);
            digitRootSort(a, aux, mid + 1, end);
            digitRootMergeSort(a, aux, start, end);
        }
    }


    private void digitRootMergeSort(int[] a, int[] aux, int start, int end){
        //copying elements to aux
        for(int i = start; i <= end; i++){
            aux[i] = a[i];
        }

        int mid = (start + end)/2;
        //the two comparison points are start and mid

        int leftIndex = start;
        int rightIndex = mid + 1;

        for (int index = start; index <= end; index++){
            //case were leftIndex is greater than mid
            if(leftIndex > mid){
                a[index] = aux[rightIndex++];
            }else if(rightIndex > end){
                a[index] = aux[leftIndex++];
            }//case where left digit-sum is less than or equal to right
            else{
                int leftDigitSum = digitSum(a[leftIndex]);
                int rightDigitSum = digitSum(a[rightIndex]);
                if(leftDigitSum < rightDigitSum){
                    a[index] = aux[leftIndex++];
                }else if(leftDigitSum == rightDigitSum &&
                        a[leftIndex] < a[rightIndex]){
                    a[index] = aux[leftIndex++];
                }else{
                    a[index] = aux[rightIndex++];
                }

            }
        }
    }

    //returns sum of digit
    private int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    //returns max value between two digits
    private int max(int val1, int val2){
        return (val1 >= val2) ? val1 : val2;
    }

}
