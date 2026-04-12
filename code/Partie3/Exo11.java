public class Exo11{
    public static void main(String[] args) {
        
        // Trie par selection
                    
       int[] tab = {64, 25, 12, 22, 11};

       for (int i = 0; i < tab.length - 1; i++) {
           int min = i;

           for (int j = i + 1; j < tab.length; j++) {
               if (tab[j] < tab[min]) {
                   min = j;
               }
           }

           int temp = tab[i];
           tab[i] = tab[min];
           tab[min] = temp;
       }
       //afficher 
       for (int x : tab) {
           System.out.print(x + " ");
       }
    }
}