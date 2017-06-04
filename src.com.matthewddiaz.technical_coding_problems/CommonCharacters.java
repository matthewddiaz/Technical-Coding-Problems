import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

/**
 * Created by matthewdiaz on 8/31/16.
 */
public class CommonCharacters {

    public void findDistinctValues(File file) throws IOException {
        BufferedReader reader = Files.newBufferedReader(file.toPath());
        int numOfExamples = Integer.parseInt(reader.readLine());
        for(int i = 0; i < numOfExamples; i++){
            String str = reader.readLine();
            String[] list = str.split(" ");
            System.out.println(findDistinctValues(list));
        }
    }

    private String findDistinctValues(String[] strList){
        Map<String, Integer> str1UniqueMap = new HashMap<>();
        String[] reducedList = new String[strList.length];
        for(int index = 0; index < strList.length; index++){
            reducedList[index] = makeStringUnique(strList[index]);
        }

        for(int index = 0; index < strList.length; index++){
            String currentString = reducedList[index];
            for(int i = 0; i < currentString.length(); i++){
                String currentChar = currentString.substring(i, i+1);
                if(!str1UniqueMap.containsKey(currentChar)){
                    str1UniqueMap.put(currentChar, 1);
                }else{
                    int newVal = str1UniqueMap.get(currentChar) + 1;
                    str1UniqueMap.replace(currentChar, newVal);
                }
            }
        }

        List<String> commonStrs = new ArrayList<>();
        str1UniqueMap.forEach((key, val)->{
            if(val == strList.length){
                commonStrs.add(key);
            }
        });

        Collections.sort(commonStrs);
        StringBuffer strBuffer = new StringBuffer();
        commonStrs.forEach((str)->{
            strBuffer.append(str);
        });
        return strBuffer.toString();
    }

    private String makeStringUnique(String str){
        int[] arr = new int[256];
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            arr[c]++;
        }

        StringBuffer buff = new StringBuffer();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 1){
                buff.append((char)i);
            }
        }
        return buff.toString();
    }
}
