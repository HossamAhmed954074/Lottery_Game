import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object
        var in = new Scanner(System.in);

        // Make a Lottery
        int lottery = (int) (Math.random() * 100);

        // Massage for User to Know the Role of game
        System.out.println("""
                We would You Know the Random Number is Two digits , if The Number you are Suggest is Match you are win 3000$ ,
                If one of your Suggest Digit is match of random digits you will win 2000$ ,
                If one digit from suggest is match of random digits you will win 1000$ , you Have 3 of Attempts.\s""");
        // Loop for 3 Times to Suggest the Number 
        for (int i = 0; i < 3; i++) {
            // Massage to input the digit
            System.out.print("Input your Suggest : ");
            int num = in.nextInt();
            // Create the digits of user Number
            int FirstDigitOfNum = num / 10;
            int SecondDigitOfNum = num % 10;
            // Create the digits of lottery Number
            int FirstDigitOfLottery = lottery / 10;
            int SecondDigitOfLottery = lottery % 10;
            // Cheek if toe Number is Matches
            if (num == lottery) {
                System.out.printf("You are win 3000$ Your Number match the Lottery Number the random is %s your Number is %s", lottery, num);
                System.exit(0);
            }
            // Cheek one digit is match
            else if (FirstDigitOfNum == SecondDigitOfLottery && SecondDigitOfNum == FirstDigitOfLottery) {
                System.out.printf("You are win 2000$ all digits is matches the random is %s your Number is %s", lottery, num);
                System.exit(0);
            }
            // else if any digit matches
            else if (FirstDigitOfNum == FirstDigitOfLottery || SecondDigitOfNum == SecondDigitOfLottery || FirstDigitOfNum == SecondDigitOfLottery || SecondDigitOfNum == FirstDigitOfLottery) {
                System.out.printf("You are Win 1000$ the one of Digits is matches the random is %s your Number is %s", lottery, num);
                System.exit(0);
            }
            // the end of suggest
            else {
                if (i < 2)
                    System.out.printf("Sorry, No match ,Try Again the attempt : %s \n", i + 2);
                else
                    System.out.println("Sorry, you lose!");
            }
        }

    }
}