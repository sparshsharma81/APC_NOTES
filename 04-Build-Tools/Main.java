import java.util.*;
public class Main{
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //now we have to reverse it and convert to int
        if(s.charAt(0) == '-'){
            StringBuilder sb = new StringBuilder(s.substring(1));
            StringBuilder rev = new StringBuilder(sb.reverse());
            //120 --- 012
            long a = Long.parseLong(rev.toString());
            if(a >Integer.MAX_VALUE)System.out.println("0");
            else System.out.println("-" + a);
        }
        else{
            StringBuilder sb = new StringBuilder(s);
            StringBuilder rev = new StringBuilder(sb.reverse());
            //120 --- 012
            long a = Long.parseLong(rev.toString());
            if(a >Integer.MAX_VALUE)System.out.println("0");
            else System.out.println(a);


        }


    }
}