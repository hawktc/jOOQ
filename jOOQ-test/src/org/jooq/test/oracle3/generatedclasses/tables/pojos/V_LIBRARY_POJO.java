/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "V_LIBRARY", schema = "TEST")
public class V_LIBRARY_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable {

	private static final long serialVersionUID = -240219677;

	private java.lang.String AUTHOR;
	private java.lang.String TITLE;

	@javax.persistence.Column(name = "AUTHOR", length = 101)
	public java.lang.String getAUTHOR() {
		return this.AUTHOR;
	}

	public void setAUTHOR(java.lang.String AUTHOR) {
		this.AUTHOR = AUTHOR;
	}

	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTITLE() {
		return this.TITLE;
	}

	public void setTITLE(java.lang.String TITLE) {
		this.TITLE = TITLE;
	}
}
