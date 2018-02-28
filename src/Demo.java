

public class Demo {

    private static int[] array = new int[5];

    public static void main(String[] args) {


        push(1, 4);
        push(2, 6);
        int i = getValue(2);
        System.out.println(i);


    }

    private static void push(int index, int value) {
        array[index] = value;
    }

    private static int getValue(int index){
        return array[index];
    }


}
