package Taskpackage;

public class TaskManagementSystem {
    private Node head;

    public TaskManagementSystem() {
        this.head = null;
    }

    // Add a task to the linked list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by ID
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse and display all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by ID
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        if (head.task.taskId == taskId) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.task.taskId != taskId) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Task not found.");
        } else {
            current.next = current.next.next;
        }
    }
    
    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        tms.addTask(new Task(1, "Design Module", "Pending"));
        tms.addTask(new Task(2, "Develop Module", "In Progress"));
        tms.addTask(new Task(3, "Test Module", "Completed"));

        System.out.println("All Tasks:");
        tms.traverseTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task task = tms.searchTask(2);
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task with ID 1:");
        tms.deleteTask(1);
        System.out.println("All Tasks after deletion:");
        tms.traverseTasks();
    }
}

