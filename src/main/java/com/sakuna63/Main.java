package com.sakuna63;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class Main {
    public static void main(String[] args) {

    }

    private static class LogObserver<T> implements Observer<T> {

        @Override
        public void onSubscribe(Disposable d) {
            System.out.println("onSubscribe() called with: " + "d = [" + d + "]");
        }

        @Override
        public void onNext(T t) {
            System.out.println("onNext() called with: " + "t = [" + t + "]");
        }

        @Override
        public void onError(Throwable e) {
            System.out.println("onError() called with: " + "e = [" + e + "]");
        }

        @Override
        public void onComplete() {
            System.out.println("onComplete() called with: " + "");
        }
    }

    private static class LogSingleObserver<T> implements SingleObserver<T> {
        @Override
        public void onSubscribe(Disposable d) {
            System.out.println("onSubscribe() called with: " + "d = [" + d + "]");
        }

        @Override
        public void onSuccess(T t) {
            System.out.println("onSuccess() called with: " + "t = [" + t + "]");
        }

        @Override
        public void onError(Throwable e) {
            System.out.println("onError() called with: " + "e = [" + e + "]");
        }
    }
}
