package Decoratorpackage;


public class Test {

    public static void main(String[] args) {
        // Create an EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate the EmailNotifier with SMS functionality
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate the SMSNotifier with Slack functionality
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send a message using the decorated notifiers
        slackNotifier.send("Hello, World!");
    }
}

