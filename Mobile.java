package week1.day2assignment;

public class Mobile {
	public void sendMessage() {
		System.out.println("sendMessage");
	}
	public void shareDocuments() {
		System.out.println("shareDocuments");
	}
	public void call() {
		System.out.println("call");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj=new Mobile();
		obj.sendMessage();
		obj.shareDocuments();
		obj.call();

	}

}
