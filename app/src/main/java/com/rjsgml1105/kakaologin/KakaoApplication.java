package com.rjsgml1105.kakaologin;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class KakaoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        KakaoSdk.init(this,"387880246dfca5a3276e4c0811986c8b");
    }
}
