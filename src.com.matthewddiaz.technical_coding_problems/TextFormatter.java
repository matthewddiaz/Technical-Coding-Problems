import java.util.ArrayList;
import java.util.List;

/**
 * Created by matthewdiaz on 3/13/17.
 */
public class TextFormatter {
    String[] textJustification(String[] words, int L) {
        StringBuffer buffer = new StringBuffer();
        int index = 0;

        List<String> formattedList = new ArrayList<>();

        while(index < words.length){
            String currentWord = words[index];
            if(buffer.length() == 0 || index == words.length-1){
                buffer.append(currentWord);
                index++;
            }else if((buffer.length() + 1 + currentWord.length()) <= L){
                buffer.append(" " + currentWord);
                index++;
            }else{
                formattedList.add(buffer.toString());
                buffer = new StringBuffer();

            }
        }
        String[] resultArr = new String[formattedList.size()];
        return formattedList.toArray(resultArr);
    }
}
