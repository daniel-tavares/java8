package lambdas;

public class ThreadLambda extends Thread {
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();
		
		System.out.println("JAVA8 - LAMBDA");
		new Thread(()->System.out.println("executando um Runnable"));
	}


}
