/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "TransactionHistoryArchive", schema = "Production")
public class TransactionHistoryArchive extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistoryArchive> {

	private static final long serialVersionUID = 1353323237;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setTransactionID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.TransactionID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "TransactionID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getTransactionID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.TransactionID);
	}

	/**
	 * An uncommented item
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ProductID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ProductID);
	}

	/**
	 * An uncommented item
	 */
	public void setReferenceOrderID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ReferenceOrderID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ReferenceOrderID", nullable = false, precision = 10)
	public java.lang.Integer getReferenceOrderID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ReferenceOrderID);
	}

	/**
	 * An uncommented item
	 */
	public void setReferenceOrderLineID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ReferenceOrderLineID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ReferenceOrderLineID", nullable = false, precision = 10)
	public java.lang.Integer getReferenceOrderLineID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ReferenceOrderLineID);
	}

	/**
	 * An uncommented item
	 */
	public void setTransactionDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.TransactionDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TransactionDate", nullable = false)
	public java.sql.Timestamp getTransactionDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.TransactionDate);
	}

	/**
	 * An uncommented item
	 */
	public void setTransactionType(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.TransactionType, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TransactionType", nullable = false, length = 1)
	public java.lang.String getTransactionType() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.TransactionType);
	}

	/**
	 * An uncommented item
	 */
	public void setQuantity(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.Quantity, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Quantity", nullable = false, precision = 10)
	public java.lang.Integer getQuantity() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.Quantity);
	}

	/**
	 * An uncommented item
	 */
	public void setActualCost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ActualCost, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ActualCost", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getActualCost() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ActualCost);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ModifiedDate);
	}

	/**
	 * Create a detached TransactionHistoryArchive
	 */
	public TransactionHistoryArchive() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive);
	}
}
