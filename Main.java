//positive or negative number
/*import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num= sc.nextInt();
    if(num==0)
      System.out.println("it is 0");
    else if(num>0)
      System.out.println("positive");
    else
      System.out.println("negative");
  }
}*/

//even or odd
/*class Main{
  public static void main(String[] args){
    int num=3;
    String result= (num%2==0)?"even":"odd";
    /*if(num%2==0)
      System.out.println("even");
    else
      System.out.println("odd")
    System.out.println(result);
  }
}*/

//sum of n natural number
/*class Main{
  public static void main(String[] args){
    int n=5;
    int sum=0;
    for(int i=0; i<n; i++){
      sum+=i;
    }
    System.out.println(sum);
  }
} */

//sum within the range
/*class Main{
  public static void main(String[] args){
    int a=2;
    int b=10;
    int sum=0;
    for(int i=a; i<b; i++){
      sum+=i;
    }
    System.out.println(sum);
  }
}*/

//greatest of two numbers
/*class Main{
  public static void main( String[]args){
    int n1=5;
    int n2=6;
    int result= (n1>n2)?n1:n2;
    System.out.println(result);
  }
}*/

//greatest of 3 numbers
/*class Main{
  public static void main(String[]args){
    int a=1;
    int b=21;
    int c=3;
    if(a>b)
      System.out.println((a>c)?a:c);
    else
      System.out.println((b>c)?b:c);
  }
}*/

//leap year or not
/*class Main{
  public static void main(String[] args){
    int year=2024;
    if(year%4==0 && year%100!=0)
      System.out.println("leap year");
    else
      System.out.println("not a leap year");
  }
}*/

//prime number
/*class Main{
  public static void main(String[]args){
    int n=3;
    for(int i=1; i<=n; i++){
    if(n%i==0)
      System.out.println("not a prime number");
      break;
  }
    System.out.println("prime number");
}}*/

// prime number in range
/*import java.util.Scanner;
class Main{
  public static void main(String[]args){
    int a=2;
    int b=10;
      for(int n=2; n<=10; n++){
        if(isprime(n)){
          System.out.println("not a prime number:"+n);
        }
      }
  boolean isprime(int n){
        for (int i = 1; i < n; i++) {
          if(n%i==0){
            return false;
            break;
        }
        return true;
        }
    }  }
  }
}*/

//reverse a number
/*class Main{
  public static void main(String[]args){
    int n=123456789;
    int rev=0;
    while(n>0){
      int digit= n%10;
      rev=(rev*10)+digit;
      n=n/10;
    }
    System.out.println(rev);
  }
}*/

//count the digits
/*class Main{
  public static void main(String[]args){
    int n=1234567890;
    int count=0;
    while(n>0){
      n=n/10;
      count+=1;
    }
    System.out.print(count);
  }
}*/

//sum of n natural numbers
/*class Main{
  public static void main(String[]args){
    int n=5;
    int sum=0;
    for(int i=0; i<=n;i++){
      sum+=i;
    }
    System.out.println(sum);
  }}*/

//all divisor of number
  /*class Main{
  public static void main(String[]args){
    int n=10;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        System.out.println(i);
      }
    }
  }}*/

//power of a number
  /*class Main{
    public static void main(String[]args){
      int a=3;
      int b=3;
      int result=1;
      for(int i=1;i<=b;i++){
        result*=a;
      }
      System.out.println(result);
    }}*/

//set bits in a number
/*import java.util.*;
class Main{
  public static void main(String[]args){
    int n=5;
    int result=0;
    int pow=0;
    int count=0;
    while(n>0){
      int digit=n%2;
      result=(int)(digit*Math.pow(10,pow))+result;
      pow++;
      n=n/2;
    }
    while(result>0){
      int ld=result%10;
      if(ld!=0){
        count+=1;
      }
      result=result/10;
    }
    System.out.println(count);
  }}*/

//prime number
/*class Main{
  public static void main(String[]args){{
    int n=10;
    prime(n);
  }
}
  static void prime(int n){
    for(int i=2;i<n;i++){
      if(n%i==0){
        System.out.println("not prime");
        return;
      }
    }
    System.out.println("prime");
  }}*/

//palindrome
/*class Main{
  public static void main(String[]args){
    int n=123;
    int original=n;
    int rev=0;
    while(n>0){
      int digit= n%10;
      rev=(rev*10)+digit;
      n=n/10;
    }
    if(rev==original){
      System.out.println("palindrome");
    }
    else
      System.out.println("not a palindrome");
  }}*/

//armstrong
/*class Main {
  public static void main(String[] args) {
    int n = 153;
    int original = n;
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      sum += digit*digit*digit;
      n = n / 10;
    }
    if (sum == original) {
      System.out.println("Armstrong");
    } else
      System.out.println("not a Armstrong");
  }
}*/

//factorial
/*class Main {
  public static void main(String[] args) {
    int n=5;
    System.out.println(fact(n));
  }
  static int fact(int n){
    if(n==1) 
      return 1;
    else
      return n*fact(n-1);
  }}*/

//fibonacci
/*class Main{
  public static void main(String[]args){
    int a=0;
    int b=1;
    int s=0;
    System.out.print(a+" "+b+" ");
    for(int i=1;i<=10;i++){
      s=a+b;
      System.out.print(s+" ");
      a=b;
      b=s;
    }
  }
}*/

/*import java.util.Scanner;
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String str= sc.nextLine();
    int n= str.length();
    int sum=0;
    String[] arr= str.split("");
    if(arr[n-3].equals("E") && arr[n-2].equals("N") && arr[n-1].equals("D")){
      for(int i=0;i<n;i++){
        int ascii = (int)str.charAt(i);
        sum= sum+ascii;
      }
      System.out.println(sum);
    }
  }
}*/

/*import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String str= sc.nextLine();
    String[] arr= str.split("\\|\\|");
    String s1=arr[0];
    String s2=arr[1];
    String s3=arr[2];
    System.out.println("Name:" + s1);
    System.out.println("Age:" + s2);
    System.out.println("City:" + s3);
  }
}*/

import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    char ch= sc.next().charAt(0);
    if(ch>='a' && ch<='z'){
      System.out.println("Type: letter");
      System.out.println("Case: lower case");
    } 
    
else if((ch>='A' && ch<='Z')){
      System.out.println("Type: letter");
      System.out.println("Case: upper case");
    }
    else if(ch>='0' && ch<='9'){
      System.out.println("Type: digit");
    }
    else{
      System.out.println("Type: special character");
    }
  }}
