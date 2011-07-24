/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class NicerButSlowerFilmList extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord> {

	private static final long serialVersionUID = -934589822;

	/**
	 * The singleton instance of nicer_but_slower_film_list
	 */
	public static final org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = new org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.Short> FID = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.Short>("FID", org.jooq.impl.SQLDataType.SMALLINT, NICER_BUT_SLOWER_FILM_LIST);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.String> TITLE = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.String>("title", org.jooq.impl.SQLDataType.VARCHAR, NICER_BUT_SLOWER_FILM_LIST);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.String> DESCRIPTION = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.String>("description", org.jooq.impl.SQLDataType.CLOB, NICER_BUT_SLOWER_FILM_LIST);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.String> CATEGORY = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.String>("category", org.jooq.impl.SQLDataType.VARCHAR, NICER_BUT_SLOWER_FILM_LIST);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.math.BigDecimal> PRICE = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.math.BigDecimal>("price", org.jooq.impl.SQLDataType.DECIMAL, NICER_BUT_SLOWER_FILM_LIST);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.Short> LENGTH = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.Short>("length", org.jooq.impl.SQLDataType.SMALLINT, NICER_BUT_SLOWER_FILM_LIST);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating> RATING = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating>("rating", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating.class), NICER_BUT_SLOWER_FILM_LIST);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.String> ACTORS = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.String>("actors", org.jooq.impl.SQLDataType.VARCHAR, NICER_BUT_SLOWER_FILM_LIST);

	/**
	 * No further instances allowed
	 */
	private NicerButSlowerFilmList() {
		super("nicer_but_slower_film_list", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}
}