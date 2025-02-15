package com.lyh.guanbei.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.lyh.guanbei.bean.Model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MODEL".
*/
public class ModelDao extends AbstractDao<Model, Long> {

    public static final String TABLENAME = "MODEL";

    /**
     * Properties of entity Model.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserId = new Property(1, long.class, "userId", false, "USER_ID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Date = new Property(3, String.class, "date", false, "DATE");
        public final static Property ToWho = new Property(4, String.class, "toWho", false, "TO_WHO");
        public final static Property Amount = new Property(5, String.class, "amount", false, "AMOUNT");
        public final static Property Amount_Type = new Property(6, String.class, "amount_Type", false, "AMOUNT__TYPE");
        public final static Property Remark = new Property(7, String.class, "remark", false, "REMARK");
    }


    public ModelDao(DaoConfig config) {
        super(config);
    }
    
    public ModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MODEL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"USER_ID\" INTEGER NOT NULL ," + // 1: userId
                "\"NAME\" TEXT," + // 2: name
                "\"DATE\" TEXT," + // 3: date
                "\"TO_WHO\" TEXT," + // 4: toWho
                "\"AMOUNT\" TEXT," + // 5: amount
                "\"AMOUNT__TYPE\" TEXT," + // 6: amount_Type
                "\"REMARK\" TEXT);"); // 7: remark
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Model entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getUserId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(4, date);
        }
 
        String toWho = entity.getToWho();
        if (toWho != null) {
            stmt.bindString(5, toWho);
        }
 
        String amount = entity.getAmount();
        if (amount != null) {
            stmt.bindString(6, amount);
        }
 
        String amount_Type = entity.getAmount_Type();
        if (amount_Type != null) {
            stmt.bindString(7, amount_Type);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(8, remark);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Model entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getUserId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(4, date);
        }
 
        String toWho = entity.getToWho();
        if (toWho != null) {
            stmt.bindString(5, toWho);
        }
 
        String amount = entity.getAmount();
        if (amount != null) {
            stmt.bindString(6, amount);
        }
 
        String amount_Type = entity.getAmount_Type();
        if (amount_Type != null) {
            stmt.bindString(7, amount_Type);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(8, remark);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Model readEntity(Cursor cursor, int offset) {
        Model entity = new Model( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getLong(offset + 1), // userId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // date
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // toWho
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // amount
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // amount_Type
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // remark
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Model entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserId(cursor.getLong(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDate(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setToWho(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAmount(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAmount_Type(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setRemark(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Model entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Model entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Model entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
