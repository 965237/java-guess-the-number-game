package first;

import java.util.Scanner;

public class ione {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type \"yes\" to play");
        String yes = input.nextLine();
        int com_num = (int) (Math.random() * 10);
        System.out.println(com_num);
        if (yes.equals("yes")) {
            System.out.println("computer choose it's value now it's your time ");
            System.out.println("enter your number");
        }
        int num = input.nextInt();
        while (com_num != num) {
            System.out.println("try again");
            num = input.nextInt();
        }
    }
}
