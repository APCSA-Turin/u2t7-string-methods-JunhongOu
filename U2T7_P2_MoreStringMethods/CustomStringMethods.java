package U2T7_P2_MoreStringMethods;

public class CustomStringMethods {

  public CustomStringMethods() { }

  public boolean longerThan(String myString, int maxLength) {
      if(myString.length()>maxLength){
          return true;
      } else{
          return false;
      }
}
  
public String funnyString(String str, int idx) {
      String character = str.substring(idx, idx+1);
      return character + str + character;
}
public String halvesReversed(String myString) {
      String firstHalf = myString.substring(0, myString.length()/2);
      String secondHalf = myString.substring(myString.length()/2);
      return secondHalf + firstHalf;
}

}