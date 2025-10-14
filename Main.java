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

/*import java.util.Scanner;
class Main{public static void main(String[] args){
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
*/

/*import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int count=0;
    if(n%2==0){
      int i=1;
      while(n>0){
        n=n/2;
        count++;
        i++;
      }
      System.out.println(count);
    }
    else{
      int i=1;
      while(n>0){
        n=3*n-1;
        count++;
        i++;
      }
      System.out.println(count);
    }
  }
}*/

/*import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    char n= sc.next().charAt(0);
    switch(n){
      case 'A': System.out.println("Excellent"); break;
      case 'B': System.out.println("Good"); break;
      case 'C': System.out.println("Average"); break;
      case 'D': System.out.println("below average"); break;
      case 'F': System.out.println("Fail"); break;
      default: System.out.println("Invalid grade");
    }
  }
}*/

/*import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    if(n>0){
      if(n%2==0){
        System.out.println("Positive even number");
      }
      else{
        System.out.println("Positive odd number");
      }
    }
    else if(n<0){
      if (n % 2 == 0) {
        System.out.println("Negative even number");
      } else {
        System.out.println("Negative odd number");
      }
    }
    else{
      System.out.println("Zero");

  }}}*/

/*import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String player1= sc.nextLine();
    String player2= sc.nextLine();
    if(player1.equals("Rock") && player2.equals("Scissors")){
      System.out.println("Player 1 wins");
    }
    else if(player1.equals("Scissors") && player2.equals("Paper")){
      System.out.println("Player 1 wins");
    }
    else if(player1.equals("Paper") && player2.equals("Rock")){
      System.out.println("Player 1 wins");
    }
    else if(player2.equals("Rock") && player1.equals("Scissors")){
      System.out.println("Player 2 wins");
    }
    else if(player2.equals("Scissors") && player1.equals("Paper")){
      System.out.println("Player 2 wins");
    }
    else if(player2.equals("Paper") && player1.equals("Rock")){
      System.out.println("Player 2 wins");
    }
    else if(player1.equals(player2)){
      System.out.println("It's a tie");
    }
    else{
      System.out.println("Invalid input");
    }

  }}*/

/*import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int x= sc.nextInt();
    int y= sc.nextInt();
    if(x>0 && y>0){
      System.out.println("First quadrant");
    }
    else if(x>0 && y<0){
      System.out.println("Fourth quadrant");
    }
    else if(x<0 && y>0){
      System.out.println("Second quadrant");
    }
    else if(x<0 && y<0){
      System.out.println("Third quadrant");
    }
    else if(x==0 && y!=0){
      System.out.println("y axis");
    }
    else if(y==0 && x!=0){
      System.out.println("x axis");
    }
    else{
      System.out.println("Origin");
    }
  }
}*/

/*import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    char x= sc.next().charAt(0);
    if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||
       x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
      System.out.println("Vowel");
    }
    else{
      System.out.println("Consonant");
    }

  }
}*/

/*import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int x= sc.nextInt();
    int y= sc.nextInt();
    int z= x*y;
    long a= x*y;
    System.out.println(z);
    System.out.println(a);
  }
}*/

/*import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int x= sc.nextInt();
    int X=0;
    int n=1;
    String num= Integer.toString(x);
    String[] arr= num.split("");
    for(int i=1;i<arr.length ; i++){
      X+=(Integer.parseInt(arr[i])*n);
      n++;
    }
    System.out.println("the 10th digit is:" + X%11);
}}*/

/*import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int x= sc.nextInt();
    int y=28;
    if((x&y)==y){
      System.out.println("Permission granted");
    }
    else{
      System.out.println("Permission denied");    }
  }}*/

/*import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int sum = 0;
    while(true){
    Scanner sc= new Scanner(System.in);
    int x= sc.nextInt(); 
    if(x== -1){
      break;
    }
    else if(x%2==0){
      continue;
    }
    else{
      sum+=x;
    }
  }
  System.out.println(sum);
}}*/

