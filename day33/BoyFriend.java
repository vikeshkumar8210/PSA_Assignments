package day33;

public class BoyFriend {
	private String boyName;
	private GirlFriend girlFriend;
	
	public BoyFriend(String boyName, GirlFriend girlfriend) {
		this.boyName = boyName;
		this.girlFriend= girlfriend;
	}
	
	public static void main(String[] args) {
		GirlFriend gf = new GirlFriend ("sita");
		BoyFriend bf = new BoyFriend ("mike", gf);
		System.out.println(bf.boyName);
		System.out.println(gf.girlFriend.getGirlName());
	}

}
