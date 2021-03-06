/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -377265854;

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME);
	}

	/**
	 * An uncommented item
	 */
	public java.util.List<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME)))
			.fetch();
	}

	/**
	 * Create a detached TBookStoreRecord
	 */
	public TBookStoreRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}
}
