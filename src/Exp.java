import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Exp {
    public static void main(String[] args) {

    /*String nomes = "João, Maria, Lucas, Haru, Julia, Maya";

        StringTokenizer st = new StringTokenizer(nomes, ",");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }*/

        StringJoiner sj = new StringJoiner(",");

        sj.add("João");
        sj.add("Lucas");
        sj.add("Julia");

        System.out.println(sj);
    }
}
