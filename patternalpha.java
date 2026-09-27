class patternalpha {
    public static void main(String[] args) {
        int i, j, n = 5, letter = 0;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            if (i % 2 != 0) {
                for (j = 5; j >= 6 - i; j--) {
                    System.out.print(j);
                }
            } else {
                char ch = (char) ('a' + letter);
                for (j = 0; j < i; j++) {
                    System.out.print(ch);
                }
                letter++;
            }
            System.out.print("\n");

        }
    }
}
