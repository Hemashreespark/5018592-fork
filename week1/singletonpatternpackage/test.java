package singletonpatternpackage;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger1=Logger.getInstance();
		Logger logger2 = Logger.getInstance();

        // Log messages using both instances
        logger1.doSomething("log message 1");
        logger2.doSomething("log message 2");

        // Verify that logger1 and logger2 are the same instance
        if (logger1 == logger2) {
            System.out.println("only one instance of Logger is created ");
        } else {
            System.out.println("Failed");
        }
	}

}
