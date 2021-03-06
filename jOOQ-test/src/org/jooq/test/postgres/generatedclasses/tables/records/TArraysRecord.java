/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_arrays", schema = "public")
public class TArraysRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord> {

	private static final long serialVersionUID = -676882876;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setStringArray(java.lang.String[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.STRING_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "string_array")
	public java.lang.String[] getStringArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.STRING_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setNumberArray(java.lang.Integer[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.NUMBER_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "number_array")
	public java.lang.Integer[] getNumberArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.NUMBER_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setDateArray(java.sql.Date[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.DATE_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "date_array")
	public java.sql.Date[] getDateArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.DATE_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setUdtArray(org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.UDT_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "udt_array")
	public org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] getUdtArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.UDT_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setEnumArray(org.jooq.test.postgres.generatedclasses.enums.UCountry[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ENUM_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "enum_array")
	public org.jooq.test.postgres.generatedclasses.enums.UCountry[] getEnumArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ENUM_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setArrayArray(java.lang.Integer[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ARRAY_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "array_array")
	public java.lang.Integer[] getArrayArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ARRAY_ARRAY);
	}

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS);
	}
}
