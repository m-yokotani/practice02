package kadai02.calculator;

import kadai02.common.ChangeNumUtil;

public class Lcm {

	public String num1;
	public String num2;

	/**
	 * 最大公倍数を求めます
	 * @param num1 引き数1
	 * @param num2 引数2
	 * @return 引数1と引数2の最大勾配数を求めた結果
	 */
	public int getLcm() {

		Dcm dcm = new Dcm();
		ChangeNumUtil changeNum = new ChangeNumUtil();

		dcm.num1 = num1;
		dcm.num2 = num2;

		int tmp_num1 = changeNum.getIntNum(num1);
		int tmp_num2 = changeNum.getIntNum(num2);

		// 2つの引数の最大公約数を変数に代入
		int resultDcm = dcm.getDcm();

		// 最大公倍数 = (引数1×引数2)÷引数1と引数2の最大公約数
		int lcm = (tmp_num1 * tmp_num2) / resultDcm;

		// 最大公倍数を返す
		return lcm;
	}

	/**
	 * 結果をString型に変換し、表します。
	 * @return 結果をString型にしたもの
	 */
	public String result() {

		// 結果を格納する変数を宣言
		String result = "";

		// 結果をString型に変換
		result = ("結果 = " + String.valueOf(getLcm()));

		// 計算結果を返す
		return result;
	}

	/**
	 * 入力値など過程を表します。
	 * @return 入力値など結果までの過程
	 */
	public String detail() {

		// 結果までの過程を変数に格納
		String detail = ("引数1 = " + num1 + ", 引数2 = " + num2);

		// 入力値など過程を返す
		return detail;
	}
}
