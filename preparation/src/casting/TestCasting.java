package casting;

public class TestCasting {

    public static void main(String[] args) {
        byte b = 10;
        char c = 'x';
        short s = 300;
        int i = 10;
        int highInt = 129;
        final int intFinal = 10;
        long l = 1024;
        float f = 1.1f;
        double d = 1.12;

        c = intFinal; // w
        // i = l; // nw
        b = intFinal; // w

        b = (byte) highInt;
        s = -1;

        // Short wrappedShort = new Short(intFinal); //nw
        Integer wrappedInt = Integer.valueOf(10);
        i = wrappedInt.intValue(); // get primitive from Object
        System.out.println(b);
    }

}