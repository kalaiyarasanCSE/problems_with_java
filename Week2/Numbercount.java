class DigitLength {
    public static void main(String[] args) {

        int number = 12345;
        int length = 0;

        if (number == 0) {
            length = 1;
        } else {
            while (number != 0) {
                number = number / 10;
                length++;
            }
        }

        System.out.println("Length: " + length);
    }
}
