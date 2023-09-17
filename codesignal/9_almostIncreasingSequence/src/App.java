

public class App {

    public static boolean isAlmostIncreasingSequence (Integer[] sequence) {
        //? auxiliar variable
        int removalAcount = 0;
        //? check for sequence integers
        for(int i = 0; i < sequence.length - 1; i++) {
            //? can be increasing sequence
            if(sequence[i] >= sequence[i + 1]) {
                removalAcount++;
                if(removalAcount > 1) {
                    return false;
                }

                if(i > 0 && sequence[i - 1] >= sequence[i + 1]) {
                    sequence[i + 1] = sequence[i];
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Integer[] sequence = {1, 3, 2};
        System.out.println(isAlmostIncreasingSequence(sequence));
    }
}
