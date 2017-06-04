package stringProblems;

/**
 * Created by matthewdiaz on 10/23/16.
 */
public class LongestNonDuplicateSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }

        char[] arr = s.toCharArray();

        int[] letterAppearance = new int[26];
        int[] currentSubstringLength = new int[arr.length];

        for(int i = 0; i < letterAppearance.length; i++){
            letterAppearance[i] = -1;
        }

        currentSubstringLength[0] = 1;
        letterAppearance[arr[0] - 97] = 0;

        //int startOfSequence = 0;
        for(int i = 1; i < arr.length; i++){
            char letter = arr[i];
            int offset = letter - 97;
            if(letterAppearance[offset] == -1){
                currentSubstringLength[i] = currentSubstringLength[i - 1] + 1;
            }else{
                currentSubstringLength[i] = i - letterAppearance[offset];
               // startOfSequence += 1;
            }
            letterAppearance[offset] = i;
        }

        int max = currentSubstringLength[0];

        for(int i = 1; i < currentSubstringLength.length; i++){
            System.out.println(currentSubstringLength[i] + " ");
            if(currentSubstringLength[i] > max){
                max = currentSubstringLength[i];
            }
        }
        return max;
    }
}
