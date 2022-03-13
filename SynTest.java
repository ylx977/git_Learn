public class SynTest{

	public void syncBlock(){
		synchronized(this){
			System.out.println("hello block");
		}
	}

	public synchronized void syncMethod(){
		System.out.println("hello method");
	}


	// this is a commnet after i build a tag of master_tag_20220313_1613 on master

}
