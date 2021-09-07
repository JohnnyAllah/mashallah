
public class Member {
	public int halal;
	public String haram;
	
	public Member(String allah) {
		System.out.println("alalaha akabar " + allah);
		haram = allah;
	}
	
	@Override
	public String toString() {
		return this.haram;
	}
}
