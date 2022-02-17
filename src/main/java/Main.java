import org.apache.commons.codec.language.Soundex;

public class Main {
    public static void main(String[] args) {
        Soundex soundex = new Soundex();
        String enc = soundex.encode("Gunn");
        System.out.println(enc);
    }
}
