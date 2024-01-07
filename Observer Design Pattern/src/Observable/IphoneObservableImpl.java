package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount=0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        observerList.forEach(NotificationAlertObserver :: update);
    }

    @Override
    public void setData(int stock) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount=stock;
    }

    @Override
    public Integer getData() {
        return stockCount;
    }
}
