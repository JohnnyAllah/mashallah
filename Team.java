import java.util.ArrayList;

public class Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mu = new Member("Johnny");
		Member chad = new Member("Evan");
		Member t = new Member("Henrique");
		Member c = new Member("Alberta");
		
		
		ArrayList<Member> list = new ArrayList();
		list.add(mu);
		list.add(chad);
		list.add(t);
		list.add(c);
		
		System.out.println("The best member: " + select(list));
	}
	
	public static Member select(ArrayList<Member> list) {
		for (Member m : list) {
			if (m.haram.equals("Evan")) {
				return m;
			}
		}
		return null;
	}
	
}
