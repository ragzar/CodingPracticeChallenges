package co.challenges.codewars;
public class NumberFun {
  public static long findNextSquare(long sq) {
      if (Math.sqrt(sq) %1 !=0)
         return -1;
      long  x = (long) Math.sqrt(sq);
      return (x+1)*(x+1); 
  }
}