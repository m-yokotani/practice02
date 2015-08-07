package kadai02.calculator;

import kadai02.common.ChangeNumUtil;
import kadai02.common.MathUtil;

public class Rohrer {

	public String weight;
	public String height;

	/**
	 * ローレル指数を計算します
	 * @param weight 引数1
	 * @param height 引数2
	 * @return 引数1と引数2を使用してローレル指数を計算した結果
	 */
	private double calculate() {

		MathUtil math = new MathUtil();
		ChangeNumUtil changeNum = new ChangeNumUtil();

		double tmp_weight = changeNum.changeStringToDouble(weight);
		double tmp_height = changeNum.changeStringToDouble(height);

		// べき乗の計算
		double pow01 = math.calculatePow(tmp_height, 3);
		double pow02 = math.calculatePow(10.0d, 7);

		// ローレル指数 = 体重×10^7/身長^3
		double rohrer = (tmp_weight * pow02) / pow01;

		// 計算結果を返す
		return rohrer;
	}

	/**
	 * ローレル指数から太り具合の判定をします
	 * @param Rohrer 引数1
	 * @return 引数1から太り具合を判定した結果
	 */
	public String result() {

		// 結果格納変数の宣言
		String resultJudge = "";
		String result = "";

		// ローレル指数が100未満だった場合
		if (calculate() < 100.0d) {

			// 判定結果「痩せすぎ」を格納
			resultJudge = "痩せすぎ";

		// ローレル指数が100以上115未満だった場合
		} else if (calculate() >= 100.0d && calculate() < 115.0d) {

			// 判定結果「やや痩せすぎ」を格納
			resultJudge = "やや痩せすぎ";

		// ローレル指数が115以上150未満だった場合
		} else if (calculate() >= 115.0d && calculate() < 150.0d) {

			// 判定結果「平均」を格納
			resultJudge = "平均";

		// ローレル指数が150以上160未満だった場合
		}else if (calculate() >= 150.0d && calculate() < 160.0d) {

			// 判定結果「やや太りぎみ」を格納
			resultJudge = "やや太りぎみ";

		// ローレル指数が160以上だった場合
		}else if (calculate() >= 160.0d) {

			// 判定結果「太り過ぎ」を格納
			resultJudge = "太り過ぎ";
		}

		// 結果を変数に格納
		result = ("*Rohrer：結果 = " + resultJudge);

		// 判定結果を返す
		return result;
	}

	/**
	 * 入力値など過程を表します。
	 * @return 入力値など結果までの過程
	 */
	public String detail() {

		// 結果までの過程を変数に格納
		String detail = ("*Rohrer：体重：" + weight + ", 身長：" + height + "\n ローレル指数 = " + calculate());

		// 入力値など過程を返す
		return detail;
	}

}
