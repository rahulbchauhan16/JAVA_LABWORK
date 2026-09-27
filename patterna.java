class patterna {
    public static void main(String[] arg) {
        int i, j, n = 5;
        for (i = 0; i <= n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                if (i % 2 != 0) {
                    System.out.print("@ ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.print("\n");
        }
    }
}
