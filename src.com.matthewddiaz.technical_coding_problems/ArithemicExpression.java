import java.util.Map;

/**
 * Created by matthewdiaz on 12/19/16.
 */
public class ArithemicExpression {
    public ArithemicExpression(){}

    public boolean isMapCombiniationValid(String str1, String str2, String result, Map<Character, Integer> map){
        String str1NumRep = generateNumberRepresentation(str1, map);
        if(str1NumRep == null){
            return false;
        }

        String str2NumRep = generateNumberRepresentation(str2, map);
        if(str2NumRep == null){
            return false;
        }

        String resultNumRep = generateNumberRepresentation(result, map);
        if(resultNumRep == null){
            return false;
        }

        return areNumbersEquivalent(str1NumRep, str2NumRep, resultNumRep);
    }

    private String generateNumberRepresentation(String str, Map<Character, Integer> map){
        char[] strArr = str.toCharArray();

        StringBuffer numberRepresentation = new StringBuffer();
        for(char letter : strArr){
            Character keyOfLetter = new Character(letter);
            if(!map.containsKey(keyOfLetter)){
                return null;
            }
            numberRepresentation.append(map.get(keyOfLetter));
        }
        return numberRepresentation.toString();
    }

    private boolean areNumbersEquivalent(String s1NumRep, String s2NumRep, String resultNumRep){
        return (convertStringToInteger(s1NumRep) + convertStringToInteger(s2NumRep)
                == convertStringToInteger(resultNumRep));
    }

    private int convertStringToInteger(String str){
        return Integer.parseInt(str);
    }
}
