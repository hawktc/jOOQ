/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class CountryRegionCurrency extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency> {

	private static final long serialVersionUID = -1868381603;

	/**
	 * The singleton instance of Sales.CountryRegionCurrency
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency CountryRegionCurrency = new org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CountryRegionCurrency_CountryRegion_CountryRegionCode
	 * FOREIGN KEY (CountryRegionCode)
	 * REFERENCES Person.CountryRegion (CountryRegionCode)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency, java.lang.String> CountryRegionCode = createField("CountryRegionCode", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CountryRegionCurrency_Currency_CurrencyCode
	 * FOREIGN KEY (CurrencyCode)
	 * REFERENCES Sales.Currency (CurrencyCode)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency, java.lang.String> CurrencyCode = createField("CurrencyCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public CountryRegionCurrency() {
		super("CountryRegionCurrency", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	public CountryRegionCurrency(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CountryRegionCurrency_CountryRegionCode_CurrencyCode;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CountryRegionCurrency_CountryRegionCode_CurrencyCode);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CountryRegionCurrency_CountryRegion_CountryRegionCode, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CountryRegionCurrency_Currency_CurrencyCode);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency(alias);
	}
}
