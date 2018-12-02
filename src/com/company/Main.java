package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("введите строку s и t");
        String s = in.nextLine();
        String t = in.nextLine();
        int c = t.length()/4 ;
        int e = s.length()/3;
        int flag=0;
        boolean bol=false;
        char []d=t.toCharArray();
        char []d2=s.toCharArray();
        if ( s.length()%2<8)
        {
            for (int i = 0; i < t.length() ; i++) {
                d[i]=t.charAt(i);
                if(i>=c*3) {
                    if (!Character.isLetter(d[i]))
                    {
                       bol=true;
                    }
                }
            }
            if(bol){
            for (int i = 0; i < s.length() ; i++) {
            d2[i]=s.charAt(i);
            if(i>e || i<e*3){
                if(d2[i]=='*'){
                    flag++;
                }
            }
            }}
            }
        System.out.println(flag);
   }
}
