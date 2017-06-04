import java.util.Arrays;

public class Main {

    private static class Human{
        String name;
        int age;

        public String toString(){
            return "name: " + name + ", age: " + age;
        }
    }

    public static void main(String[] args) {
        String input = "07:05:45PM";
        TimeConverter timeConverter = new TimeConverter();
        String convertedTime = timeConverter.convertTime(input);
        System.out.println(convertedTime);
        int value = 10;
        changeVariable(value);
        System.out.println(value);
        int arr[] = {3,1,15,16};
        changeElementInArray(arr);
        System.out.println(Arrays.toString(arr));

        Human matt = new Human();
        matt.name = "matt";
        matt.age = 21;

        System.out.println(matt.toString());
        changeName(matt);
        System.out.println(matt.toString());
        changeHuman(matt);
        System.out.println(matt.toString());
    }



    private static void changeVariable(int value){
        value = 5;
        System.out.println("Value of this var in the method" + value);
    }

    private static void changeElementInArray(int[] arr){
        arr[3] = 14;
    }

    private static void changeName(Human human){
        human.name = "mario";
    }

    private static void changeHuman(Human human){
        human = new Human();
        human.name = "drake";
    }

}

