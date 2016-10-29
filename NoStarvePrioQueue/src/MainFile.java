import java.util.Scanner;

/**
 * Author: Noah Morton
 * Date created: 10/29/2016
 * Part of project: NoStarvePriorityQueue
 **/
@SuppressWarnings("WeakerAccess")
public class MainFile {
    public static void main(String[] args) {
        NSPrioQueue<PriorityNode<String>> mqueue = new NSPrioQueue<>();

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
                case 2: //size
                    System.out.println("Size of the queue is: " + mqueue.size());
                    break;
                case 3:
                    System.out.println("The queue " + ((mqueue.empty()) ? "is empty." : "is not empty."));
                    break;
                case 4:
                    System.out.println("Add what to the queue?");
                    //mqueue.offer(scan.next()); todo change to add a new PrioNode
                    break;
                case 5:
                    System.out.println("Removed " + mqueue.poll() + " from the queue.");
                    break;
                case 6:
                    System.out.println("Cleared the queue.");
                    mqueue.clear();
                    break;
                case 7:
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
                "2. Size – prints the number of items in the queue \n" +
                "3. Empty – Prints true when the queue is empty and false when it is not \n" +
                "4. Offer/Add –Adds an item to the back of the queue \n" +
                "5. Poll/Remove – Removes the front item from the queue and prints its value \n" +
                "6. Clear \n" +
                "7. Exit – Closes the program");

        return scanner.nextByte();
    }
}
