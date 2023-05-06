public class introductiontobreak2 {
    public static void main(String[] args) {
        for (int n = 1; n <= 50; n++) {
            for (int i = 1; i<=n; i++) {
                if (n % 5 == 0 && n % 7 == 0) {
                    System.out.println(n + " divisible by 5 and 7");
                    break;
                }
            }
        }
    }
}

