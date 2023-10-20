package abstraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String id = "AA";
		String password = "111";
		System.out.println("Input your membership: ");
		int memberlevel = input.nextInt();

		MemberService service = MemberService.getMemberService(memberlevel);
		service.login(id, password);

		double total = 100;
		service.discount(total);
	}
}
