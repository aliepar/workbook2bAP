import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        int[] testArray= {2,4,5,6,7,8,9,34,56,12,10,24,17,19};
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a random number");
        int newNumber = userInput.nextInt();
        boolean found = false;
        for (int i = 0; i < testArray.length; i ++) {
            if (newNumber == testArray[i]) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Value " + newNumber + " is found in this array");
        } else {
            System.out.println("Value " + newNumber + " is not found in this array");
        }
    }
}
