import java.util.Locale;

public class LocaleFix {
    static {
        Locale.setDefault(new Locale("tr", "TR"));
    }

    // hiç kullanılmasa bile class load olunca çalışsın diye:
    public static void touch() { }
}
