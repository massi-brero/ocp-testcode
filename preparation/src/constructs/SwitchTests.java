public class SwitchTests {
    public static void main(String[] args) {
        int i = 10;
        LABEL_1: System.out.println();

        switch (i) {
            default:
                System.out.println("in default");
                break;

            case 10:
                System.out.println("in case");
                break;
        }
    }
}