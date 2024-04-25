package com.hypech.rxjava;

import io.reactivex.rxjava3.core.Observable;
//io.reactivex.rxjava3.core.Flowable: 0 . .N流，支持反应流和反压
//io.reactivex.rxjava3.core.Observable:0 . .N流，无反压，
//io.reactivex.rxjava3.core.Single: 一个恰好有1项的流或一个错误，
//io.reactivex.rxjava3.core.Completable: 一个没有条目的流，只有一个完成或错误信号，
//io.reactivex.rxjava3.core.Maybe:没有项的流，只有一个项或一个错误。

public class RxJavaSample {
    public static void main(String[] args) {
        Observable.range(1, 5)
                .subscribe(System.out::println);
    }
}
