/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.mysql.Mysql;


/**
 * This class is generated by jOOQ.
 *
 * User defined functions
 */
public class Func extends TableImpl {

	private static final long serialVersionUID = 2502772787902686687L;

	/**
	 * The singleton instance of func
	 */
	public static final Func FUNC = new Func();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> NAME = new TableFieldImpl<String>("name", String.class, FUNC);

	/**
	 * An uncommented item
	 */
	public static final TableField<Byte> RET = new TableFieldImpl<Byte>("ret", Byte.class, FUNC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DL = new TableFieldImpl<String>("dl", String.class, FUNC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TYPE = new TableFieldImpl<String>("type", String.class, FUNC);

	/**
	 * No further instances allowed
	 */
	private Func() {
		super("func", Mysql.MYSQL);
	}
}