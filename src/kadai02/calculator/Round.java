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
	private double calculate() {

		MathUtil math = new MathUtil();
		ChangeNumUtil changeNum = new ChangeNumUtil();

		double tmp_num = changeNum.changeStringToDouble(num);
		int tmp_keta = changeNum.changeStringToInt(keta);

		// 四捨五入したい値が整数部の1桁目にくるように掛ける値を変数に代入
		double pow = math.calculatePow(10.0d, tmp_keta - 1);

		// 四捨五入処理を行い、変数roundに代入
		double round = (int)(tmp_num * pow + 0.5d);

		// 整数部の桁を初期値に戻す
		round /= pow;

		// 四捨五入後の値を返す
		return round;

	}

	/**
	 * 結果をString型に変換し、表します。
	 * @return 結果をString型にしたもの
	 */
	public String result() {

		// 結果を格納する変数を宣言
		String result = "";

		// 結果をString型に変換
		result = ("*Round：結果 = " + String.valueOf(calculate()));

		// 計算結果を返す
		return result;
	}

	/**
	 * 入力値など過程を表します。
	 * @return 入力値など結果までの過程
	 */
	public String detail() {

		// 結果までの過程を変数に格納
		String detail = ("*Round：num = " + num + ",keta = " + keta);

		// 入力値など過程を返す
		return detail;
	}
}
