public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i<10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-------");

        for (int j = 1; j<10; j++) {
            if (j==6) {
                break;
            }
            System.out.println(j);
        }
    }
}
