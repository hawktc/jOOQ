/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Sys extends SchemaImpl {

	private static final long serialVersionUID = -79121061;

	/**
	 * The singleton instance of SYS
	 */
	public static final Sys SYS = new Sys();

	/**
	 * No further instances allowed
	 */
	private Sys() {
		super(SQLDialect.DERBY, "SYS");
	}
}