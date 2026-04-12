public class Exo2{
    public static void main(String[] args) {
        int i = 2;
        int res = ++i;
        System.out.println(i);    //3
        System.out.println(res);  //3

        /*
        Explication :
            Pre-Incrementation (++i) :
            → On ajoute +1 d'abord, Apres on utilise la valeur

            ex :
                i = 2
                res = ++i  → i = 3 d'abord
                             res = 3 on utilise

            Résultat :
                i = 3
                res = 3
         */
    }
}