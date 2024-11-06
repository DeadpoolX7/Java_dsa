import java.lang.StringBuilder;
public class something {
    static String decimalToBinary(int x){
        String res = "";
        while(x != 1){
            if( x % 2 == 1) res += '1';
            else res += '0';
            x = x/2;
            if( x == 1) res += '1';
        }
       StringBuilder inpStr = new StringBuilder();
        inpStr.append(res);
        inpStr.reverse();
        return inpStr.toString();
    }
    public static void main(String[] args) {
        System.out.println("Hello java!");
        int x = 113;
        String binStr = decimalToBinary(x);
        System.out.println(binStr);
    }
}
