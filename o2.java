import java.util.Random;

public class o2 {
    public static void main(String[] args) {
        int sonuc=sayitut();
        System.out.println(sonuc);

    }
public static int sayitut() {
Random rnd = new Random();
int sayi = rnd.nextInt(100);
return sayi;
}

}
