/*
*Author: Noah Morton
*Date created: 10/15/16, 11:04 AM
*Part of project: HeapAndTester
*/

import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MyHeap<Integer> heap = new MyHeap<>();

        while (true) {
            System.out.println("1. Print\n" +
                    "2. Size\n" + "3. Empty\n" + "4. Add\n" + "5. Remove\n" +
                    "6. Clear\n" + "7. Exit");
            byte choice = input.nextByte();

            switch (choice) {
                 case 1:
                     System.out.println("Printing..."+heap+"\nDone printing.");
                     break;
                 case 2:
                     System.out.println("The size of the heap is: "+heap.size());
                     break;
                 case 3:
                     System.out.println("The heap is "+ ((heap.empty())? "empty.":"not empty."));
                     break;
                 case 4:
                     System.out.println("What should be added to the heap?");
                     if(heap.add(input.nextInt()))
                         System.out.println("Successfully added.");
                     else System.out.println("Failed to add.");
                     break;
                 case 5:
                     System.out.println("The removed value is "+heap.remove());
                     break;
                 case 6:
                     System.out.println("Clearing the heap...");
                     heap.clear();
                     break;
                 case 7:
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Invalid choice.");
                     break;
            }
        }
    }
}
