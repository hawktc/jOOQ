<?php
  $root = "";
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
		<title><?php print preg_replace('%<br/>%', ' - ', getH1()); ?> - jOOQ is a fluent API for typesafe SQL query construction and execution</title>
		<meta property="og:title" content="jOOQ" />
		<meta property="og:type" content="website" />
		<meta property="og:url" content="http://www.jooq.org" />
		<meta property="og:image" content="http://www.jooq.org/img/logo.png" />
		<meta property="og:site_name" content="jOOQ" />
		<meta property="fb:admins" content="649865547" />

		<meta name="description" content="jOOQ, a fluent API for typesafe SQL query construction and execution. Supported DBs are DB2, Derby, Ingres, H2, HSQLDB, MySQL, Oracle, Postgres, SQLite, SQL Server, Sybase"/>
		<meta name="author" content="Lukas Eder"/>
		<meta name="keywords" content="jOOQ, JDBC, database abstraction, source code generation, SQL, stored procedures, stored functions, UDT, UDF, typesafe, fluentAPI"/>

		<link href='http://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
		<link href='http://fonts.googleapis.com/css?family=Special+Elite' rel='stylesheet' type='text/css'>
		<link href="<?=$root?>/css/jooq.css" type="text/css" rel="stylesheet" />
		<link href="<?=$root?>/js/prettify/prettify.css" type="text/css" rel="stylesheet" />
		<script type="text/javascript" src="<?=$root?>/js/jquery.js"></script>
		<script type="text/javascript" src="http://www.google.com/jsapi"></script>
		<script type="text/javascript" src="<?=$root?>/js/prettify/prettify.js"></script>
		<script type="text/javascript" src="<?=$root?>/js/prettify/lang-sql.js"></script>
		<script type="text/javascript" src="https://apis.google.com/js/plusone.js"></script>
	</head>
	<body onload="prettyPrint()">
	    <div id="navigation">
	    <div class="wrapper">
		<div id="tweets">
			<div class="tweet-item">
				<a href="http://twitter.com/share"
					class="twitter-share-button"
					data-url="http://www.jooq.org"
					data-text="#jOOQ - A nice database abstraction library for Java"
					data-count="horizontal" data-via="JavaOOQ">Tweet</a>
				<script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script>
			</div>
			<div class="tweet-item">
				<g:plusone size="medium" href="http://www.jooq.org"></g:plusone>
			</div>
			<div class="tweet-item">
				<div id="fb-root"></div>
				<script>(function(d, s, id) {
				  var js, fjs = d.getElementsByTagName(s)[0];
				  if (d.getElementById(id)) {return;}
				  js = d.createElement(s); js.id = id;
				  js.src = "//connect.facebook.net/en_US/all.js#appId=232666253447462&xfbml=1";
				  fjs.parentNode.insertBefore(js, fjs);
				}(document, 'script', 'facebook-jssdk'));</script>
				<div class="fb-like"
					data-send="false"
					data-href="http://www.jooq.org"
					data-layout="button_count"
					data-width="450"
					data-show-faces="true"
					data-font="verdana"></div>
			</div>
			<div class="tweet-item">
				<a href="http://pinterest.com/pin/create/button/?url=http%3A%2F%2Fwww.jooq.org&media=http%3A%2F%2Fwww.jooq.org%2Fimg%2Flogo.png&description=jOOQ%20%3A%20A%20peace%20treaty%20between%20SQL%20and%20Java" class="pin-it-button" count-layout="horizontal"><img border="0" src="//assets.pinterest.com/images/PinExt.png" title="Pin It" /></a>			</div>
			</div>

	    <div id="menu">
	        <?php
	        $menu = getActiveMenu();
	        ?>
	        <div class="navigation-item-left <?php if ($menu == 'home') print 'navigation-item-active'?>">
	    		<a href="<?=$root?>/" title="jOOQ Home Page">Start</a>
    		</div>
	        <div class="navigation-item-left <?php if ($menu == 'learn') print 'navigation-item-active'?>">
	    		<a href="<?=$root?>/learn.php" title="jOOQ Home Page">Learn</a>
    		</div>
	        <div class="navigation-item-left <?php if ($menu == 'download') print 'navigation-item-active'?>">
	    		<a href="<?=$root?>/download.php" title="jOOQ Home Page">Download</a>
    		</div>
	        <div class="navigation-item-left <?php if ($menu == 'community') print 'navigation-item-active'?>">
	    		<a href="<?=$root?>/community.php" title="jOOQ Home Page">Community</a>
    		</div>
	   	</div>
	   	</div>
	    </div>

		<div id="header">
		<div class="wrapper">
			<table width="100%" cellpadding="0" cellspacing="0">
				<tr>
					<td width="700" valign="top">
						<h1><?php print getH1(); ?></h1></td>
					<td align="right" valign="top"><img src="<?=$root?>/img/logo.png" alt="jOOQ Logo"/></td>
				</tr>
			</table>
		</div>
		</div>

		<div id="content">
		<div class="wrapper">
			<?php
			  printContent();
		    ?>
			<br/>
		</div>
		</div>

		<div id="footer">
		<div class="wrapper">
	 		<p class="right">
				<div style="float: left; width: 400px">
				    Copyright (c) 2009-<?=date('Y')?> by <a href="http://blog.jooq.org" title="Lukas's Blog about Java, SQL, and jOOQ">Lukas Eder</a>.
				    Distributed under the <a href="http://www.apache.org/licenses/LICENSE-2.0" title="Apache 2.0 License">Apache 2.0 licence</a>
				</div>
				<div style="float: right; width: 400px">
					Want to see your brand here? <a href="mailto:lukas.eder@gmail.com" title="contact me">Contact me</a> to partner up with jOOQ
				</div>
				<br/>
			</p>
		</div>
		</div>

		<a href="https://github.com/lukaseder/jOOQ"> <img
			alt="Fork me on GitHub" src="<?=$root?>/img/forkme.png"
			style="position: absolute; top: 0; right: 0; border: 0;"/> </a>
		<div style="display: none">
			<img src="/img/logo.png" title="jOOQ Logo"/>

		<script type="text/javascript" src="//assets.pinterest.com/js/pinit.js"></script>
	</body>
</html>
