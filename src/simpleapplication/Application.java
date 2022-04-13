package simpleapplication;
import java.util.Scanner;
class Application{
 
 public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Choisisser la fonction\n 1 pour maxi  \t 2 pour mini \t3 pour factorielle \t4 pour palindrome");
        int reponse = sc.nextInt();
        MesFonctions mf = new MesFonctions();
        int a, b = 0;
        switch (reponse) {
            case 1:
                System.out.println("Entrer les deux nombres ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Le maximum est:" + mf.maximum(a, b));
		break;
            case 2:
                System.out.println("Entrer les deux nombres ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Le maximum est:" + mf.minimum(a, b));
		break;
            case 3:
                System.out.println("Entrer le nombre");
                a = sc.nextInt();

                System.out.println("Le factoriel est:" + mf.factorielle(a));
		break;
            case 4:
                System.out.println("Entrer le nombre/mot");
                String ch = sc.next();
                if (mf.estPalindrome(ch)) {
                    System.out.println("Le mot saisi est un palindrome");
                } else {
                    System.out.println("Le mot saisi n'est pas un palindrome");
                }
		break;
                
   }
}
}
