public class TryCatch {

    public static void main(String[] args) {
        String name = null;

        try {

            int len = name.length();
            System.out.println(len);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
