package kadai02.calculator;

import kadai02.common.ChangeNumUtil;

public class Dcm {

	public String num1;
	public String num2;

	/**
	 * 最大公約数を求めます
	 * @param num1 引数1
	 * @param num2 引数2
	 * @return 引数1と引数2の最大公約数
	 */
	public int result() {

		ChangeNumUtil changeNum = new ChangeNumUtil();

		int tmp_num1 = changeNum.getIntNum(num1);
		int tmp_num2 = changeNum.getIntNum(num2);

		int big = 0;
		int small = 0;

		// 引数の大きさを比べ、変数に代入
		if(tmp_num1 >= tmp_num2) {

			big = tmp_num1;
			small = tmp_num2;
		} else {

			big = tmp_num2;
			small = tmp_num1;
		}

		// 引数の大きい方を小さい方で割り、その余りが0になるまで繰り返し処理を行う
		while(big % small != 0) {

			// 大きい方を小さい方で割った余りを変数に代入
			int remainder = big % small;

			// 小さい方を割られる数に、余りを割る数に設定
			big = small;
			small = remainder;
		}

		// 割る数（小さい方）を返す
		return small;
	}

}
