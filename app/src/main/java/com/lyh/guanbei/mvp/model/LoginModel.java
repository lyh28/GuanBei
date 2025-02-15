package com.lyh.guanbei.mvp.model;

import com.lyh.guanbei.base.ICallbackListener;
import com.lyh.guanbei.bean.User;
import com.lyh.guanbei.http.APIManager;
import com.lyh.guanbei.http.BaseObscriber;
import com.lyh.guanbei.mvp.contract.LoginContract;

public class LoginModel implements LoginContract.ILoginModel {
    @Override
    public void login(String pwd,String phone,final ICallbackListener<User> iCallbackListener){
        APIManager.logIn(pwd,phone, new BaseObscriber<User>() {
            @Override
            protected void onSuccess(User data) {
                iCallbackListener.onSuccess(data);
            }

            @Override
            protected void onFailed(String msg) {
                iCallbackListener.onFailed(msg);
            }
        });
    }
}
