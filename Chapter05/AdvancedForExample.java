package Chapter05;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수총합=" + sum);

		double avg = (double) sum / scores.length; // 총합에 5를 나눠서 평균
		System.out.println("점수 평균=" + avg);
	}
}
