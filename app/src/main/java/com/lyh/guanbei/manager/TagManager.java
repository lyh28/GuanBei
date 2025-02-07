package com.lyh.guanbei.manager;

import com.lyh.guanbei.R;
import com.lyh.guanbei.bean.Tag;
import com.lyh.guanbei.util.LogUtil;

import java.util.LinkedList;
import java.util.List;

/*
    管理分类的icon和字段
*/
public class TagManager {
    private static final String EAT = "吃喝";
    private static final String[] mInTag = {
            "红包", "工资", "零花钱", "奖金", "地上捡"
    };
    private static final String[] mOutTag = {
            "吃喝", "玩乐", "交通", "红包", "日用品", "服饰鞋包"
    };
    private static final String[] mModelTag={"微信模板","短信导入"};
    private static final int[] mModelId={R.drawable.book_uncheck,R.drawable.sms};
    private static final int[] mInTagId = {
            R.drawable.red_package,
            R.drawable.salary,
            R.drawable.money,
            R.drawable.bonus,
            R.drawable.pick
    };
    private static final int[] mOutTagId={
            R.drawable.eat,
            R.drawable.play,
            R.drawable.traffic,
            R.drawable.red_package,
            R.drawable.paper,
            R.drawable.clothes
    };
    //支出
    private List<Tag> outList;
    //收入
    private List<Tag> inList;


    public static Tag getDefaultCategory(int type) {
        //暂定使用该图标
        return new Tag(EAT, R.drawable.eat, type);
    }

    //返回预置的收入List
    public static List<Tag> getPresetInList() {
        LinkedList<Tag> list = new LinkedList<>();
        for(int i=0;i<mInTag.length;i++){
            list.add(new Tag(mInTag[i],mInTagId[i],Tag.IN,0));
        }
        return list;
    }

    //返回预置的支出List
    public static List<Tag> getPresetOutList() {
        LinkedList<Tag> list = new LinkedList<>();
        for(int i=0;i<mOutTag.length;i++){
            list.add(new Tag(mOutTag[i],mOutTagId[i],Tag.OUT,0));
        }
        return list;
    }
    private static int getIconByCategoryFromDefault(String name){
        for(int i=0;i<mModelTag.length;i++){
            if(mModelTag[i].equals(name))
                return mModelId[i];
        }
        return -1;
    }
    public static int getIconByCategory(String name, int type) {
        int id;
        id=getIconByCategoryFromDefault(name);
        if(id!=-1)  return id;
        Tag tag = Tag.getTagByName(name, type);
        if (tag == null) {
            LogUtil.logD("name "+name +"  "+type);
            return R.mipmap.icon_more_operation_share_friend;
        }
        else
            return tag.getIconId();
    }
}
