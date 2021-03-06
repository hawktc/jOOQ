
<?php
// The following content has been XSL transformed from manual.xml using html-pages.xsl
// Please do not edit this content manually
require '../../../frame.php';
function getH1() {
    return "The Factory class";
}
function getActiveMenu() {
	return "learn";
}
function printContent() {
    global $root;
?>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td valign="top" align="left"><a href="<?=$root?>/manual/">The jOOQ User Manual. Multiple Pages</a> : <a href="<?=$root?>/manual/JOOQ/">jOOQ classes and their usage</a> : <a href="<?=$root?>/manual/JOOQ/Factory/">The Factory class</a></td><td style="white-space: nowrap" valign="top" align="right"><a title="Previous section: The example database" href="<?=$root?>/manual/JOOQ/ExampleDatabase/">previous</a> : <a title="Next section: Tables and Fields" href="<?=$root?>/manual/JOOQ/Table/">next</a></td>
</tr>
</table>
							<h2>The Factory and the jOOQ API</h2>
							<p>
								jOOQ exposes a lot of interfaces and hides most implementation facts
								from client code. The reasons for this are:
							</p>
							<ul>
								
<li>Interface-driven design. This allows for modelling queries in a fluent API most efficiently</li>
								
<li>Reduction of complexity for client code.</li>
								
<li>API guarantee. You only depend on the exposed interfaces, not concrete (potentially dialect-specific) implementations.</li>
							
</ul>
							<p>
								The <a href="http://www.jooq.org/javadoc/latest/org/jooq/impl/Factory.html" title="Internal API reference: org.jooq.impl.Factory">org.jooq.impl.Factory</a>
								class is the main class from where you will create all jOOQ objects.
								The Factory implements <a href="http://www.jooq.org/javadoc/latest/org/jooq/Configuration.html" title="Internal API reference: org.jooq.Configuration">org.jooq.Configuration</a>
								and needs to be instanciated with the Configuration's properties:
							</p>
							<ul>
								
<li>
<a href="http://www.jooq.org/javadoc/latest/org/jooq/SQLDialect.html" title="Internal API reference: org.jooq.SQLDialect">org.jooq.SQLDialect</a> :
								The dialect of your database. This may be any of the currently
								supported database types</li>
								
<li>
<a href="http://download.oracle.com/javase/6/docs/api/java/sql/Connection.html" title="External API reference: java.sql.Connection">java.sql.Connection</a> :
								A JDBC Connection that will be re-used for the whole
    							lifecycle of your Factory</li>
    							
<li>
<a href="http://www.jooq.org/javadoc/latest/org/jooq/conf/Settings.html" title="Internal API reference: org.jooq.conf.Settings">org.jooq.conf.Settings</a> :
    							An optional runtime configuration.</li>
							
</ul>
							<p>If you are planning on using several RDBMS (= SQLDialects) or
								several distinct JDBC Connections in your software, this will mean
								that you have to create a new Factory every time. </p>

							<h2>Factory settings</h2>
							<p>
								The jOOQ Factory allows for some optional configuration elements to be used by advanced users.
								The <a href="http://www.jooq.org/javadoc/latest/org/jooq/conf/Settings.html" title="Internal API reference: org.jooq.conf.Settings">Settings</a> class is a JAXB-annotated
								type, that can be provided to a Factory in several ways:
							</p>
							<ul>
								
<li>In the constructor. This will override default settings below</li>
								
<li>From a location specified by a JVM parameter: -Dorg.jooq.settings</li>
								
<li>From the classpath at /jooq-settings.xml</li>
								
<li>From the settings defaults, as specified in
								    <a href="http://www.jooq.org/xsd/jooq-runtime-2.1.0.xsd" title="The jOOQ Runtime configuration XSD">http://www.jooq.org/xsd/jooq-runtime-2.1.0.xsd</a>
								
</li>
							
</ul>
							<p>
								Subsequent sections of the manual contain some more in-depth explanations about these settings:
							</p>
							<ul>
								
<li>
     								
<a href="<?=$root?>/manual/ADVANCED/SchemaMapping/" title="jOOQ Manual reference: Mapping generated schemata and tables">Runtime schema and table mapping</a>
   								
</li>
     							
<li>
     								
<a href="<?=$root?>/manual/ADVANCED/ExecuteListener/" title="jOOQ Manual reference: Execute listeners and the jOOQ Console">Execute listeners and SQL tracing</a>
     							
</li>
   							
</ul>
							<p>
								Please refer to the jOOQ runtime configuration XSD for more details:<br>
								
<a href="http://www.jooq.org/xsd/jooq-runtime-2.1.0.xsd" title="The jOOQ Runtime configuration XSD">http://www.jooq.org/xsd/jooq-runtime-2.1.0.xsd</a>
							
</p>

							<h2>Factory subclasses</h2>
							<p>
								There are a couple of subclasses for the general Factory. Each SQL
								dialect has its own dialect-specific factory. For instance, if you're
								only using the MySQL dialect, you can choose to create a new Factory
								using any of the following types:
							</p>
<pre class="prettyprint lang-java">// A general, dialect-unspecific factory
Factory create = new Factory(connection, SQLDialect.MYSQL);

// A MySQL-specific factory
MySQLFactory create = new MySQLFactory(connection);</pre>
							<p>
								The advantage of using a dialect-specific Factory lies in the fact,
								that you have access to more proprietary RDMBS functionality. This may
								include:
							</p>
							<ul>
								
<li>Oracle's <a href="<?=$root?>/manual/ADVANCED/CONNECTBY/" title="jOOQ Manual reference: The Oracle CONNECT BY clause">CONNECT BY</a>
								    pseudo columns and functions</li>
    							
<li>MySQL's encryption functions</li>
    							
<li>PL/SQL constructs, pgplsql, or any other dialect's ROUTINE-language (maybe in the future)</li>
							
</ul>
							<p>
								Another type of Factory subclasses are each generated schema's
								factories. If you generate your schema TEST, then you will have access
								to a TestFactory. This will be useful in the future, when access to
								schema artefacts will be unified. Currently, this has no use.
							</p>

							<h2>Static Factory methods</h2>
							<p>
								With jOOQ 2.0, static factory methods have been introduced in order to
								make your code look more like SQL. Ideally, when working with jOOQ, you
								will simply static import all methods from the Factory class:
							</p>
							<pre class="prettyprint lang-java">import static org.jooq.impl.Factory.*;</pre>
							<p>
								This will allow to access functions even more fluently:
							</p>

<pre class="prettyprint lang-java">concat(trim(FIRST_NAME), trim(LAST_NAME));
// ... which is in fact the same as:
Factory.concat(Factory.trim(FIRST_NAME), Factory.trim(LAST_NAME));</pre>
							<p>
								Objects created statically from the Factory do not need a reference to
								any factory, as they can be constructed independently from your Configuration
								(connection, dialect, schema mapping). They will access that information at
								render / bind time. See
								<a href="<?=$root?>/manual/JOOQ/QueryPart/" title="jOOQ Manual reference: QueryParts and the global architecture">more details on the QueryParts' internals</a>
							
</p>

							<h2>Potential problems</h2>
							<p>
								The jOOQ Factory expects its underlying
								<a href="http://download.oracle.com/javase/6/docs/api/java/sql/Connection.html" title="External API reference: java.sql.Connection">java.sql.Connection</a>
								to be <strong>open and ready</strong>
								for
								<a href="http://download.oracle.com/javase/6/docs/api/java/sql/PreparedStatement.html" title="External API reference: java.sql.PreparedStatement">java.sql.PreparedStatement</a>
								creation. You are responsible yourself for the
								lifecycle dependency between Factory and Connection. This means:
							</p>
							<ul>
								
<li>jOOQ will never close the Connection.</li>
								
<li>jOOQ will never commit or rollback on the Connection
									(Except for CSV-imports, if explicitly configured in the <a href="<?=$root?>/manual/ADVANCED/Import/" title="jOOQ Manual reference: Importing data from XML, CSV">Import API</a>)</li>
								
<li>jOOQ will never start any transactions.</li>
								
<li>
									jOOQ does not know the concept of a session as for instance
									<a href="http://docs.jboss.org/hibernate/core/3.6/reference/en-US/html/architecture.html#architecture-current-session">Hibernate</a>
								
</li>
								
<li>jOOQ does not know the concept of a second-level cache. SQL is
									executed directly on the underlying RDBMS.</li>
								
<li>jOOQ does not make assumptions about the origin of the Connection.
									If it is container managed, that is fine.</li>
							
</ul>
							<p>
								So if you want your queries to run in separate transactions, if you
								want to roll back a transaction, if you want to close a Connection and
								return it to your container, you will have to take care of that
								yourself. jOOQ's Factory will always expect its Connection to be in a
								ready state for creating new PreparedStatements. If it is not, you have
								to create a new Factory.
							</p>
							<p>
								Please keep in mind that many jOOQ objects will reference your Factory
								for their whole lifecycle. This is especially interesting, when dealing
								with <a href="<?=$root?>/manual/JOOQ/UpdatableRecord/" title="jOOQ Manual reference: CRUD and Updatable Records">Updatable Records</a>,
								that can perform CRUD operations on the
								Factory's underlying Connection.
							</p>
						<br><table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td valign="top" align="left"><a href="<?=$root?>/manual/">The jOOQ User Manual. Multiple Pages</a> : <a href="<?=$root?>/manual/JOOQ/">jOOQ classes and their usage</a> : <a href="<?=$root?>/manual/JOOQ/Factory/">The Factory class</a></td><td style="white-space: nowrap" valign="top" align="right"><a title="Previous section: The example database" href="<?=$root?>/manual/JOOQ/ExampleDatabase/">previous</a> : <a title="Next section: Tables and Fields" href="<?=$root?>/manual/JOOQ/Table/">next</a></td>
</tr>
</table>
<?php
}
?>

