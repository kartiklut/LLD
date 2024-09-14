package ODC;

public class CricbuzzCricketObserver implements CricketObserver {
	
	Integer score;

	@Override
	public void update(Integer score) {
		// TODO Auto-generated method stub
		this.score=score;
		displayScore();
	}
	
	public void displayScore() {
		System.out.println("CrickBuzz Score : "+score);
	}

}
