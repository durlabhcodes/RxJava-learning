package com.layzbot;

import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.schedulers.Schedulers;

public class HelloWorld {
    public static void main(String[] args) {
        Observable<Integer> stringObservable = Observable.range(0,10);

        stringObservable.map(integer -> integer*2).subscribe(System.out::println);
    }
}
