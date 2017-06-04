import java.util.ArrayList;
import java.util.List;

/**
 * Created by matthewdiaz on 9/22/16.
 */
public class PermutationFinder {
    public List<String> findAllPermutations(String str){
        return findAllPermutations(str, 0, str.length() - 1);
    }

    private List<String> findAllPermutations(String str, int start, int end){
        if(start >= end){
            List<String> permutation = new ArrayList<>(1);
            permutation.add(str.substring(start, start+1));
        }
        int mid = (start + end)/2;
        List<String> leftList = findAllPermutations(str, start, mid);
        List<String> rightList = findAllPermutations(str, mid+1, end);
        return mergePermutations(leftList, rightList);
    }

    List<String> mergePermutations(List<String> leftList, List<String> rightList){
        List<String> permutations = new ArrayList<>();

        for(int y = 0; y < rightList.size(); y++){
            String rightPermutation = rightList.get(y);
            for(int i = 0; i < leftList.size(); i++){
                String leftPermutation = leftList.get(i);
                for (int x = 0; x <= leftPermutation.length(); x++){
                    String permutation = leftPermutation.substring(0,x) +
                            rightPermutation + leftPermutation.substring(x);
                    permutations.add(permutation);
                }
            }
        }
        return permutations;
    }
}


