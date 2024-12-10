/*
post 
stop
anagram
*/
import java.util.*;
class anagram1{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        int c1[]=new int[256];
        int c2[]=new int[256];
        for(int i=0;i<s1.length();i++){
            c1[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            c2[s2.charAt(i)]++;
        }
        boolean ans=true;
        for(int i=0;i<256;i++){
            if(c1[i]!=c2[i]){
                ans=false;
                break;
            }
        }
        System.out.println(ans?"anagram":"not a anagram");
    }
}