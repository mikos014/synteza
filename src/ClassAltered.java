import static java.lang.System.out;

public final class ClassAltered {

    public static void main(String[] args) {
        String upper = upper("Gregorczyk, Mikołaj");
        out.println(upper + " = " + count(upper));
        out.println("Printing if null: " + printNull());
        Object a = new Object();
        a = null;
        objNull(a);
    }

    private static String upper(String s) {
        String aux = s.toUpperCase();
        aux = aux == null ? "To null" : aux;
        return aux;
    }

    public static int count(String s) {
        int length = s.length();
        return length;
    }

    private static void log(String str) {
        out.print((char) 27 + "[32m");
        out.println(str);
        out.print((char) 27 + "[0m");
    }

    private static String printNull() {
        String s = null;
        s = s == null ? "To null" : s;
        return s;
    }

    private static Object objNull(Object object) {
        object = object == null ? new Object() : object;
        return object;
    }
}
