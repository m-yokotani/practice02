package kadai02;

import java.util.ArrayList;
import java.util.HashMap;

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
		*/

		if(!"All".equals(args[0]) && !"Round".equals(args[0]) && !"Rohrer".equals(args[0]) && !"Dcm".equals(args[0]) && !"Lcm".equals(args[0])) {

			System.out.println("*計算方法 = " + args[0]);
			System.out.println("*入力値エラー：\"" + args[0] + "\"は計算方法にありません。入力しなおしてください");

			System.exit(1);
		}

		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		try {

			if("All".equals(args[0]) || "Round".equals(args[0])) {

				// Roundインスタンスを生成
				Round round = new Round(args[1], args[2]);

				HashMap<String, String> roundMap = new HashMap<String, String>();

				roundMap.put("name", "Round");
				roundMap.put("detail", round.detail());
				roundMap.put("result", String.valueOf(round.result()));

				list.add(roundMap);

			}

			if("All".equals(args[0]) || "Rohrer".equals(args[0])) {
				// Rohrerインスタンスを生成
				Rohrer rohrer = new Rohrer(args[1], args[2]);

				HashMap<String, String> rohrerMap = new HashMap<String, String>();

				rohrerMap.put("name", "Rohrer");
				rohrerMap.put("detail", rohrer.detail());
				rohrerMap.put("result", String.valueOf(rohrer.result()));
				rohrerMap.put("judge", rohrer.judge());

				list.add(rohrerMap);
			}

			if("All".equals(args[0]) || "Dcm".equals(args[0])) {

				// Dcmインスタンスを生成
				Dcm dcm = new Dcm(args[1], args[2]);

				HashMap<String, String> dcmMap = new HashMap<String, String>();

				dcmMap.put("name", "Dcm");
				dcmMap.put("detail", dcm.detail());
				dcmMap.put("result", String.valueOf(dcm.result()));

				list.add(dcmMap);
			}

			if("All".equals(args[0]) || "Lcm".equals(args[0])) {

				// Lcmインスタンスを生成
				Lcm lcm = new Lcm(args[1], args[2]);

				HashMap<String, String> lcmMap = new HashMap<String, String>();

				lcmMap.put("name", "Lcm");
				lcmMap.put("detail", lcm.detail());
				lcmMap.put("result", String.valueOf(lcm.result()));

				list.add(lcmMap);
			}

		} catch (NumberFormatException e){

			System.err.println("入力値に数値ではない値が含まれています。数値を入力して下さい。\n");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.err.println("入力値が足りません。入力値は2つ指定して下さい。\n");
		}


		System.out.println("★計算方法 = " + args[0] + "\n");

		for (int i = 0; i < list.size(); i++){

			HashMap<String, String> map = list.get(i);

			if ("Rohrer".equals(map.get("name"))) {

				System.out.println(map.get("detail"));
				System.out.println("*" + map.get("name") + "：結果 = " + map.get("result"));
				System.out.println(map.get("judge") + "\n");

			} else {

				System.out.println(map.get("detail"));
				System.out.println("*" + map.get("name") + "：結果 = " + map.get("result") + "\n");
			}
		}
	}
}
