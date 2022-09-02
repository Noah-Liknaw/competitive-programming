import java.util.Scanner;

public class TheaterSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n,m,a;
        n = in.nextLong();
        m = in.nextLong();
        a= in.nextLong();

        long x = m/a;
        long y = n/a;
        if(m%a != 0){
            ++x;
        }
        if(n%a != 0){
            ++y;
        }
        System.out.println(x*y);
    }
}
