package com.lyh.guanbei.mvp.contract;

import com.lyh.guanbei.base.IModel;
import com.lyh.guanbei.base.IPresenter;
import com.lyh.guanbei.base.IView;
import com.lyh.guanbei.bean.Record;

import java.util.List;

public interface FilterRecordContract {
    interface IFilterRecordView extends IView{
        void filterRecordShow(List<Record> records);
    }
    interface IFilterRecordPresenter extends IPresenter<IFilterRecordView, IModel>{
        void addContidion(String contidionType,Object condition);
        void filterRecord();
    }
}
