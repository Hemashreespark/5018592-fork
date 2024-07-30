package singletonpatternpackage;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger1=Logger.getInstance();
		Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("only one instance of Logger is created ");
        } else {
            System.out.println("Failed");
        }
	}

}
