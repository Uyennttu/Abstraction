package abstraction;

public class SilverService extends MemberService {
	@Override
	public boolean login(String id, String password) {
		System.out.println("Silver ID: " + id);
		System.out.println("You are using Silver service.");
		return true;
	}

	@Override
	public void discount(double total) {
		double finalTotal = total * 0.9;
		System.out.println("Total: $" + total);
		System.out.println("Subtotal: $" + finalTotal);
		System.out.println("Your saving: $" + (total - finalTotal));
	}
}
