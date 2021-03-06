/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class ProductModelProductDescriptionCulture extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture> {

	private static final long serialVersionUID = 1690598436;

	/**
	 * The singleton instance of Production.ProductModelProductDescriptionCulture
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture ProductModelProductDescriptionCulture = new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_ProductModel_ProductModelID
	 * FOREIGN KEY (ProductModelID)
	 * REFERENCES Production.ProductModel (ProductModelID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture, java.lang.Integer> ProductModelID = createField("ProductModelID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_ProductDescription_ProductDescriptionID
	 * FOREIGN KEY (ProductDescriptionID)
	 * REFERENCES Production.ProductDescription (ProductDescriptionID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture, java.lang.Integer> ProductDescriptionID = createField("ProductDescriptionID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_Culture_CultureID
	 * FOREIGN KEY (CultureID)
	 * REFERENCES Production.Culture (CultureID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture, java.lang.String> CultureID = createField("CultureID", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public ProductModelProductDescriptionCulture() {
		super("ProductModelProductDescriptionCulture", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	public ProductModelProductDescriptionCulture(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture.ProductModelProductDescriptionCulture);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductModelProductDescriptionCulture_ProductModelID_ProductDescriptionID_CultureID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductModelProductDescriptionCulture_ProductModelID_ProductDescriptionID_CultureID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductModelProductDescriptionCulture_ProductModel_ProductModelID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductModelProductDescriptionCulture_ProductDescription_ProductDescriptionID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductModelProductDescriptionCulture_Culture_CultureID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture(alias);
	}
}
