/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DATES", schema = "TEST")
public class T_DATES_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable {

	private static final long serialVersionUID = 1304078440;

	private java.lang.Integer          ID;
	private java.sql.Date              D;
	private java.sql.Timestamp         T;
	private java.sql.Timestamp         TS;
	private java.lang.Integer          D_INT;
	private java.lang.Long             TS_BIGINT;
	private org.jooq.types.YearToMonth I_Y;
	private org.jooq.types.DayToSecond I_D;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID() {
		return this.ID;
	}

	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "D", length = 7)
	public java.sql.Date getD() {
		return this.D;
	}

	public void setD(java.sql.Date D) {
		this.D = D;
	}

	@javax.persistence.Column(name = "T", length = 11)
	public java.sql.Timestamp getT() {
		return this.T;
	}

	public void setT(java.sql.Timestamp T) {
		this.T = T;
	}

	@javax.persistence.Column(name = "TS", length = 11)
	public java.sql.Timestamp getTS() {
		return this.TS;
	}

	public void setTS(java.sql.Timestamp TS) {
		this.TS = TS;
	}

	@javax.persistence.Column(name = "D_INT", precision = 7)
	public java.lang.Integer getD_INT() {
		return this.D_INT;
	}

	public void setD_INT(java.lang.Integer D_INT) {
		this.D_INT = D_INT;
	}

	@javax.persistence.Column(name = "TS_BIGINT", precision = 18)
	public java.lang.Long getTS_BIGINT() {
		return this.TS_BIGINT;
	}

	public void setTS_BIGINT(java.lang.Long TS_BIGINT) {
		this.TS_BIGINT = TS_BIGINT;
	}

	@javax.persistence.Column(name = "I_Y", precision = 2)
	public org.jooq.types.YearToMonth getI_Y() {
		return this.I_Y;
	}

	public void setI_Y(org.jooq.types.YearToMonth I_Y) {
		this.I_Y = I_Y;
	}

	@javax.persistence.Column(name = "I_D", precision = 2, scale = 6)
	public org.jooq.types.DayToSecond getI_D() {
		return this.I_D;
	}

	public void setI_D(org.jooq.types.DayToSecond I_D) {
		this.I_D = I_D;
	}
}
