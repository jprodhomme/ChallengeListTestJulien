import java.util.ArrayList;

//import com.sun.xml.internal.xsom.impl.Ref.Term;

//import sun.util.resources.cldr.ext.TimeZoneNames_pt_MZ;

public class ChallengeList {

  /**
  * retourne la moyenne de a et de b
  */
  public static double moyenne(int a, int b){
    double moyenne = 0;
    moyenne = (double)(a+b)/2;
    return moyenne;
  }

  /**
  * retourn le perimetre d'un carre de côté a
  */
  public static int perimetreCarre(int a){
    int square=a*a;
    return square;
  }

  /**
  * retourne vrai si les 2 lettres du début et de la fin sont les mêmes
  * ex "ABCDDFAB" : true
  */
  public static boolean commenceFini(String mot){
    String sub1 = mot.substring(0, 1);
    String sub2 = mot.substring((mot.length() -2), (mot.length()-1));
    if (sub1.equals(sub2)){
      return true;
    } else {
      return false;
    }
  }

  /**
  * retourne vrai si le mot contient des lettres différentes
  * ex "AAAAAA" : false
  * "AAAHAA" : true
  */
  public static boolean nonMonotone(String mot){
    String[]arrayLetters = mot.split("");
     boolean result = true;
    for(String letter: arrayLetters){
      if(!letter.equals(arrayLetters[0])){
       result = true;
      } else result = false;
    }
    return result;
  }

  /**
  * retourne le tarif associé à l'âge :
  * "gratuit" pour les moins de 3 ans
  * "reduit" pour les 3 à 12 ans
  * "plein" pour les autres
  * "erreur" si age négatif
  **/
  public static String tarif(int age){
    String[] priceArray = {"gratuit", "reduit", "plein", "erreur" };

    if(0 <= age && age <= 3){
      return priceArray[0];
    }
    else if(3 < age && age <= 12){
      return priceArray[1];
    }
    else if(age > 12){
      return priceArray[2];
    } 
    else return priceArray[3];
  }

  /**
  * retourne un message correspondant à la température :
  * "ça gèle" si la temperature est négative
  * "ça caille" pour une temperature entre 0 et 5
  * "RAS" pour une temperature en 5 et 90
  * "ça bouille" si la température est supérieure à 90
  * "erreur" si la température est inférieure à -274
  **/
  public static String caGele(int temperature){
    String[] temperatureArray = {"ça gèle", "ça caille", "RAS", "ça bouille", "erreur"};
    
    if( temperature <0  && temperature > -274){
      return temperatureArray[0];
    }
    else if (0 <= temperature && temperature <= 5){
        return temperatureArray[1];
    } 
    else if (temperature > 5 && temperature < 90){
      return temperatureArray[2];
    } 
    else if (temperature > 90) {
        return temperatureArray[3];
    } 
    else {
      return temperatureArray[4];
    }
  }

  /**
  * parcourt le tableau de noms et retourne une liste de tous les noms qui ont une longueur > 2
  **/
  public static String[] filtreShort(String[] noms){
    ArrayList<String> nameList = new ArrayList<String>();

    for(String name:noms){
      if(name.length() > 2){
        nameList.add(name);
      }
    }
    String[] nameArray = nameList.toArray(new String[nameList.size()]);

    return nameArray;
  }

  /**
  * parcourt le tableau de noms et retourne une liste de tous les noms qui commencent par lettre
  **/
  public static String[] filtreLetter(String[] noms, char lettre){
    // TODO @B
    return null;
  }


  /**
  * un exemple
  **/
  public static int squareDigits(int n) {
    String res="";
    for (char digit : (n+"").toCharArray()){
      int d = Character.getNumericValue(digit);
      res = res + (d*d);
    }
    return Integer.parseInt(res);
  }


}
