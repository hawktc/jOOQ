/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class IntegerRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.IntegerRecord> {

	private static final long serialVersionUID = -1976883217;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Integer.INTEGER.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Integer.INTEGER.ID);
	}

	/**
	 * Create a detached IntegerRecord
	 */
	public IntegerRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Integer.INTEGER);
	}
}
