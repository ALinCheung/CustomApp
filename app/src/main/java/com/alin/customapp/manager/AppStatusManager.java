package com.alin.customapp.manager;

import com.alin.customapp.constant.AppStatusConstant;

/**
 * @Description APP状态管理器
 * @Author zhangwl
 * @Date 2021/7/6 9:27
 */
public class AppStatusManager {
    /**
     * APP状态 初始值为没启动 不在前台状态
     */
    public int appStatus = AppStatusConstant.STATUS_FORCE_KILLED;

    public static AppStatusManager appStatusManager;

    private AppStatusManager() {

    }

    public static AppStatusManager getInstance() {
        if (appStatusManager == null) {
            appStatusManager = new AppStatusManager();
        }
        return appStatusManager;
    }

    public int getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(int appStatus) {
        this.appStatus = appStatus;
    }
}