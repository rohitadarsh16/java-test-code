
class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // calling add method
        Main sum = new Main();
        int result = sum.add(5, 10);
        System.out.println("The sum of 5 and 10 is: " + result);

    }

    int add(int a, int b) {
        return a + b;
    }

}