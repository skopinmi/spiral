public class Spiral {

    public static void main(String[] args) {
        int [] [] result = makeSpiral(5, 6);
        for (int[] a : result) {
            for (int b: a) {
                System.out.print(b + "|");
            }
            System.out.println("");
        }
    }
    public static int [][] makeSpiral (int x, int y) {
        int [][] result = new int[y][x];
        int count = 1;
        int countPer;
        if (y % 2 == 0) {
            countPer = y / 2;}
        else {
            countPer = y / 2 + 1;
        }
        int inPer = 0;

        for (int ii = 0; ii < countPer; ii++) {
            for (int i = inPer; i < x - 1 - inPer; i++) {
                result[inPer][i] = count++;
            }
            for (int i = inPer - 1; i < y - inPer - 2; i++) {
                result[i + 1][x - 1 - inPer] = count++;
            }
            for (int i = x - inPer; i > inPer + 1 ; i--) {
                result[y - 1 - inPer][i - 1] = count++;
            }
            for (int i = y - inPer; i > inPer + 1 ; i--) {
                result[i - 1][inPer] = count++;
            }
            inPer++ ;
        }
        return result;
    }

}
