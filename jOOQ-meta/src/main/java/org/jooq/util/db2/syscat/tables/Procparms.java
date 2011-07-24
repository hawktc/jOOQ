/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class Procparms extends org.jooq.impl.TableImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord> {

	private static final long serialVersionUID = -340808884;

	/**
	 * The singleton instance of PROCPARMS
	 */
	public static final org.jooq.util.db2.syscat.tables.Procparms PROCPARMS = new org.jooq.util.db2.syscat.tables.Procparms();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord> __RECORD_TYPE = org.jooq.util.db2.syscat.tables.records.ProcparmsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> PROCSCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("PROCSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> PROCNAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("PROCNAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> SPECIFICNAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("SPECIFICNAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> SERVERNAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("SERVERNAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Short> ORDINAL = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Short>("ORDINAL", org.jooq.impl.SQLDataType.SMALLINT, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> PARMNAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("PARMNAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> TYPESCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> TYPENAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Short> TYPEID = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Short>("TYPEID", org.jooq.impl.SQLDataType.SMALLINT, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Short> SOURCETYPEID = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Short>("SOURCETYPEID", org.jooq.impl.SQLDataType.SMALLINT, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> NULLS = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("NULLS", org.jooq.impl.SQLDataType.CHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Integer> LENGTH = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Integer>("LENGTH", org.jooq.impl.SQLDataType.INTEGER, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Short> SCALE = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Short>("SCALE", org.jooq.impl.SQLDataType.SMALLINT, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> PARM_MODE = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("PARM_MODE", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Short> CODEPAGE = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Short>("CODEPAGE", org.jooq.impl.SQLDataType.SMALLINT, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Short> DBCS_CODEPAGE = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.Short>("DBCS_CODEPAGE", org.jooq.impl.SQLDataType.SMALLINT, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> AS_LOCATOR = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("AS_LOCATOR", org.jooq.impl.SQLDataType.CHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> TARGET_TYPESCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("TARGET_TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> TARGET_TYPENAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("TARGET_TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> SCOPE_TABSCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("SCOPE_TABSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String> SCOPE_TABNAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.ProcparmsRecord, java.lang.String>("SCOPE_TABNAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * No further instances allowed
	 */
	private Procparms() {
		super("PROCPARMS", org.jooq.util.db2.syscat.Syscat.SYSCAT);
	}
}