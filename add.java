class add {

    static int a = 10;
    static int b = 20;
    static int c;

    static void add() {
        c = a + b;
    }

    public static void main(String[] args) {

        add();

        System.out.println("The addition of " + a + " and " + b + " is: " + c);
    }
}