package co.challenges.codewars;

public class FindOutlier{
  static int find(int[] integers){  
    int firstOdd = 0;
    int firstEven = 0;
    int odd  = 0;
    int even = 0;
    for (int i : integers ){
      if (i%2 ==0 ){
        if (odd ++ <1)
          firstOdd = i;
      }else {
        if (even ++ < 1)
          firstEven = i;
      }
      if (even > 1 && odd >0){
           return firstOdd;
      }else if ( odd > 1 && even >0){
          return firstEven;
      }
    }
    return 0;
  }
}