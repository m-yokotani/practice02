package kadai02;

import kadai02.calculator.Dcm;
import kadai02.calculator.Lcm;
import kadai02.calculator.Rohrer;
import kadai02.calculator.Round;

public class Runner {

	public static void main(String[] args) {

		String detail = "";
		String result = "";

		switch (args[0]) {

		case "Round" :

			Round round = new Round();

			round.num = args[1];
			round.keta = args[2];

			detail = round.detail();
			result = round.result();

			break;

		case "Rohrer" :

			Rohrer rohrer = new Rohrer();

			rohrer.weight =  args[1];
			rohrer.height =  args[2];

			detail = rohrer.detail();
			result = rohrer.result();

			break;

		case "Dcm" :

			Dcm dcm = new Dcm();

			dcm.num1 = args[1];
			dcm.num2 = args[2];

			detail = dcm.detail();
			result = dcm.result();

			break;

		case "Lcm" :

			Lcm lcm = new Lcm();

			lcm.num1 = args[1];
			lcm.num2 = args[2];

			detail = lcm.detail();
			result = lcm.result();

			break;

		case "All" :

			Round roundAll = new Round();
			Rohrer rohrerAll = new Rohrer();
			Dcm dcmAll = new Dcm();
			Lcm lcmAll = new Lcm();

			roundAll.num = args[1];
			roundAll.keta = args[2];

			rohrerAll.weight = args[3];
			rohrerAll.height = args[4];

			dcmAll.num1 = args[5];
			dcmAll.num2 = args[6];

			lcmAll.num1 = args[7];
			lcmAll.num2 = args[8];

			detail = (roundAll.detail() + "\n" + rohrerAll.detail() + "\n" + dcmAll.detail() + "\n" + lcmAll.detail());
			result = (roundAll.result() + "\n" + rohrerAll.result() + "\n" + dcmAll.result() + "\n" + lcmAll.result());

			break;

		default :

			detail = "*入力値エラー：入力しなおしてください";
			result = "*入力値エラー：入力しなおしてください";
		}

		System.out.println("*入力値 = " + args[0]);
		System.out.println("\n【過程】\n" + detail);
		System.out.println("\n【結果】\n" + result);
	}
}
