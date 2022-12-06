import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] maxArray = new int[10];
        int max = 0;
        int min = 100;
        //Random rand = new Random();
       // int num = rand.nextInt(10) + 1;
        for (int i= 0; i < maxArray.length ; i++){
           maxArray[i] = (int) (Math.random()*100 + 1);// maxArray[i] = num;
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
    }
}
