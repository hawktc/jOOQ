/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables;

/**
 * This class is generated by jOOQ.
 */
public class EmployeePayHistory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory> {

	private static final long serialVersionUID = 191845392;

	/**
	 * The singleton instance of HumanResources.EmployeePayHistory
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory EmployeePayHistory = new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_EmployeePayHistory_Employee_EmployeeID
	 * FOREIGN KEY (EmployeeID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory, java.lang.Integer> EmployeeID = createField("EmployeeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory, java.sql.Timestamp> RateChangeDate = createField("RateChangeDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory, java.math.BigDecimal> Rate = createField("Rate", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory, java.lang.Byte> PayFrequency = createField("PayFrequency", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public EmployeePayHistory() {
		super("EmployeePayHistory", org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources);
	}

	public EmployeePayHistory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_EmployeePayHistory_EmployeeID_RateChangeDate;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_EmployeePayHistory_EmployeeID_RateChangeDate);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory, ?>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.FK_EmployeePayHistory_Employee_EmployeeID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory(alias);
	}
}
