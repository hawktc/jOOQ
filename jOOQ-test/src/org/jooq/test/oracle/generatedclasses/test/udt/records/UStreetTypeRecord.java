/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;

/**
 * This class is generated by jOOQ.
 */
public class UStreetTypeRecord extends org.jooq.impl.UDTRecordImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord> {

	private static final long serialVersionUID = -615019899;


	/**
	 * An uncommented item
	 */
	public void setStreet(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.STREET, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getStreet() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.STREET);
	}

	/**
	 * An uncommented item
	 */
	public void setNo(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.NO, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getNo() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.NO);
	}

	/**
	 * An uncommented item
	 */
	public void setFloors(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.FLOORS, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord getFloors() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.FLOORS);
	}

	/**
	 * An uncommented item
	 */
	public void setF_1323(byte[] value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.F_1323, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getF_1323() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.F_1323);
	}

	/**
	 * An uncommented item
	 */
	public void setF_1326(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.F_1326, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getF_1326() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.F_1326);
	}

	public UStreetTypeRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.U_STREET_TYPE);
	}
}
