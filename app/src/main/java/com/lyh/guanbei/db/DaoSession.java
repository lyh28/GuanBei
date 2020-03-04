package com.lyh.guanbei.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.lyh.guanbei.bean.Book;
import com.lyh.guanbei.bean.DeleteBook;
import com.lyh.guanbei.bean.DeleteRecord;
import com.lyh.guanbei.bean.Model;
import com.lyh.guanbei.bean.Notification;
import com.lyh.guanbei.bean.Record;
import com.lyh.guanbei.bean.Setting;
import com.lyh.guanbei.bean.Tag;
import com.lyh.guanbei.bean.User;

import com.lyh.guanbei.db.BookDao;
import com.lyh.guanbei.db.DeleteBookDao;
import com.lyh.guanbei.db.DeleteRecordDao;
import com.lyh.guanbei.db.ModelDao;
import com.lyh.guanbei.db.NotificationDao;
import com.lyh.guanbei.db.RecordDao;
import com.lyh.guanbei.db.SettingDao;
import com.lyh.guanbei.db.TagDao;
import com.lyh.guanbei.db.UserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig bookDaoConfig;
    private final DaoConfig deleteBookDaoConfig;
    private final DaoConfig deleteRecordDaoConfig;
    private final DaoConfig modelDaoConfig;
    private final DaoConfig notificationDaoConfig;
    private final DaoConfig recordDaoConfig;
    private final DaoConfig settingDaoConfig;
    private final DaoConfig tagDaoConfig;
    private final DaoConfig userDaoConfig;

    private final BookDao bookDao;
    private final DeleteBookDao deleteBookDao;
    private final DeleteRecordDao deleteRecordDao;
    private final ModelDao modelDao;
    private final NotificationDao notificationDao;
    private final RecordDao recordDao;
    private final SettingDao settingDao;
    private final TagDao tagDao;
    private final UserDao userDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        bookDaoConfig = daoConfigMap.get(BookDao.class).clone();
        bookDaoConfig.initIdentityScope(type);

        deleteBookDaoConfig = daoConfigMap.get(DeleteBookDao.class).clone();
        deleteBookDaoConfig.initIdentityScope(type);

        deleteRecordDaoConfig = daoConfigMap.get(DeleteRecordDao.class).clone();
        deleteRecordDaoConfig.initIdentityScope(type);

        modelDaoConfig = daoConfigMap.get(ModelDao.class).clone();
        modelDaoConfig.initIdentityScope(type);

        notificationDaoConfig = daoConfigMap.get(NotificationDao.class).clone();
        notificationDaoConfig.initIdentityScope(type);

        recordDaoConfig = daoConfigMap.get(RecordDao.class).clone();
        recordDaoConfig.initIdentityScope(type);

        settingDaoConfig = daoConfigMap.get(SettingDao.class).clone();
        settingDaoConfig.initIdentityScope(type);

        tagDaoConfig = daoConfigMap.get(TagDao.class).clone();
        tagDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        bookDao = new BookDao(bookDaoConfig, this);
        deleteBookDao = new DeleteBookDao(deleteBookDaoConfig, this);
        deleteRecordDao = new DeleteRecordDao(deleteRecordDaoConfig, this);
        modelDao = new ModelDao(modelDaoConfig, this);
        notificationDao = new NotificationDao(notificationDaoConfig, this);
        recordDao = new RecordDao(recordDaoConfig, this);
        settingDao = new SettingDao(settingDaoConfig, this);
        tagDao = new TagDao(tagDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);

        registerDao(Book.class, bookDao);
        registerDao(DeleteBook.class, deleteBookDao);
        registerDao(DeleteRecord.class, deleteRecordDao);
        registerDao(Model.class, modelDao);
        registerDao(Notification.class, notificationDao);
        registerDao(Record.class, recordDao);
        registerDao(Setting.class, settingDao);
        registerDao(Tag.class, tagDao);
        registerDao(User.class, userDao);
    }
    
    public void clear() {
        bookDaoConfig.clearIdentityScope();
        deleteBookDaoConfig.clearIdentityScope();
        deleteRecordDaoConfig.clearIdentityScope();
        modelDaoConfig.clearIdentityScope();
        notificationDaoConfig.clearIdentityScope();
        recordDaoConfig.clearIdentityScope();
        settingDaoConfig.clearIdentityScope();
        tagDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public DeleteBookDao getDeleteBookDao() {
        return deleteBookDao;
    }

    public DeleteRecordDao getDeleteRecordDao() {
        return deleteRecordDao;
    }

    public ModelDao getModelDao() {
        return modelDao;
    }

    public NotificationDao getNotificationDao() {
        return notificationDao;
    }

    public RecordDao getRecordDao() {
        return recordDao;
    }

    public SettingDao getSettingDao() {
        return settingDao;
    }

    public TagDao getTagDao() {
        return tagDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}
