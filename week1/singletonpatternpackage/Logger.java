/**
 * 
 */
package singletonpatternpackage;

/**
 * 
 */
public class Logger {

	/**
	 * @param args
	 */
	private static Logger instance;	//ensures that only one instance is created 
	
	private Logger()	//to prevent the instantiation of the class from external entities
	{
		
	}
	
	public static Logger getInstance() {
        if (instance == null) {
        	synchronized(Logger.class) {
        		if(instance==null) {
        			instance = new Logger();
        		}
        	}
            
        }
        return instance;
    }
	
	  public void doSomething(String message) {
	        System.out.println("Log message: " + message);
	    }
	
	
	
}



