package kadai02;

import kadai02.calculator.Dcm;
import kadai02.calculator.Lcm;
import kadai02.calculator.Rohrer;
import kadai02.calculator.Round;

public class Runner {

	/**
	 * 計算処理、結果の表示を行います
	 * @param args 入力値
	 */
	public static void main(String[] args) {

		/*
		【次回課題のメモ】
		1こめ ｺﾚ
		String[] details = new String[10];
		String[] results = new String[10];

		2ｺﾒ インターフェイスがあるとできるやつ
		Object[] calculators = new Object[10];


		はっしゅ　つぎの課題
		HashMap<String, String> all_results = new HashMap<String, String>();
		*/

		// 結果を格納する変数の初期化
		String detail = "";
		String result = "";

		switch (args[0]) {

		// 計算方法に「Round」と入力された場合
		case "Round" :

			Round round = new Round();

			round.num = args[1];
			round.keta = args[2];

			detail = round.detail();
			result = round.result();
			break;

		// 計算方法に「Rohrer」と入力された場合
		case "Rohrer" :

			Rohrer rohrer = new Rohrer();

			rohrer.weight =  args[1];
			rohrer.height =  args[2];

			detail = rohrer.detail();
			result = rohrer.result();

			break;

		// 計算方法に「Dcm」と入力された場合
		case "Dcm" :

			Dcm dcm = new Dcm();

			dcm.num1 = args[1];
			dcm.num2 = args[2];

			detail = dcm.detail();
			result = dcm.result();

			break;

		// 計算方法に「Lcm」と入力された場合
		case "Lcm" :

			Lcm lcm = new Lcm();

			lcm.num1 = args[1];
			lcm.num2 = args[2];

			detail = lcm.detail();
			result = lcm.result();

			break;

		// 計算方法に「All」と入力された場合
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

			System.out.println("*計算方法 = " + args[0]);
			System.out.println("*入力値エラー：\"" + args[0] + "\"は計算方法にありません。入力しなおしてください");

			System.exit(1);
		}

		System.out.println("*計算方法 = " + args[0]);
		System.out.println("\n【過程】\n" + detail);
		System.out.println("\n【結果】\n" + result);
	}
}
