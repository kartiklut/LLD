package ODC;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoardObservableImpl implements ScoreBoardObservable {

	List<CricketObserver> observsers = new ArrayList<>();
	Integer score;

	@Override
	public void subscribe(CricketObserver observer) {
		// TODO Auto-generated method stub
		if (!observsers.contains(observer)) {
			observsers.add(observer);
		}
	}

	@Override
	public void unSubscribe(CricketObserver observer) {
		// TODO Auto-generated method stub
		if (observsers.contains(observer)) {
			observsers.remove(observer);
		}

	}

	@Override
	public void notifyObservers() {
		for (CricketObserver observser : observsers) {
			observser.update(score);
		}

	}

	public void scoreChanged(Integer newScore) {
		score = newScore;
		notifyObservers();
	}

}
