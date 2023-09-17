public class FindNumber {
    public static void main(String[] args) {
        int[][] arrayOfInts = {
            { 32, 87, 3, 589 },
            { 12, 1076, 2000, 8 },
            { 622, 127, 77, 955 }
        };

        int target = 1076;
        boolean found = false;
        int row = -1;
        int col = -1;

        for (int i = 0; i < arrayOfInts.length; i++) {
            for (int j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == target) {
                    found = true;
                    row = i;
                    col = j;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Found " + target + " at " + row + ", " + col);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
