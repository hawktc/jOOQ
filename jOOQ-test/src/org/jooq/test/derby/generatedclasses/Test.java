/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Test extends SchemaImpl {

	private static final long serialVersionUID = -375398556;

	/**
	 * The singleton instance of TEST
	 */
	public static final Test TEST = new Test();

	/**
	 * No further instances allowed
	 */
	private Test() {
		super(SQLDialect.DERBY, "TEST");
	}
}