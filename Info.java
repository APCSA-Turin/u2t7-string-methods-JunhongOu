import java.util.Scanner;

public class Info{
    public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter first string: ");
    String str1 = scan.nextLine();
    int len1 = str1.length();
    System.out.print("Enter second string: ");
    String str2 = scan.nextLine();
    int len2 = str2.length();
    
    if (len1 > len2){
        System.out.print(str1 + " is longer");
    }
    else{
        System.out.print(str2 + " is longer");
    }
    
    String str1FirstHalf = str1.substring(0, str1.length()/2);
    String str1SecondHalf = str1.substring(str1.length()/2);
    String str2FirstHalf = str2.substring(0, str1.length()/2);
    String str2SecondHalf = str2.substring(str2.length()/2);

    System.out.println("First half: " + str1FirstHalf);
    System.out.println("Second half: " + str1SecondHalf);
    System.out.println("First half: " + str2FirstHalf);
    System.out.println("Second half: " + str2SecondHalf);

    int index = str1.indexOf(str2);
        
    if (str1.indexOf(str2) == -1){
        System.out.println(str2 + " is NOT FOUND in " + str1);
    }
    else{
        System.out.println(str2 + " is found in " + str1 + " at index " + index );
    }

    scan.close();
    }
}