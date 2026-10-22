import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        int choice;

        do {
            System.out.println("1. Add task");
            System.out.println("2. Show tasks");
            System.out.println("3. Mark task as done");
            System.out.println("4. Delete task");
            System.out.println("0. Exit");

            choice = readInt(scan);
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter title: ");
                    Task task = new Task(scan.nextLine());
                    tasks.add(task);

                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to display");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.print((i + 1) + ". " + tasks.get(i).title + " " + "[");
                            if (tasks.get(i).done) {
                                System.out.print("done");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.println("]");

                        }
                    }
                    break;
                case 3: {
                    System.out.println("Enter task number:");
                    int number = readInt(scan);
                    if (number >= 1 && number <= tasks.size()) {
                        tasks.get(number - 1).markDone();
                    } else {
                        System.out.println("Invalid task number");
                    }
                }
                    break;
                case 4:

                {
                    if (tasks.isEmpty()) {
                        System.out.println("There are no tasks to delete.");
                    } else {
                        System.out.println("Enter the number of the task you want to delete");
                        int number = readInt(scan);
                        if (number >= 1 && number <= tasks.size()) {
                            tasks.remove(number - 1);
                            System.out.println("Task deleted");
                        } else {
                            System.out.println("Invalid task number");
                        }
                    }
                }
                    break;
                case 0:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }

        } while (choice != 0);

    }

    static int readInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("Please enter a number:");
        }
        return scan.nextInt();

    }

}
