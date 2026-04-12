public class Exo14 {

    public static void main(String[] args) {
        int[] tab = {10, 20, 30, 40};

        if (recherche(tab, 30)) {
            System.out.println("trouvé");
        } else {
            System.out.println("Non trouvé");
        }
    }

    public static boolean recherche(int[] tab, int element) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == element) {
                return true;
            }
        }
        return false;
    }
}