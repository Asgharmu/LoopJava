import java.util.Scanner;

public class MidtermTester {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String space = "[a-z|A-Z]";
        System.out.print("What is your name?: ");
        boolean loop = false;
        while(!loop) {
            String name = n.nextLine();
            if (!name.matches(space)) {
                System.out.print("Try again: ");
            } else {
                loop = true;
            }
        }
    }
}
