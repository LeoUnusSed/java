package com.hypech.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class RxJavaApplication {
    public static void main(String[] args) {
        Observable.range(1, 5)
                .subscribe(System.out::println);
    }
}
