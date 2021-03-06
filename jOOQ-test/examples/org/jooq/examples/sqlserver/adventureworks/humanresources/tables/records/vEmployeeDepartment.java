/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vEmployeeDepartment", schema = "HumanResources")
public class vEmployeeDepartment extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment> {

	private static final long serialVersionUID = 1157185743;

	/**
	 * An uncommented item
	 */
	public void setEmployeeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.EmployeeID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "EmployeeID", nullable = false, precision = 10)
	public java.lang.Integer getEmployeeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.EmployeeID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.Title, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Title", length = 8)
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.Title);
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.FirstName, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "FirstName", nullable = false, length = 50)
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.FirstName);
	}

	/**
	 * An uncommented item
	 */
	public void setMiddleName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.MiddleName, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "MiddleName", length = 50)
	public java.lang.String getMiddleName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.MiddleName);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.LastName, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LastName", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.LastName);
	}

	/**
	 * An uncommented item
	 */
	public void setSuffix(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.Suffix, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Suffix", length = 10)
	public java.lang.String getSuffix() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.Suffix);
	}

	/**
	 * An uncommented item
	 */
	public void setJobTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.JobTitle, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "JobTitle", nullable = false, length = 50)
	public java.lang.String getJobTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.JobTitle);
	}

	/**
	 * An uncommented item
	 */
	public void setDepartment(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.Department, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Department", nullable = false, length = 50)
	public java.lang.String getDepartment() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.Department);
	}

	/**
	 * An uncommented item
	 */
	public void setGroupName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.GroupName, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "GroupName", nullable = false, length = 50)
	public java.lang.String getGroupName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.GroupName);
	}

	/**
	 * An uncommented item
	 */
	public void setStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.StartDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "StartDate", nullable = false)
	public java.sql.Timestamp getStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.StartDate);
	}

	/**
	 * Create a detached vEmployeeDepartment
	 */
	public vEmployeeDepartment() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment);
	}
}
