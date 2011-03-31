/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.h2.H2DataType;
import org.jooq.util.h2.information_schema.InformationSchema;
import org.jooq.util.h2.information_schema.tables.records.ColumnsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Columns extends TableImpl<ColumnsRecord> {

	private static final long serialVersionUID = -625245588;

	/**
	 * The singleton instance of COLUMNS
	 */
	public static final Columns COLUMNS = new Columns();

	/**
	 * The class holding records for this type
	 */
	private static final Class<ColumnsRecord> __RECORD_TYPE = ColumnsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ColumnsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TABLE_CATALOG = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.H2, "TABLE_CATALOG", H2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TABLE_SCHEMA = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.H2, "TABLE_SCHEMA", H2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TABLE_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.H2, "TABLE_NAME", H2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLUMN_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.H2, "COLUMN_NAME", H2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> ORDINAL_POSITION = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.H2, "ORDINAL_POSITION", H2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLUMN_DEFAULT = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.H2, "COLUMN_DEFAULT", H2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> IS_NULLABLE = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.H2, "IS_NULLABLE", H2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> DATA_TYPE = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.H2, "DATA_TYPE", H2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> CHARACTER_MAXIMUM_LENGTH = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.H2, "CHARACTER_MAXIMUM_LENGTH", H2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> CHARACTER_OCTET_LENGTH = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.H2, "CHARACTER_OCTET_LENGTH", H2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> NUMERIC_PRECISION = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.H2, "NUMERIC_PRECISION", H2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> NUMERIC_PRECISION_RADIX = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.H2, "NUMERIC_PRECISION_RADIX", H2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> NUMERIC_SCALE = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.H2, "NUMERIC_SCALE", H2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> CHARACTER_SET_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.H2, "CHARACTER_SET_NAME", H2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLLATION_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.H2, "COLLATION_NAME", H2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TYPE_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.H2, "TYPE_NAME", H2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> NULLABLE = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.H2, "NULLABLE", H2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Boolean> IS_COMPUTED = new TableFieldImpl<ColumnsRecord, Boolean>(SQLDialect.H2, "IS_COMPUTED", H2DataType.BOOLEAN, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> SELECTIVITY = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.H2, "SELECTIVITY", H2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> CHECK_CONSTRAINT = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.H2, "CHECK_CONSTRAINT", H2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> SEQUENCE_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.H2, "SEQUENCE_NAME", H2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> REMARKS = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.H2, "REMARKS", H2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Short> SOURCE_DATA_TYPE = new TableFieldImpl<ColumnsRecord, Short>(SQLDialect.H2, "SOURCE_DATA_TYPE", H2DataType.SMALLINT, COLUMNS);

	/**
	 * No further instances allowed
	 */
	private Columns() {
		super(SQLDialect.H2, "COLUMNS", InformationSchema.INFORMATION_SCHEMA);
	}
}