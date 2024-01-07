package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendEmail(emailId, "Mail sent");
    }

    private void sendEmail(String emailId, String msg) {

        System.out.println(emailId+ " "+ msg);
    }
}
