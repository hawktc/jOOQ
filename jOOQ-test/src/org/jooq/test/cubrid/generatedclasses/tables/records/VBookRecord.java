/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class VBookRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = -312855913;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.VBook.CONTENT_PDF);
	}

	/**
	 * Create a detached VBookRecord
	 */
	public VBookRecord() {
		super(org.jooq.test.cubrid.generatedclasses.tables.VBook.V_BOOK);
	}
}
