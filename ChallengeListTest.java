import java.util.Arrays;
public class ChallengeListTest{



  /**
  * Les tests sont à écrire ici.
  * Il peut y avoir plusieurs assert pour chaque methode testée.
  */


  public static void testMoyenne(){
      assertEquals("ok-->la moyenne",12,ChallengeList.moyenne(10,14));
      assertEquals("ok-->la moyenne",12,ChallengeList.moyenne(12,12));
      assertEquals("ok-->la moyenne",12,ChallengeList.moyenne(8,16));
      assertEquals("ok-->la moyenne",12,ChallengeList.moyenne(6,18));
      assertEquals("ok-->la moyenne",12,ChallengeList.moyenne(4,20));
    //throw.error("fucku");
  }

  public static void testPerimetreCarre(){
    assertEquals("OK -->perimetre", 4, ChallengeList.perimetreCarre(2));
    assertEquals("OK -->perimetre", 1, ChallengeList.perimetreCarre(1));
    assertEquals("OK -->perimetre", 9, ChallengeList.perimetreCarre(-3));
  }

  public static void testCommenceFini(){
    assertTrue("OK -->testCommence", ChallengeList.commenceFini("bebe"));
    assertFalse("OK -->testCommence", ChallengeList.commenceFini("java"));

  }

  public static void testNonMonotone(){
    assertTrue("OK --> testMonotone", ChallengeList.nonMonotone("babababa"));
    assertTrue("OK --> testMonotone", ChallengeList.nonMonotone("bbbababa"));
    assertFalse("OK --> testMonotone", ChallengeList.nonMonotone("aaaaaaaaaa"));
  }

  public static void testTarif(){
    a   faire;
  }

  public static void testCaGele(){
    assertEquals("ok-->temperature","ça gèle", ChallengeList.caGele(-1));
    assertEquals("ok-->temperature","ça caille", ChallengeList.caGele(1));
    assertEquals("ok-->temperature","RAS", ChallengeList.caGele(10));
    assertEquals("ok-->temperature","ça bouille", ChallengeList.caGele(91));
    assertEquals("ok-->temperature","erreur", ChallengeList.caGele(-274));
    assertEquals("ok-->temperature","erreur", ChallengeList.caGele(-300));
  }

  public static void testFiltreShort(){
    // TODO @B
  }

  // public static void testFiltreLetter(){
  //   String[] nameArray = {"annabelle","jaques"};
  //   assertEquals("ok-->temperature", "annabelle", ChallengeList.filtreLetter(nameArray, 'a'));
  // }


  /**
  * un exemple de test
  */
  public static void testSquareDigits(){
    assertEquals("SquareDigits un seul chiffre", 16, ChallengeList.squareDigits(4));
    assertEquals("SquareDigits plusieurs chiffres", 811181, ChallengeList.squareDigits(9119));
  }


  /****************************************************************************
  * NE PAS TOUCHER CE QUI SUIT
  **/
  public static void main(String[] args){
    testMoyenne();
    testPerimetreCarre();
    testCommenceFini();
    testNonMonotone();
    testSquareDigits();
    testTarif();
    testCaGele();
    testFiltreShort();
    testFiltreLetter();
  }
  public static void assertEquals(String message, String expected, String res){
    if(expected.equals(res)){
      System.out.print("\nOK >> " + message);
    } else {
      throw new Error(
          "\nKO!! >> " + message + " (exp : " + expected + ", res : " + res + ")");
    }
  }

  public static void assertEquals(String message, String[] expected, String[] res) {
    if (java.util.Arrays.deepEquals(expected, res)) {
      System.out.println("\nOK >> " + message);
    } else {
      throw new Error(
          "\nKO!! >> " + message + " (exp : " + Arrays.toString(expected) + ", res : " + Arrays.toString(res) + ")");
    }
  }

  public static void assertEquals(String message, String[] expected, Char res) {
    if (expected[0].equals(res)) {
      System.out.println("\nOK >> " + message);
    } else {
      throw new Error(
          "\nKO!! >> " + message + " (exp : " + Arrays.toString(expected) + ", res : " + Arrays.toString(res) + ")");
    }
  }

  public static void assertEquals(String message, double expected, double res){
    if (Math.abs(expected-res) < 0.0001) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertEquals(String message, int expected, int res){
    if (expected == res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertTrue(String message, boolean res){
    if (res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (res : "+res+")");
    }
  }

  public static void assertFalse(String message, boolean res){
    assertTrue(message, !res);
  }
}
