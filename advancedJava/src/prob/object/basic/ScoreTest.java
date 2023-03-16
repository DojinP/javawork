package prob.object.basic;

class Score {
	private String name;
	private int koreanScore;
	private int englishScore;
	private int mathScore;
	private int totScore;
	private double scoreAvg;
	
	public Score(String name, int koreanScore, int englishScore, int mathScore) {
		super();
		this.name = name;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		this.totScore = koreanScore + englishScore + mathScore;
		this.scoreAvg = totScore / 3.0;
	}
	
	public void print() {
		System.out.println(name + "\t" + koreanScore + "\t" + englishScore + "\t" + mathScore + "\t" + totScore + "\t" + scoreAvg);
	}

	public String getName() {
		return name;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public int getTotScore() {
		return totScore;
	}

	public double getScoreAvg() {
		return scoreAvg;
	}
	
}

public class ScoreTest {
	public static void main(String[] args) {
		int totalScore = 0;
		Score s1 = new Score("홍길동", 10, 20, 30);

		Score s2 = new Score("김자바", 50, 40, 60);

		Score s3 = new Score("이디비", 70, 100, 50);

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		s1.print();
		s2.print();
		s3.print();

		System.out.print("총  계\t");
		// 총계용 국어, 영어, 수학, 총점, 평균값을 계산하여 출력되도록
		// 이곳을 완성하시오.
		int k_tot = s1.getKoreanScore() + s2.getKoreanScore() + s3.getKoreanScore();
		int e_tot = s1.getEnglishScore() + s2.getEnglishScore() + s3.getEnglishScore();
		int m_tot = s1.getMathScore() + s2.getMathScore() + s3.getMathScore();
		int tot = k_tot + e_tot + m_tot;
		double avg = tot / 3.0;
		
		System.out.print(k_tot + "\t");
		System.out.print(e_tot + "\t");
		System.out.print(m_tot + "\t");
		System.out.print(tot + "\t");
		System.out.print(avg);

	}
}