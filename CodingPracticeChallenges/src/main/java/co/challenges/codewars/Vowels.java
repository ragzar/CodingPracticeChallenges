package co.challenges.codewars;
public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    str.toLowerCase();
    char [] chars = str.toCharArray();
    for (char a : chars){
     if (a =='a' || a=='e' || a=='i' || a =='o' || a == 'u'){
       vowelsCount ++;
     }
    }
    // your code here
    return vowelsCount;
  }

}