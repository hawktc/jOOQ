/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * Columns of user's tables, views and clusters
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class AllTabColsRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord> {

	private static final long serialVersionUID = 1266171712;

	/**
	 * An uncommented item
	 */
	public void setOwner(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.OWNER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getOwner() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.OWNER);
	}

	/**
	 * Table, view or cluster name
	 */
	public void setTableName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.TABLE_NAME, value);
	}

	/**
	 * Table, view or cluster name
	 */
	public java.lang.String getTableName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.TABLE_NAME);
	}

	/**
	 * Column name
	 */
	public void setColumnName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.COLUMN_NAME, value);
	}

	/**
	 * Column name
	 */
	public java.lang.String getColumnName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.COLUMN_NAME);
	}

	/**
	 * Datatype of the column
	 */
	public void setDataType(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_TYPE, value);
	}

	/**
	 * Datatype of the column
	 */
	public java.lang.String getDataType() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_TYPE);
	}

	/**
	 * Datatype modifier of the column
	 */
	public void setDataTypeMod(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_TYPE_MOD, value);
	}

	/**
	 * Datatype modifier of the column
	 */
	public java.lang.String getDataTypeMod() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_TYPE_MOD);
	}

	/**
	 * Owner of the datatype of the column
	 */
	public void setDataTypeOwner(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_TYPE_OWNER, value);
	}

	/**
	 * Owner of the datatype of the column
	 */
	public java.lang.String getDataTypeOwner() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_TYPE_OWNER);
	}

	/**
	 * Length of the column in bytes
	 */
	public void setDataLength(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_LENGTH, value);
	}

	/**
	 * Length of the column in bytes
	 */
	public java.math.BigDecimal getDataLength() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_LENGTH);
	}

	/**
	 * Length: decimal digits (NUMBER) or binary digits (FLOAT)
	 */
	public void setDataPrecision(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_PRECISION, value);
	}

	/**
	 * Length: decimal digits (NUMBER) or binary digits (FLOAT)
	 */
	public java.math.BigDecimal getDataPrecision() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_PRECISION);
	}

	/**
	 * Digits to right of decimal point in a number
	 */
	public void setDataScale(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_SCALE, value);
	}

	/**
	 * Digits to right of decimal point in a number
	 */
	public java.math.BigDecimal getDataScale() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_SCALE);
	}

	/**
	 * Does column allow NULL values?
	 */
	public void setNullable(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.NULLABLE, value);
	}

	/**
	 * Does column allow NULL values?
	 */
	public java.lang.String getNullable() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.NULLABLE);
	}

	/**
	 * Sequence number of the column as created
	 */
	public void setColumnId(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.COLUMN_ID, value);
	}

	/**
	 * Sequence number of the column as created
	 */
	public java.math.BigDecimal getColumnId() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.COLUMN_ID);
	}

	/**
	 * Length of default value for the column
	 */
	public void setDefaultLength(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.DEFAULT_LENGTH, value);
	}

	/**
	 * Length of default value for the column
	 */
	public java.math.BigDecimal getDefaultLength() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.DEFAULT_LENGTH);
	}

	/**
	 * Default value for the column
	 */
	public void setDataDefault(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_DEFAULT, value);
	}

	/**
	 * Default value for the column
	 */
	public java.lang.String getDataDefault() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_DEFAULT);
	}

	/**
	 * The number of distinct values in the column
	 */
	public void setNumDistinct(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.NUM_DISTINCT, value);
	}

	/**
	 * The number of distinct values in the column
	 */
	public java.math.BigDecimal getNumDistinct() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.NUM_DISTINCT);
	}

	/**
	 * The low value in the column
	 */
	public void setLowValue(byte[] value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.LOW_VALUE, value);
	}

	/**
	 * The low value in the column
	 */
	public byte[] getLowValue() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.LOW_VALUE);
	}

	/**
	 * The high value in the column
	 */
	public void setHighValue(byte[] value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.HIGH_VALUE, value);
	}

	/**
	 * The high value in the column
	 */
	public byte[] getHighValue() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.HIGH_VALUE);
	}

	/**
	 * The density of the column
	 */
	public void setDensity(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.DENSITY, value);
	}

	/**
	 * The density of the column
	 */
	public java.math.BigDecimal getDensity() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.DENSITY);
	}

	/**
	 * The number of nulls in the column
	 */
	public void setNumNulls(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.NUM_NULLS, value);
	}

	/**
	 * The number of nulls in the column
	 */
	public java.math.BigDecimal getNumNulls() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.NUM_NULLS);
	}

	/**
	 * The number of buckets in histogram for the column
	 */
	public void setNumBuckets(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.NUM_BUCKETS, value);
	}

	/**
	 * The number of buckets in histogram for the column
	 */
	public java.math.BigDecimal getNumBuckets() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.NUM_BUCKETS);
	}

	/**
	 * The date of the most recent time this column was analyzed
	 */
	public void setLastAnalyzed(java.sql.Date value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.LAST_ANALYZED, value);
	}

	/**
	 * The date of the most recent time this column was analyzed
	 */
	public java.sql.Date getLastAnalyzed() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.LAST_ANALYZED);
	}

	/**
	 * The sample size used in analyzing this column
	 */
	public void setSampleSize(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.SAMPLE_SIZE, value);
	}

	/**
	 * The sample size used in analyzing this column
	 */
	public java.math.BigDecimal getSampleSize() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.SAMPLE_SIZE);
	}

	/**
	 * Character set name
	 */
	public void setCharacterSetName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.CHARACTER_SET_NAME, value);
	}

	/**
	 * Character set name
	 */
	public java.lang.String getCharacterSetName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.CHARACTER_SET_NAME);
	}

	/**
	 * Declaration length of character type column
	 */
	public void setCharColDeclLength(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.CHAR_COL_DECL_LENGTH, value);
	}

	/**
	 * Declaration length of character type column
	 */
	public java.math.BigDecimal getCharColDeclLength() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.CHAR_COL_DECL_LENGTH);
	}

	/**
	 * Are the statistics calculated without merging underlying partitions?
	 */
	public void setGlobalStats(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.GLOBAL_STATS, value);
	}

	/**
	 * Are the statistics calculated without merging underlying partitions?
	 */
	public java.lang.String getGlobalStats() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.GLOBAL_STATS);
	}

	/**
	 * Were the statistics entered directly by the user?
	 */
	public void setUserStats(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.USER_STATS, value);
	}

	/**
	 * Were the statistics entered directly by the user?
	 */
	public java.lang.String getUserStats() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.USER_STATS);
	}

	/**
	 * The average length of the column in bytes
	 */
	public void setAvgColLen(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.AVG_COL_LEN, value);
	}

	/**
	 * The average length of the column in bytes
	 */
	public java.math.BigDecimal getAvgColLen() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.AVG_COL_LEN);
	}

	/**
	 * The maximum length of the column in characters
	 */
	public void setCharLength(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.CHAR_LENGTH, value);
	}

	/**
	 * The maximum length of the column in characters
	 */
	public java.math.BigDecimal getCharLength() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.CHAR_LENGTH);
	}

	/**
	 * C if maximum length is specified in characters, B if in bytes
	 */
	public void setCharUsed(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.CHAR_USED, value);
	}

	/**
	 * C if maximum length is specified in characters, B if in bytes
	 */
	public java.lang.String getCharUsed() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.CHAR_USED);
	}

	/**
	 * Is column data in 8.0 image format?
	 */
	public void setV80FmtImage(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.V80_FMT_IMAGE, value);
	}

	/**
	 * Is column data in 8.0 image format?
	 */
	public java.lang.String getV80FmtImage() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.V80_FMT_IMAGE);
	}

	/**
	 * Has column data been upgraded to the latest type version format?
	 */
	public void setDataUpgraded(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_UPGRADED, value);
	}

	/**
	 * Has column data been upgraded to the latest type version format?
	 */
	public java.lang.String getDataUpgraded() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.DATA_UPGRADED);
	}

	/**
	 * Is this a hidden column?
	 */
	public void setHiddenColumn(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.HIDDEN_COLUMN, value);
	}

	/**
	 * Is this a hidden column?
	 */
	public java.lang.String getHiddenColumn() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.HIDDEN_COLUMN);
	}

	/**
	 * Is this a virtual column?
	 */
	public void setVirtualColumn(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.VIRTUAL_COLUMN, value);
	}

	/**
	 * Is this a virtual column?
	 */
	public java.lang.String getVirtualColumn() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.VIRTUAL_COLUMN);
	}

	/**
	 * Sequence number of the column in the segment
	 */
	public void setSegmentColumnId(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.SEGMENT_COLUMN_ID, value);
	}

	/**
	 * Sequence number of the column in the segment
	 */
	public java.math.BigDecimal getSegmentColumnId() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.SEGMENT_COLUMN_ID);
	}

	/**
	 * Internal sequence number of the column
	 */
	public void setInternalColumnId(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.INTERNAL_COLUMN_ID, value);
	}

	/**
	 * Internal sequence number of the column
	 */
	public java.math.BigDecimal getInternalColumnId() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.INTERNAL_COLUMN_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setHistogram(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.HISTOGRAM, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getHistogram() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.HISTOGRAM);
	}

	/**
	 * Qualified column name
	 */
	public void setQualifiedColName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabCols.QUALIFIED_COL_NAME, value);
	}

	/**
	 * Qualified column name
	 */
	public java.lang.String getQualifiedColName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabCols.QUALIFIED_COL_NAME);
	}

	/**
	 * Create a detached AllTabColsRecord
	 */
	public AllTabColsRecord() {
		super(org.jooq.util.oracle.sys.tables.AllTabCols.ALL_TAB_COLS);
	}
}