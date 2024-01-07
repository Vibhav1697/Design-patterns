package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String phone;
    StockObservable observable;

    public MobileAlertObserverImpl(String phone, StockObservable observable){
        this.phone=phone;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendMsg(phone, "Mail sent");
    }

    private void sendMsg(String phone, String msg) {

        System.out.println(phone+ " "+ msg);
    }
}
