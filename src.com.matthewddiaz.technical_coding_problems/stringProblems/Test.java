package stringProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by matthewdiaz on 7/5/17.
 */
public class Test {
    static String decode(String[] codes, String encoded) {
        //NOTE: each code has the following format "letter   code"

        //key is the code; value is the letter.
        //NOTE: Using String and not char because of special case "new line"
        Map<String, String> map = new HashMap<>();

        String firstCode = codes[0];
        StringTokenizer st = new StringTokenizer(firstCode);
        st.nextToken();

        int lengthOfCode = st.nextToken().length();

        for(int index = 0; index < codes.length; index++){
            st = new StringTokenizer(codes[index]);

            String decodedLetter = st.nextToken();
            String code = st.nextToken();

            map.put(code, decodedLetter);
        }

        //will be constructing the decoded string
        StringBuffer buffer = new StringBuffer();

        for(int index = 0; index < encoded.length(); index += lengthOfCode){
            String currentCode = encoded.substring(index, index + lengthOfCode);
            String decodedValue = map.get(currentCode);
            if(decodedValue.equals("[newline]")){
                buffer.append("\n");
            }else{
                buffer.append(decodedValue);
            }
        }
        //convert string buffer to string
        return buffer.toString();
    }

}
