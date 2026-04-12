public class Exo4{
    public static void main(String[] args) {
       
      
       int i = 1;
       int res = ++i + ++i;
       System.out.println(i);   //3
       System.out.println(res); //5

       /*
        Explication :
            ++i + ++i :

                i = 1

                ++i → i = 2 → 2
                ++i → i = 3 -> 3

            Calcul :
                res = 2 + 3 = 5

            Resultat :
                i = 3
                res = 5
         */

    }
}