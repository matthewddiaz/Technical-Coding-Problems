package stringProblems;

import java.util.*;

/**
 * Created by matthewdiaz on 7/4/17.
 */
public class ParseWords {

    public static void spamClusterization(String[] requests, int[] ids, double threshold) {
        //key: Integer ID; value: HashSet of unique words
        Map<Integer, Set<String>> map = new TreeMap<>();
        for(int index = 0; index < requests.length; index++){
            String request = requests[index];
            int id = ids[index];
            Set<String> uniqueWords = parseString(request);
            map.put(id, uniqueWords);
        }
        map.entrySet().forEach((entry)->{
            System.out.print("ID: " + entry.getKey() + " ");
            System.out.println("Words: " + entry.getValue());
        });
    }

    //returns a set of all unqiue words in the string
    private static Set<String> parseString(String request){
        Set<String> set = new HashSet<>();

        String[] words = request.split("[^a-zA-Z0-9']+");
        for(String word : words){
            //converting word to all overcase
            String lowerCaseWord = word.toLowerCase();
            if(!set.contains(lowerCaseWord)){
                set.add(lowerCaseWord);
            }
        }

        return set;
    }
}
