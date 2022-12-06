public class MaxTwoDimArray {
    public static void main(String[] args) {
        int [][] TwoDimArray = new int[5][5];

        for(int i = 0; i < TwoDimArray.length; i++){
            for (int j= 0; j < TwoDimArray.length; j++) {
                TwoDimArray[i][j] = (int) (Math.random() * 100 + 1);
                System.out.println(TwoDimArray[i][j]);
            }
        }
        //finding Max
        int sum = 0;
        int max =TwoDimArray[0][0];
        for(int i = 0; i < TwoDimArray.length; i++){
            for (int j= 0; j < TwoDimArray[i].length; j++) {
                sum += TwoDimArray[i][j];
                if (TwoDimArray[i][j] > max){
                    max = TwoDimArray[i][j];
                }
            }
        }
        System.out.println("Max is :" + max);
        //finding Min
        int min =TwoDimArray[0][0];
        for(int i = 0; i < TwoDimArray.length; i++){
            for (int j= 0; j < TwoDimArray[i].length; j++) {
                if (TwoDimArray[i][j] < min){
                    min = TwoDimArray[i][j];
                }
            }
        }
        System.out.println("Min is :" + min);
        System.out.println("The sum is :" + sum);
    }
}
