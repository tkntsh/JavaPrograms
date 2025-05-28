public class binarySearchExample
{
   //divide and conquer search algorithm
   public int binarySearch(int[] arr, int target, int left, int right) 
   {
       //base case = element not found
       if(left > right)
       {
          return -1;
       }
        
       int mid = left + (right - left) / 2;
       
       //base case = element found
       if(arr[mid] == target)
       {
          return mid;
       }
       
       //search left half
       if(arr[mid] > target)
       {
          return binarySearch(arr, target, left, mid - 1);
       }
       //search right half
       return binarySearch(arr, target, mid + 1, right);
   }
   
   //fibonacci series method
   public int fibonacci(int n) 
   {
      //base case 1
      if(n == 0)
      {
         return 0;
      }
      //base case 2
      if(n == 1)
      {
         return 1;
      }
      //recursive case
      return fibonacci(n - 1) + fibonacci(n - 2);
   }
   
   //factorial method using recursion calling itself
   public int factorial(int n) 
   {
      //base case
      if(n == 0) 
      {
         return 1;
      }
      //recursive case
      return n * factorial(n - 1);
   }

   //indirect recursion
   public void functionA(int x) 
   {
      if(x > 0) 
      {
         System.out.println("A: " + x);
         functionB(x - 1);
      }
   }

   public void functionB(int x) 
   {
      if(x > 0) 
      {
         System.out.println("B: " + x);
         functionA(x - 2);
      }
   }
}