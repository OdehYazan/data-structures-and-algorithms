package structure;

import data.FzBzNode;

public class FizzBuzzTree {
 public FzBzNode root;

 public String results ="";

//  public static void main(String args[])
//  {

//    int n = 100;

//    // loop for 100 times
//    for (int i=1; i<=n; i++)
//    {
//      //number divisible by 15(divisible by
//      // both 3 & 5), print 'FizzBuzz' in
//      // place of the number
//      if (i%15==0)
//        System.out.print("FizzBuzz"+" ");
//        // number divisible by 5, print 'Buzz'
//        // in place of the number
//      else if (i%5==0)
//        System.out.print("Buzz"+" ");
//
//        // number divisible by 3, print 'Fizz'
//        // in place of the number
//      else if (i%3==0)
//        System.out.print("Fizz"+" ");
//
//      else // print the numbers
//        System.out.print(i+" ");
//    }
//  }


  public String fizzBuzz(FzBzNode root){
    if (Integer.parseInt(root.data) % 3 == 0 && Integer.parseInt(root.data) % 5 == 0 ){
      root.data =  "FizzBuzz";
    }
    else if (Integer.parseInt(root.data) % 5 == 0 ){
      root.data = "Buzz";
    }
    else if (Integer.parseInt(root.data) % 3 == 0 ){
      root.data =  "Fizz";
    }

    results += root.data + " ";
    if(root.subNode.isEmpty()){
      return null;
    }
    for(FzBzNode child : root.subNode){
      fizzBuzz((FzBzNode) child);
    }
    return results;
  }
}
