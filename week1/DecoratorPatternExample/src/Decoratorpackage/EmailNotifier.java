package Decoratorpackage;

public class EmailNotifier implements Notifier {
	 public void send(String message) {
	        System.out.println("Sending email with message: " + message);
	    }
}
