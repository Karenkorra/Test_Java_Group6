public class Exo15 {

    public static void main(String[] args) {
        int[] tab = {11, 12, 22, 25, 64};

        int result = rechercheBinaire(tab, 22);
        System.out.println(result); // 2

        int result2 = rechercheBinaire(tab, 10);
        System.out.println(result2); // -1 car 10 n'existe pas 
    }

    public static int rechercheBinaire(int[] tab, int element) {
        int g = 0;
        int d = tab.length - 1;

        while (g <= d) {
            int m = g + (d - g) / 2;

            if (tab[m] == element) {
                return m;
            } else if (tab[m] < element) {
                g = m + 1;
            } else {
                d = m - 1;
            }
        }

        return -1;
    }
}