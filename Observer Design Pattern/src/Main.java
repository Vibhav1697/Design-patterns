import Observable.IphoneObservableImpl;
import Observable.StockObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;

public class Main {
    public static void main(String[] args) {
        StockObservable observable  = new IphoneObservableImpl();
        EmailAlertObserverImpl observer1 = new EmailAlertObserverImpl("abc@gmail.com", observable);
        EmailAlertObserverImpl observer2 = new EmailAlertObserverImpl("bcd@gmail.com",observable);
        MobileAlertObserverImpl observer3 = new MobileAlertObserverImpl("22334", observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        observable.setData(100);



    }
}