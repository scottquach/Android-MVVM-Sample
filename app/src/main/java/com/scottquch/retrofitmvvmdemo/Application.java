package com.scottquch.retrofitmvvmdemo;

import timber.log.Timber;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new MyDebugTree());
    }

    public class MyDebugTree extends Timber.DebugTree {
        @Override
        protected String createStackElementTag(StackTraceElement element) {
            return String.format("[L:%s] [M:%s] [C:%s]",
                    element.getLineNumber(),
                    element.getMethodName(),
                    super.createStackElementTag(element));
        }
    }
}
