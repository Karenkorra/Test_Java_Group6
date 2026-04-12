public class Exo12{
    public static void main(String[] args) {
        
                /*Trie a bulles */
        
       int[] tab = {64, 25, 12, 22, 11};

       for (int i = 0; i < tab.length - 1; i++) {
           for (int j = 0; j < tab.length - i - 1; j++) {
               if (tab[j] > tab[j + 1]) {
                   int temp = tab[j];
                   tab[j] = tab[j + 1];
                   tab[j + 1] = temp;
               }
           }
       }
       for (int x : tab) {
           System.out.print(x + " ");
       }

    }
}