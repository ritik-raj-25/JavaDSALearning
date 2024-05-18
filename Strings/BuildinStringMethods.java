package Strings;

public class BuildinStringMethods {
    public static void main(String[] args) {
        String s = "Hello Learners";

        // charAt() --> used to fetch a character from a particular index of a Srting.
        System.out.println(s.charAt(6));

        // length() --> used to find the length of the string
        System.out.println(s.length());

        // indexOf() --> used to find the first index of a particular character.
        System.out.println(s.indexOf('e'));

        // lastIndexOf() --> used to find the last index of a particular character.
        System.out.println(s.lastIndexOf('e'));

        // compareTo()  --> used to compare two strings lexographically.
        System.out.println("Outputs of compareTo() method:");
        String str1 = "abc";
        String str2 = "dbc";
        System.out.println(str1.compareTo(str2)); //case - 1
        str1 = "acd";
        str2 = "abc";
        System.out.println(str1.compareTo(str2)); //case - 2
        str1 = "abc";
        str2 = "abc";
        System.out.println(str1.compareTo(str2)); //case - 3
        str1 = "abcdef";
        str2 = "abc";
        System.out.println(str1.compareTo(str2)); //case - 4
        str1 = "abc";
        str2 = "abcdef";
        System.out.println(str1.compareTo(str2)); //case - 5
        System.out.println();

        //contains() --> used to check whether the given string contains a particular substring.
        System.out.println(s.contains("Learn")); 

        //startsWith() --> used to check whether the given string starts with a given substring.
        System.out.println(s.startsWith("Hello"));

        //endsWith() --> used to check whether the given string ends with a given substring.
        System.out.println(s.endsWith("ers"));

        //toLowercase() --> used to convert a given string to lower case.
        String a = "Ritik is a java developer";
        System.out.println(a.toLowerCase()); // a.toLowerCase() does not change the 'a', rather return a new string

        //toUppercase() --> used to convert a given string to Uppercase case.
        System.out.println(a.toUpperCase()); // a.toUpperCase() does not change the 'a', rather return a new string
        
        //concat() --> used to append one string to another string
        String x = "abc";
        String y = "def";
        System.out.println(x.concat(y));  // x.concat() does not change the string 'x', rather return a new string

        //substring(i) --> used to fetch substring whose starting index is i and last index is n-1(where n is the length of the string).
        String z = "abcd";
        System.out.println(z.substring(1)); 

        //substring(i,j) --> used to fetch substring whose starting index is i and last index is j-1.
        System.out.println(z.substring(1,3)); 
    }
}