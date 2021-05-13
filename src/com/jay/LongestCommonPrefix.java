package com.jay;

import java.util.Scanner;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strings){

        String lonStrPrefix;
        if(0 == strings.length){
            return "";
        }
        for (int prefixlen =0; prefixlen < strings[0].length();prefixlen++){

            char toMatch = strings[0].charAt(prefixlen);

            for(int i = 1 ; i <strings.length;i++){
                if(prefixlen >= strings[i].length() || strings[i].charAt(prefixlen) != toMatch ){
                    return strings[0].substring(0,prefixlen);
                }
            }
        }
        return strings[0];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of Strings:");
        int numberOfString = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[numberOfString];

        for (int i = 0; i<strings.length;i++){
            strings[i] = scanner.nextLine();
        }
        System.out.println("Longest prefix String is:"+longestCommonPrefix(strings));
    }
}
