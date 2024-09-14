package ODC;

public class Client {

	public static void main(String[] args) {
		//Create observable
		ScoreBoardObservableImpl boardObservableImpl=new ScoreBoardObservableImpl();
		
		//Subscribe Observers to Observable
		CricbuzzCricketObserver cricbuzzCricketObserver=new CricbuzzCricketObserver();
		CricInfoCricketObserverImpl cricInfoCricketObserverImpl=new CricInfoCricketObserverImpl();
		
		boardObservableImpl.subscribe(cricbuzzCricketObserver);
		boardObservableImpl.subscribe(cricInfoCricketObserverImpl);
		
		//Lets say somehow State/Score changed then we need to notify
		boardObservableImpl.scoreChanged(10);
		
		//unsubscribe any observer
		boardObservableImpl.unSubscribe(cricInfoCricketObserverImpl);
		
		//score again changed
		boardObservableImpl.scoreChanged(20);

	}

}
