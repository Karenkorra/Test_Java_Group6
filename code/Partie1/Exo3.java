
public class Exo3{
    public static void main(String[] args) {
        int i = 5;
        int res = i++ + ++i;
        System.out.println(i);   //7
        System.out.println(res); //12

        /*
        Explication :
            i++ + ++i :

                i = 5

                i++  →  5, apres i = 6
                ++i  → i = 7 avant, apres on utilise la valeurr 7

            Calcul :
                res = 5 + 7 = 12

            Resultat :
                i = 7
                res = 12
         */

    }
}