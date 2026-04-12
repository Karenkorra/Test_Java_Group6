public class Exo13{
    public static void main(String[] args) {
                /* trie par insertion */

       int[] tab = {64, 25, 12, 22, 11};

       for (int i = 1; i < tab.length; i++) {
           int cle = tab[i];
           int j = i - 1;

           while (j >= 0 && tab[j] > cle) {
               tab[j + 1] = tab[j];
               j = j - 1;
           }

           tab[j + 1] = cle;
       }
       for (int x : tab) {
           System.out.print(x + " ");
       }

    }
}