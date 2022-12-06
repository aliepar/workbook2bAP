import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] maxArray = new int[10];
        int max = 0;
        int min = 100;
        int sum = 0;
        for (int i= 0; i < maxArray.length ; i++){
           maxArray[i] = (int) (Math.random()*100 + 1);
           sum += maxArray[i];
            if(maxArray[i] > max){
                max = maxArray[i];
            }
            if (maxArray[i] < min){
                min = maxArray[i];
            }
            System.out.println(maxArray[i]);
        }
        System.out.println("The Max number in this array is : " + max);
        System.out.println("The Min number in this array is :" + min);
        System.out.println("The Sum of the elements of the array is :" + sum);
    }
}
