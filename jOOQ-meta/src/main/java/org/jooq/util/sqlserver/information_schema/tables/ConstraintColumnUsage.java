/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sqlserver.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class ConstraintColumnUsage extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -2079839455;

	/**
	 * The singleton instance of INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE
	 */
	public static final org.jooq.util.sqlserver.information_schema.tables.ConstraintColumnUsage CONSTRAINT_COLUMN_USAGE = new org.jooq.util.sqlserver.information_schema.tables.ConstraintColumnUsage();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	public ConstraintColumnUsage() {
		super("CONSTRAINT_COLUMN_USAGE", org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public ConstraintColumnUsage(java.lang.String alias) {
		super(alias, org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.sqlserver.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE);
	}

	@Override
	public org.jooq.util.sqlserver.information_schema.tables.ConstraintColumnUsage as(java.lang.String alias) {
		return new org.jooq.util.sqlserver.information_schema.tables.ConstraintColumnUsage(alias);
	}
}
