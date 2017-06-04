import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Your submission should *ONLY* use the following class name
public class Problem
{
    public static void main(String[] args)
    {
        int queueSize = 0;
        int orderIndex = 0;

        Scanner stdin = new Scanner(System.in);
        queueSize = stdin.nextInt();
        orderIndex = stdin.nextInt();
        List<Integer> queue = new ArrayList<>();

       for(int i = 0; i < queueSize; i++){
           queue.add(stdin.nextInt());
       }

        stdin.close();
        calculateForOrder(queue, orderIndex);
    }

    private static void calculateForOrder(List<Integer> queue, int orderIndex){
        int orderPriority = queue.get(orderIndex);
        int time = 0;
        for(int i = 0; i < queue.size(); i++){
            if(queue.get(i) >= orderPriority && i != orderIndex){

            }
        }
        System.out.println(time);
    }

}
