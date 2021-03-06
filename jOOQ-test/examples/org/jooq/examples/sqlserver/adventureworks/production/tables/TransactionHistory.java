/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class TransactionHistory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory> {

	private static final long serialVersionUID = -1951887004;

	/**
	 * The singleton instance of Production.TransactionHistory
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistory TransactionHistory = new org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistory();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory, java.lang.Integer> TransactionID = createField("TransactionID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_TransactionHistory_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory, java.lang.Integer> ReferenceOrderID = createField("ReferenceOrderID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory, java.lang.Integer> ReferenceOrderLineID = createField("ReferenceOrderLineID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory, java.sql.Timestamp> TransactionDate = createField("TransactionDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory, java.lang.String> TransactionType = createField("TransactionType", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory, java.lang.Integer> Quantity = createField("Quantity", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory, java.math.BigDecimal> ActualCost = createField("ActualCost", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public TransactionHistory() {
		super("TransactionHistory", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	public TransactionHistory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistory.TransactionHistory);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.IDENTITY_TransactionHistory;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_TransactionHistory_TransactionID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_TransactionHistory_TransactionID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistory, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_TransactionHistory_Product_ProductID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistory(alias);
	}
}
