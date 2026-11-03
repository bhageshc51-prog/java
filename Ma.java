class Ma{
    public int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 10;

        Ma obj = new Ma();
        int sum = obj.add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
