public class SumArray {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0.0;
        int[] numbArray = {2,4,6,8,10,12,14,16,18,20};
        for(int i = 0; i < numbArray.length; i++){
            sum = sum + numbArray[i];
        }
        System.out.println("Sum of the numbers in this array is = " + sum);
        average = (double)sum/numbArray.length;
        System.out.println("The average is = " + average);
    }
}
