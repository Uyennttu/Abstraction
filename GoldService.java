package abstraction;

public class GoldService extends MemberService {
	@Override
	public boolean login(String id, String password) {
		System.out.println("Gold ID: "+ id);
		System.out.println("You are using Gold service.");
		return true;
	}

	@Override
	public void discount(double total) {
		double finalTotal = total * 0.75;
		System.out.println("Total: $" + total);
		System.out.println("Subtotal: $" + finalTotal);
		System.out.println("Your saving: $" + (total - finalTotal));		
	}
}
