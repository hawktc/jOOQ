/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductProductPhoto", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ProductID", "ProductPhotoID"})
})
public class ProductProductPhoto implements java.io.Serializable {

	private static final long serialVersionUID = 222277608;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  ProductID;

	@javax.validation.constraints.NotNull
	private java.lang.Integer  ProductPhotoID;

	@javax.validation.constraints.NotNull
	private java.lang.Boolean  Primary;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return this.ProductID;
	}

	public void setProductID(java.lang.Integer ProductID) {
		this.ProductID = ProductID;
	}

	@javax.persistence.Column(name = "ProductPhotoID", nullable = false, precision = 10)
	public java.lang.Integer getProductPhotoID() {
		return this.ProductPhotoID;
	}

	public void setProductPhotoID(java.lang.Integer ProductPhotoID) {
		this.ProductPhotoID = ProductPhotoID;
	}

	@javax.persistence.Column(name = "Primary", nullable = false)
	public java.lang.Boolean getPrimary() {
		return this.Primary;
	}

	public void setPrimary(java.lang.Boolean Primary) {
		this.Primary = Primary;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
