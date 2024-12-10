/*
shashi
ihsahs
*/
import java.util.*;
class reversstringtwopiontertech {
    public static void main(String args []){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        char b[]=a.toCharArray();
        int c=b.length;
        int l=0;
        int h=c-1;
        while(l<=h){
            char temp=b[l];
            b[l]=b[h];
            b[h]=temp;
            l++;
            h--;
        }
        String res=new String(b);
        System.out.println(res);
    }
}