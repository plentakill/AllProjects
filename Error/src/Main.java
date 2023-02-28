public class Main {
    public static void main(String[] args) {
        try {

            System.out.println("Rest of the code");
            int data = 50/0;
            if (data > 2){
                System.out.println("testing");
            }
            System.out.println("Rest of the code2");
        } catch (ArithmeticException e){
            System.out.println(e + " Dividing by zero is not possible");
        }
    }
}