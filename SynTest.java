public class SynTest{

	public void syncBlock(){
		synchronized(this){
			System.out.println("hello block");
		}
	}

	public synchronized void syncMethod(){
		System.out.println("hello method");
	}

}
