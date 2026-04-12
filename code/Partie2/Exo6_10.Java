public class Exo6_10 {
    public static void main(String[] args) {
        int[] tab = {4, 2, 1, 9, 0};   //1 . Declaration Tableau

        int somme = 0;
        int min = tab[0];
        int max = tab[0];
        int[] tabC = new int[tab.length];

        // 'affichage de tous les element' + 'calcul Somme' + 'recherche max et min'
        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");

            somme = somme + tab[i];

            if (tab[i] > max) {
                max = tab[i];
            }
            if (tab[i] < min){
                min = tab[i];
            }

            tabC[i] = tab[i];
        }

        System.out.println("\nSomme : " + somme); //16
        System.out.println("Max = " + max);       //9
        System.out.println("Min = " + min);       //0

    }
}