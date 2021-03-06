package com.aries.library.fast;

import android.app.Application;
import android.os.Build;

import com.aries.library.fast.util.ToastUtil;

import java.util.Arrays;

import cn.bingoogolapple.swipebacklayout.BGASwipeBackManager;

/**
 * Created: AriesHoo on 2017/8/5 14:16
 * Function: 用于配置部分初始化事宜
 * Desc:
 */
public class FastApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtil.init(getApplicationContext());//初始化Toast工具类
        BGASwipeBackManager.getInstance().init(this);//初始化滑动返回关闭Activity功能
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.KITKAT)//4.4及以下导航栏处理--不设置然后4.4模拟器试试就知道
            BGASwipeBackManager.ignoreNavigationBarModels(Arrays.asList(Build.MODEL));
    }
}
