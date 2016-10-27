import java.util.Scanner;

/**
 * Author: Noah Morton
 * Date created: 8/25/2016
 * Part of project: QueueTester
 **/
@SuppressWarnings("WeakerAccess")
public class Mainfile {
    public static void main(String[] args) {
        PrioQueue<Integer> mqueue = new PrioQueue<>();

        do {
            System.out.println("---------------------------\nPlease select a choice:");
            byte choice = Menu(); //display menu and get choice.
            Scanner scan = new Scanner(System.in);

            switch (choice) {
                case 1: //print all data in queue
                    System.out.println("Printing...");
                    for (int i = 0; i < mqueue.size(); i++) {
                        System.out.println(mqueue.get(i));
                    }
                    break;
                case 2: //offer/add item to back of queue
                    System.out.println("Please enter an integer.");
                    Integer input = scan.nextInt();
                    mqueue.offer(input);
                    System.out.println("The integer was added to the back of the queue.");
                    break;
                case 3: //peek - prints first item in queue
                    if (mqueue.empty()) {
                        System.out.println("Queue is empty.");
                        break;
                    } else
                        System.out.println(mqueue.peek());
                    break;
                case 4: //poll - remove front item and print
                    if (mqueue.empty()) {
                        System.out.println("Queue is empty.");
                        break;
                    } else
                        System.out.println(mqueue.poll());
                    break;
                case 5: //size print size of queue
                    System.out.println("The queue size is " + mqueue.size());
                    break;
                case 6: //get print item in spot provided
                    System.out.println("Get from what index?");
                    int index = scan.nextInt();
                    if (index >= mqueue.size() || index <0) { //if value is out of bounds
                        System.out.println("Value out of bounds.");
                        break;
                    } else
                        System.out.println("The value is: " + mqueue.get(index));
                    break;
                case 7: //prints if queue empty
                    String isEmpty = (mqueue.empty()) ? "is" : "is not";
                    System.out.println("The queue " + isEmpty + " empty.");
                    break;
                case 8: //exit game
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        } while (true);
    }

    /**
     * Displays a menu of choices and returns the choice.
     *
     * @return a byte, the choice of the user
     */
    private static byte Menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Print – Prints all the data in the queue \n" +
                "2. Offer/Add –Adds an item to the back of the queue \n" +
                "3. Peek/Element – Prints the value of the front item in the queue \n" +
                "4. Poll/Remove – Removes the front item from the queue and prints its value \n" +
                "5. Size – prints the number of items in the queue \n" +
                "6. Get – Prints the item in spot X. (X will come from the user) \n" +
                "7. Empty – Prints true when the queue is empty and false when it is not \n" +
                "8. Exit – Closes the program");

        return scanner.nextByte();
    }
}
