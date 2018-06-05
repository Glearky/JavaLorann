package element;

public class Score {
	private int score = 0;
	
	public void IncreaseScore() {
		score = score +1;
		System.out.print("Le score est de = ");
		System.out.println(score);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
