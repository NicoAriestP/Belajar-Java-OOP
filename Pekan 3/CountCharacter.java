public class CountCharacter {
    public static void main(String[] args) {
        char[] matKul = {
            'p', 'e', 'm', 'r', 'o', 'g', 'r', 'a', 'm', 'a',
            'n', 'b', 'e', 'r', 'b', 'a', 's', 'i', 's', 'o',
            'b', 'y', 'e', 'k'
        };

        char target = 'a';
        int count = 0;

        for (int i = 0; i < matKul.length; i++) {
            if (matKul[i] == target) {
                count++;
            }
        }

        System.out.println("Jumlah huruf '" + target + "' dalam array: " + count);
    }
}
