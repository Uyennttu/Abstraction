package abstraction;

public abstract class MemberService {
	static final int SILVER = 1;
	static final int GOLD = 2;
	static final int DIAMOND = 3;

	public abstract boolean login(String id, String password);

	public abstract void discount(double total);

	public static MemberService getMemberService(int memberlevel) {
		switch (memberlevel) {
		case SILVER: {
			return new SilverService();
		}
		case GOLD: {
			return new GoldService();
		}
		case DIAMOND: {
			return new DiamondService();
		}
		}
		return null;
	}
}
