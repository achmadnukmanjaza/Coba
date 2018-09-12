/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class SearchTest {
       public static int sequentialSearch(int[] elements, int target)
   {
      for (int j = 0; j < elements.length; j++)
      {
         if (elements[j] == target)
         {
            return j;
         }
     }
     return -1;
   }

   public static void main(String[] args)
   {
      int[] arr1 = {81, 3, -20, 15, 432};

      // test when the target is in the array
      int index = sequentialSearch(arr1,-20);
      System.out.println(index);

      // test when the target is not in the array
      index = sequentialSearch(arr1,53);
      System.out.println(index);
   }
}

    

