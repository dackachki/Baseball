
class batter {
	int index;
	String name;
	double average;
	int power;
	double SLG;
	double homerun;
	int games = 144;
	double war;
	String style;
	double OPS;
	double OBP;

	void 출력() {

		System.out.printf("%s의 예상 타율은 %.3f, 예상 홈련 갯수는 %.1f개, 예상 war는 %.2f,예상 OPS는 %,2f 입니다.\n", name, average,
				gethomerun(), getWAR(), getOPS());
		System.out.printf("Style = %s\n", style);
		System.out.printf("장타율 = %s\n", getSLU());
		System.out.printf("출루율 = %s\n", OBP);
		
	}

	double gethomerun() {
		homerun = (((games * 3.1) * average) * getSLU());
		return homerun;
	}

	double getSLU() {
		SLG = ((power * average) / 100) + 0.3;
		return SLG;

	}

	double getOPS() {
		OBP = ((games * 3.1) * average) / 300;
		OPS = OBP + getSLU();
		return OPS;
	}

	double getWAR() {
		war = (OPS * 100) + (homerun * 0.05);
		return war;
	}

}

class homer extends batter {
	homer() {

		style = "sluggger";
		OPS = OPS + 0.05;

	}
}

class contact extends batter {
	contact() {
		style = "contact";
		this.average = average + 0.05;
	}
}