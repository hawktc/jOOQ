/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TIdentityPkRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityPkRecord> {

	private static final long serialVersionUID = 308295706;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TIdentityPk.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TIdentityPk.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setVal(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TIdentityPk.VAL, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getVal() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TIdentityPk.VAL);
	}

	/**
	 * Create a detached TIdentityPkRecord
	 */
	public TIdentityPkRecord() {
		super(org.jooq.test.cubrid.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK);
	}
}
