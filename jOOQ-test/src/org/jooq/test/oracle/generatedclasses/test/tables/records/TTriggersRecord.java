/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_TRIGGERS", schema = "TEST")
public class TTriggersRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = -1990157151;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setIdGenerated(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS.ID_GENERATED, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID_GENERATED", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getIdGenerated() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS.ID_GENERATED);
	}

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS.ID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setCounter(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS.COUNTER, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "COUNTER", nullable = false, precision = 7)
	public java.lang.Integer getCounter() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS.COUNTER);
	}

	/**
	 * Create a detached TTriggersRecord
	 */
	public TTriggersRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS);
	}
}
