/*
sHashI
 ShASHi
shashi
 SHASHI*/
import java.util.*;
class camelcase{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String res=" ";
        for(int i=0;i<a.length();i++)
        {
            char b=a.charAt(i);
            b^=32;
            res+=b;
        }
        System.out.println(res);
        }
    }