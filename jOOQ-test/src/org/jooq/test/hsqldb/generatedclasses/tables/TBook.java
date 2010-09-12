/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;


import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.hsqldb.generatedclasses.Public;
import org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord;


/**
 * This class is generated by jOOQ.
 */
public class TBook extends UpdatableTableImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of T_BOOK
	 */
	public static final TBook T_BOOK = new TBook();

	/**
	 * The class holding records for this table
	 */
	private static final Class<TBookRecord> RECORD_TYPE = TBookRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<TBookRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY 'SYS_PK_11604'
	 */
	public static final TableField<Integer> ID = new TableFieldImpl<Integer>("ID", Integer.class, T_BOOK);

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY 'SYS_FK_11607' [AUTHOR_ID] REFERENCES T_AUTHOR [ID]
	 */
	public static final TableField<Integer> AUTHOR_ID = new TableFieldImpl<Integer>("AUTHOR_ID", Integer.class, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TITLE = new TableFieldImpl<String>("TITLE", String.class, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("T_BOOK", Public.PUBLIC);
	}

	/*
	 * static initialiser
	 */
	static {
		T_BOOK.addToPrimaryKey(ID);
	}

}