package ODC;

public class CricInfoCricketObserverImpl implements CricketObserver {
	
	Integer score;
	
	@Override
	public void update(Integer score) {
		this.score=score;
		displayScore();
	}
	
	public void displayScore() {
		System.out.println("CricInfo Score : "+score);
	}

}
