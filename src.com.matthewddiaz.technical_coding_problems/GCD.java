import java.util.*;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by matthewdiaz on 10/17/16.
 */
public class GCD {
    public Set<Integer> factorsOfNum(int num){
        Set<Integer> factors = new HashSet<>();
        int divider = 1;
        while(divider <= Math.sqrt(num)){
            if(num % divider == 0){
                factors.add(num / divider);
                factors.add(divider);
            }
            divider = divider + 1;
        }
        return factors;
    }

    public int gcd(int num1, int num2){
        Set<Integer> factors;
        int compareNum;
        if(num1 < num2){
            factors = factorsOfNum(num1);
            compareNum = num2;
        }else{
            factors = factorsOfNum(num2);
            compareNum = num1;
        }

        List<Integer> factorList = factors.stream().sorted().collect(Collectors.toList());
        for(int x = factorList.size() - 1; x >= 0; x--){
            int factor = factorList.get(x);
            if(compareNum % factor == 0){
                return factor;
            }
        }
        return 1;
    }


    public int efficentGCD(int n, int m){
        if(n > m){
            int temp = n;
            n = m;
            m = temp;
        }

        if(n == 0){
            return m;
        }

        return efficentGCD(n, m % n);
    }
}
