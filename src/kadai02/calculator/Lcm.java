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
	public int result() {

		Dcm dcm = new Dcm();
		ChangeNumUtil changeNum = new ChangeNumUtil();

		dcm.num1 = num1;
		dcm.num2 = num2;

		int tmp_num1 = changeNum.getIntNum(num1);
		int tmp_num2 = changeNum.getIntNum(num2);

		// 2つの引数の最大公約数を変数に代入
		int resultDcm = dcm.result();

		// 最大公倍数 = (引数1×引数2)÷引数1と引数2の最大公約数
		int lcm = (tmp_num1 * tmp_num2) / resultDcm;

		// 最大公倍数を返す
		return lcm;
	}

}
