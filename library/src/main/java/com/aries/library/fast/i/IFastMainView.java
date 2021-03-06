package com.aries.library.fast.i;

import android.support.annotation.Nullable;

import com.flyco.tablayout.CommonTabLayout;
import com.aries.library.fast.entity.FastTabEntity;

import java.util.List;

/**
 * Created: AriesHoo on 2017/7/19 16:40
 * Function: 主界面
 * Desc:
 */
public interface IFastMainView {

    /**
     * 控制主界面Fragment是否可滑动切换
     *
     * @return
     */
    boolean isSwipeEnable();

    /**
     * 用于添加Tab属性(文字-图标)
     */
    @Nullable
    List<FastTabEntity> getTabList();

    /**
     * 返回CommonTabLayout 对象用于自定义设置
     *
     * @param tabLayout
     */
    void setTabLayout(CommonTabLayout tabLayout);
}
