import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by matthewdiaz on 9/1/16.
 */
public class Sequences {

    int arrayMode(int[] sequence) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < sequence.length; index++){
            int currentElement = sequence[index];
            if(map.containsKey(currentElement)){
                int newVal = map.get(currentElement) + 1;
                map.replace(currentElement, newVal);
            }else{
                map.put(currentElement, 0);
            }
        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();

        int reps = 0;
        int mode = 0;
        for (Map.Entry<Integer, Integer> entry: set) {
            int value = entry.getValue();
            if(value > reps){
                reps = value;
                mode = entry.getKey();
            }
        }

        return mode;
    }
}
