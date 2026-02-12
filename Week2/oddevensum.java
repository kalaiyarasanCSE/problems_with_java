class elementpair {
    public static void main(String[] arg) {

        int input1 = 2342223;
        String input2 = "odd";

        int sum = 0;

        if (input2.equals("even")) {

            while (input1 > 0) {
                int num = input1 % 10;
                input1 = input1 / 10;

                if (num % 2 == 0) {
                    sum = sum + num;
                }
            }

        } else if (input2.equals("odd")) {

            while (input1 > 0) {
                int num = input1 % 10;
                input1 = input1 / 10;

                if (num % 2 != 0) {
                    sum = sum + num;
                }
            }
        }

        System.out.println(sum);
    }
}
