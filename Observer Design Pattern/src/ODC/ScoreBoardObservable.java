package ODC;

public interface ScoreBoardObservable {

	public void subscribe(CricketObserver observer);
	
	public void unSubscribe(CricketObserver observer);
	
	public void notifyObservers();
	
}
