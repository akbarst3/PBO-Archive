public class Soal7 {
    public static void main(String[] args) {
        int[] fisrtArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};

        int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};

        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};

        for (int[][] twoDArray : threeDimensionalArray) {
            System.out.print("{{");
            for (int[] oneDArray : twoDArray) {
                System.out.print("{");
                for (int num : oneDArray) {
                    System.out.print(num + " ");
                }
                System.out.print("} ");
            }
            System.out.println("}}");
        }
    }
}
