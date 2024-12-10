import java.util.*;
class togglecase {
    public static void main(String args []){
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        a^=32;
        System.out.println(a);
    }
}