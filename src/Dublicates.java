public class Dublicates {
    public static void main(String[] args) {
        int[] arrayOne = new int[10];
        int[] arrayTwo = new int[10];
        //filling first array with random number
        for (int i= 0; i < arrayOne.length; i++){
            arrayOne[i] = (int) (Math.random()*30 );
            System.out.print(arrayOne[i] +  " ");
        }
          System.out.println("\n");
        //filling second array with random numbers
        for (int i= 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = (int) (Math.random() * 30 + 1);
            System.out.print(arrayTwo[i] + " ");
        }
         System.out.println("\n");
        // checking both arrays for Dublicates values and print them out.
        int sameValue;
        for(int i= 0; i < arrayOne.length; i++ ){
            for (int j= 0; j < arrayTwo.length; j++){
                if (arrayOne[i] == arrayTwo[j]){
                    sameValue= arrayOne[i];
                    System.out.println("The same value is : "+sameValue);
                }

            }
        }

    }
}
