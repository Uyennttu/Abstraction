package abstraction;

public class DiamondService extends MemberService {
	@Override
	public boolean login(String id, String password) {
		System.out.println("Diamond ID: "+ id);
		System.out.println("You are using Diamond service.");
		return true;
	}

	@Override
	public void discount(double total) {
		double finalTotal = total * 0.5;
		System.out.println("Total: $" + total);
		System.out.println("Subtotal: $" + finalTotal);
		System.out.println("Your saving: $" + (total - finalTotal));		
	}
}
