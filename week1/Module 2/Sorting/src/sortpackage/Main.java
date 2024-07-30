package sortpackage;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.50),
            new Order(2, "Bob", 150.75),
            new Order(3, "Charlie", 300.00),
            new Order(4, "David", 200.00)
        };

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(orders);
        System.out.println("Orders sorted by Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        Order[] orders2 = {
            new Order(1, "Alice", 250.50),
            new Order(2, "Bob", 150.75),
            new Order(3, "Charlie", 300.00),
            new Order(4, "David", 200.00)
        };

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(orders2, 0, orders2.length - 1);
        System.out.println("\nOrders sorted by Quick Sort:");
        for (Order order : orders2) {
            System.out.println(order);
        }
    }
}
