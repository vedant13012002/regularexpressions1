import java.util.regex.*;

public class regularexpressions1 {
    public static void main(String[] args) {
        Pattern P = Pattern.compile("ANOOP");
        Matcher m = P.matcher("abcvedantxyzagh");
        int ctr = 0;
        while(m.find()){
            ctr++;

        }
        System.out.println(ctr);

    }

}