/*import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = n - 1; j >= 1; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}*/
/*import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  for(int i=1;i<10;i++){
    if(i==6){
      System.exit(0);
    }
    System.out.println(i);
    } 
  System.out.println("End loop");
  }
}*/

/*import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr= new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    int target= sc.nextInt();
    for(int i=0;i<arr.length;i++){
      if(arr[i]==target){
        System.out.println(i);
        break;
      }
      else{
        System.out.println("NOT FOUND");
      }
    }
}}*/

/*import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    try{
      Integer a=Integer.parseInt(n,16);
      System.out.println(a);
    }
    catch(NumberFormatException e){
      System.out.println("INvalid input");
    }
  }
}*/

/*import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    try {
      int a = Integer.parseInt(s);
      System.out.println("Integer: " + a);
    } catch (NumberFormatException e1) {
      try {
        double b = Double.parseDouble(s);
        System.out.println("Double: " + b);
      } catch (NumberFormatException e2) {
        System.out.println("String: " + s);
      }
    }
  }
}*/

/*import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length();
    boolean flag = true;
    for (int i = 0; i < n / 2; i++) {
        if (s.charAt(i) != s.charAt(n-1-i)) {
          flag = false;
          break;
        }
      }
      if(flag){
        System.out.println("palindrome");
      }
      else{
        System.out.println("not a palindrome");
      }
      }
  }*/

 /*class Main {
  public static void main(String[] args) {
    int a = 6;
    int b = 9;
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    System.out.println(a);
  }
}*/

 /*class Main {
   public static void main(String[] args) {
     double a = 0.1;
     System.out.println("MULTIPLICATION:" + a * 10);
     for (int i = 1; i <= 10; i++) {
       a += a;
     }
     System.out.println("LOOP:" + a);

   }
 }*/

/*import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a=10;
    if(true){
      int a= 20;
      System.out.println(a);
    }
    System.out.println(a);
  }
}*/
/*import java.util.Arrays;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String str1= sc.nextLine();
    String str2= sc.nextLine();
    char[] arr1= str1.toCharArray();
    char[] arr2= str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if(str1.length()!=str2.length()){
      System.out.println("Not Anagram");
      return;
    }
    if(Arrays.equals(arr1,arr2)){
      System.out.println("anagram");
    }
    else{
      System.out.println("Not Anagram");
    }
  }
}*/

/*public class Main {
  public static void main(String[] args) {
    String str = "EESHA";
    StringBuilder s = new StringBuilder(str);
    for (int i = s.length() - 1; i >= 0; i--) {
      s.append(s.charAt(i));
    }
    s.delete(0, s.length() / 2);
    System.out.println(s);
  }
}*/

/*import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[1000];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int[] result = new int[1000];
    for (int i = 0; i < arr.length; i++) {
      int product = 1;
      for (int j = 0; j < n; j++) {
        if (i != j) {
          product *= arr[j];
        }
      }
      result[i] = product;
    }
    for (int k = 0; k < n; k++) {
      System.out.print(result[k] + " ");
    }
  }
}*/

/*class Thing {
  private static int count = 0;

  public Thing() {
    count++;
  }
  public static int getCount() {
    return count;
  }
}
public class Main {
  public static void main(String[] args) {
    Thing c = new Thing();
    Thing c1 = new Thing();
    Thing c2 = new Thing();

    System.out.println("Total objects created: " + Thing.getCount());
  }
}*/

/*class Bankaccount {
   double balance;
   
   public Bankaccount(double balance){
       this.balance = balance;
   }
   void deposit(double deposit){
       this.balance= balance;
       balance+=deposit;
       System.out.println("After depositon:" + balance);
   }
   void withdrawal(double withdrawal){
       this.balance= balance;
       if(withdrawal> balance){
           System.out.println("Insufficient account");
       }
       else{
           balance-= withdrawal;
           System.out.println("After withdrawal:" + balance);
       }
   }
}

public class Main {
    public static void main(String[] args) {
        Bankaccount c= new Bankaccount(1000.00);
        c.deposit(1000);
        c.withdrawal(1000);
        c.withdrawal(7000);
    }
}*/
