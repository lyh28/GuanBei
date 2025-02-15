package com.lyh.guanbei.common;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.lyh.guanbei.bean.Model;
import com.lyh.guanbei.bean.Tag;
import com.lyh.guanbei.db.DaoMaster;
import com.lyh.guanbei.manager.DBManager;
import com.lyh.guanbei.util.ActivityLifecycleListener;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import org.greenrobot.greendao.database.Database;

import androidx.multidex.MultiDex;
import cn.jpush.android.api.JPushInterface;

public class GuanBeiApplication extends Application {
    private static Context context;
    private static RefWatcher refWatcher;
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        registerActivityLifecycleCallbacks(new ActivityLifecycleListener());
        //推送 可异步
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        //设置通知栏
//        LogUtil.logD("该设备号： " + JPushInterface.getRegistrationID(this));
        //数据库
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, "guanbei_db");
        Database db = helper.getWritableDb();
        DBManager.getInstance().setDaoSession(new DaoMaster(db).newSession());

        //需要额外的标志或放在注册功能下
        DBManager.getInstance().getDaoSession().getTagDao().deleteAll();
        Tag.InsertPresetInList();
        Tag.InsertPresetOutList();
        DBManager.getInstance().getDaoSession().getModelDao().loadAll();
        //LeakCanary
        refWatcher=setupLeakCanary();
    }
    private RefWatcher setupLeakCanary(){
        if(LeakCanary.isInAnalyzerProcess(this))
            return RefWatcher.DISABLED;
        else
            return LeakCanary.install(this);
    }

    public static RefWatcher getRefWatcher() {
        return refWatcher;
    }

    public static Context getContext() {
        return context;
    }

    public static void showShortToast(Context context, String content) {
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
    }

    public static void showLongToast(Context context, String content) {
        Toast.makeText(context, content, Toast.LENGTH_LONG).show();
    }
}
