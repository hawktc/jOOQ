/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
public class Dba extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -507798902;

	/**
	 * The singleton instance of DBA
	 */
	public static final Dba DBA = new Dba();

	/**
	 * No further instances allowed
	 */
	private Dba() {
		super("DBA");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(org.jooq.test.sybase.generatedclasses.Sequences.S_AUTHOR_ID);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.sybase.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK,
			org.jooq.test.sybase.generatedclasses.tables.TIdentity.T_IDENTITY,
			org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES,
			org.jooq.test.sybase.generatedclasses.tables.TBooleans.T_BOOLEANS,
			org.jooq.test.sybase.generatedclasses.tables.TTriggers.T_TRIGGERS,
			org.jooq.test.sybase.generatedclasses.tables.T_658Ref.T_658_REF,
			org.jooq.test.sybase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST,
			org.jooq.test.sybase.generatedclasses.tables.T_785.T_785,
			org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR,
			org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK,
			org.jooq.test.sybase.generatedclasses.tables.TBookStore.T_BOOK_STORE,
			org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED,
			org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1,
			org.jooq.test.sybase.generatedclasses.tables.T_986_2.T_986_2,
			org.jooq.test.sybase.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE,
			org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69,
			org.jooq.test.sybase.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71,
			org.jooq.test.sybase.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85,
			org.jooq.test.sybase.generatedclasses.tables.VLibrary.V_LIBRARY,
			org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR,
			org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK);
	}
}
