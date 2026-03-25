import java.util.*;

public class taskManagementSystem {

    static String[] tasks = new String[100];
    static boolean[] completed = new boolean[100];
    static int size = 0;

    static Stack<String> undoStack = new Stack<>();
    static Queue<String> taskQueue = new LinkedList<>();
    static HashSet<String> taskSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Search Task");
            System.out.println("6. Sort Tasks");
            System.out.println("7. Undo Last Action");
            System.out.println("8. Process Next Task (Queue)");
            System.out.println("9. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    addTask(task);
                    break;

                case 2:
                    showTasks();
                    break;

                case 3:
                    System.out.print("Enter task number: ");
                    completeTask(sc.nextInt() - 1);
                    break;

                case 4:
                    System.out.print("Enter task number: ");
                    deleteTask(sc.nextInt() - 1);
                    break;

                case 5:
                    System.out.print("Enter keyword: ");
                    searchTask(sc.nextLine());
                    break;

                case 6:
                    sortTasks();
                    break;

                case 7:
                    undo();
                    break;

                case 8:
                    processTask();
                    break;

                case 9:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // 🔹 Add Task
    public static void addTask(String task) {
        if (taskSet.contains(task)) {
            System.out.println("Duplicate task!");
            return;
        }

        tasks[size] = task;
        completed[size] = false;
        size++;

        taskSet.add(task);
        taskQueue.add(task);
        undoStack.push("ADD:" + task);

        System.out.println("Task added!");
    }

    // 🔹 Show Tasks
    public static void showTasks() {
        for (int i = 0; i < size; i++) {
            String status = completed[i] ? "Done" : "Pending";
            System.out.println((i + 1) + ". " + tasks[i] + " - " + status);
        }
    }

    // 🔹 Complete Task
    public static void completeTask(int index) {
        if (index >= 0 && index < size) {
            completed[index] = true;
            undoStack.push("COMPLETE:" + tasks[index]);
            System.out.println("Task completed!");
        }
    }

    // 🔹 Delete Task
    public static void deleteTask(int index) {
        if (index >= 0 && index < size) {
            undoStack.push("DELETE:" + tasks[index]);
            taskSet.remove(tasks[index]);

            for (int i = index; i < size - 1; i++) {
                tasks[i] = tasks[i + 1];
                completed[i] = completed[i + 1];
            }
            size--;
            System.out.println("Task deleted!");
        }
    }

    // 🔹 Search Task (String + Searching)
    public static void searchTask(String keyword) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + tasks[i]);
            }
        }
    }

    // 🔹 Sort Tasks (Simple Bubble Sort)
    public static void sortTasks() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (tasks[j].compareTo(tasks[j + 1]) > 0) {
                    String temp = tasks[j];
                    tasks[j] = tasks[j + 1];
                    tasks[j + 1] = temp;
                }
            }
        }
        System.out.println("Tasks sorted!");
    }

    // 🔹 Undo (Stack)
    public static void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        String action = undoStack.pop();

        if (action.startsWith("ADD:")) {
            String task = action.substring(4);
            deleteTask(size - 1);
        }

        System.out.println("Undo performed");
    }

    // 🔹 Queue Processing
    public static void processTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("No tasks in queue");
            return;
        }

        System.out.println("Processing: " + taskQueue.poll());
    }
}