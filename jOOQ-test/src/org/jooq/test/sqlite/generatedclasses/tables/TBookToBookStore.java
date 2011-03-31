/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.sqlite.generatedclasses.tables.records.TBookToBookStoreRecord;
import org.jooq.util.sqlite.SQLiteDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBookToBookStore extends UpdatableTableImpl<TBookToBookStoreRecord> {

	private static final long serialVersionUID = 1446017327;

	/**
	 * The singleton instance of t_book_to_book_store
	 */
	public static final TBookToBookStore T_BOOK_TO_BOOK_STORE = new TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBookToBookStoreRecord> __RECORD_TYPE = TBookToBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookToBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TBookToBookStoreRecord, String> BOOK_STORE_NAME = new TableFieldImpl<TBookToBookStoreRecord, String>(SQLDialect.SQLITE, "book_store_name", SQLiteDataType.VARCHAR, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TBookToBookStoreRecord, Integer> BOOK_ID = new TableFieldImpl<TBookToBookStoreRecord, Integer>(SQLDialect.SQLITE, "book_id", SQLiteDataType.INT, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookToBookStoreRecord, Integer> STOCK = new TableFieldImpl<TBookToBookStoreRecord, Integer>(SQLDialect.SQLITE, "stock", SQLiteDataType.INT, T_BOOK_TO_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore() {
		super(SQLDialect.SQLITE, "t_book_to_book_store");
	}

	/*
	 * static initialiser
	 */
	static {
		T_BOOK_TO_BOOK_STORE.addToMainUniqueKey(BOOK_STORE_NAME);
	}
}