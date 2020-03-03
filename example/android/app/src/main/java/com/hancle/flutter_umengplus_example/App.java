package com.hancle.flutter_umengplus_example;

import com.hancle.flutter_umengplus.FlutterUmengplusPlugin;

import io.flutter.app.FlutterApplication;

public class App extends FlutterApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        FlutterUmengplusPlugin.init(this, "xxx", "umeng", "xxxx");
    }
}
