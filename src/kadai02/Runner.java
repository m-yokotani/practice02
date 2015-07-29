package kadai02;

import kadai02.calculator.Dcm;
import kadai02.calculator.Lcm;
import kadai02.calculator.Rohrer;
import kadai02.calculator.Round;

public class Runner {

	public static void main(String[] args) {

		String result = "";

		if ("Round".equals(args[0])) {

			Round round = new Round();

			round.num = args[1];
			round.keta = args[2];

			result = round.result();

		} else if ("Rohrer".equals(args[0])) {

			Rohrer rohrer = new Rohrer();

			rohrer.weight =  args[1];
			rohrer.height =  args[2];

			result = rohrer.result();

		} else if ("Dcm".equals(args[0])) {

			Dcm dcm = new Dcm();

			dcm.num1 = args[1];
			dcm.num2 = args[2];

			result = dcm.result();

		} else if ("Lcm".equals(args[0])) {

			Lcm lcm = new Lcm();

			lcm.num1 = args[1];
			lcm.num2 = args[2];

			result = lcm.result();
		}

		System.out.println(result);
	}
}
