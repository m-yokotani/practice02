package kadai02.calculator;

import kadai02.common.ChangeNumUtil;
import kadai02.common.MathUtil;

public class Rohrer {

	public String weight;
	public String height;

	public double getValue;

	/**
	 * ローレル指数を計算します
	 * @param weight 引数1
	 * @param height 引数2
	 * @return 引数1と引数2を使用してローレル指数を計算した結果
	 */
	public double getRohrer() {

		MathUtil math = new MathUtil();
		ChangeNumUtil changeNum = new ChangeNumUtil();

		double tmp_weight = changeNum.getDoubleNum(weight);
		double tmp_height = changeNum.getDoubleNum(height);

		// べき乗の計算
		double pow01 = math.getPow(tmp_height, 3);
		double pow02 = math.getPow(10.0d, 7);

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

		// 結果格納変数の初期化
		String getJudge = "";

		// ローレル指数が100未満だった場合
		if (getValue < 100.0d) {

			// 判定結果「痩せすぎ」を格納
			getJudge = "痩せすぎ";

		// ローレル指数が100以上115未満だった場合
		} else if (getValue >= 100.0d && getValue < 115.0d) {

			// 判定結果「やや痩せすぎ」を格納
			getJudge = "やや痩せすぎ";

		// ローレル指数が115以上150未満だった場合
		} else if (getValue >= 115.0d && getValue < 150.0d) {

			// 判定結果「平均」を格納
			getJudge = "平均";

		// ローレル指数が150以上160未満だった場合
		}else if (getValue >= 150.0d && getValue < 160.0d) {

			// 判定結果「やや太りぎみ」を格納
			getJudge = "やや太りぎみ";

		// ローレル指数が160以上だった場合
		}else if (getValue >= 160.0d) {

			// 判定結果「太り過ぎ」を格納
			getJudge = "太り過ぎ";
		}

		// 判定結果を返す
		return getJudge;
	}

}
