package kadai02.calculator;

import kadai02.common.ChangeNumUtil;
import kadai02.common.MathUtil;

public class Round {

	public String num;
	public String keta;

	/**
	 * 四捨五入を行います。
	 * @param num 引数1
	 * @param keta 引数2
	 * @return 引数1を引数2の桁数で四捨五入した結果
	 */
	public double result() {

		MathUtil math = new MathUtil();
		ChangeNumUtil changeNum = new ChangeNumUtil();

		double tmp_num = changeNum.getDoubleNum(num);
		int tmp_keta = changeNum.getIntNum(keta);

		// 四捨五入したい値が整数部の1桁目にくるように掛ける値を変数に代入
		double pow = math.getPow(10.0d, tmp_keta - 1);

		// 四捨五入処理を行い、変数roundに代入
		double round = (int)(tmp_num * pow + 0.5d);

		// 整数部の桁を初期値に戻す
		round /= pow;

		// 四捨五入後の値を返す
		return round;

	}
}
