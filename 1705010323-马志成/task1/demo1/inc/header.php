<?php
    ini_set("error_reporting","E_ALL & ~E_NOTICE");
?>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8" />
<title>计算机存储容量计算demo</title>
<meta name="keywords" content="计算机存储容量价格计算小demo" />
<meta name="description" content="计算机存储容量价格计算小demo" />
<link rel='stylesheet' type='text/css' href='style/public.css' />
<link rel='stylesheet' type='text/css' href='style/remind.css' />
<link rel='stylesheet' type='text/css' href='style/index.css' />
<link rel='stylesheet' type='text/css' href='style/public1.css' />

</head>
<body>
<div class="container">
<div id="top">
	<div class="logo">
		计算机存储容量价格计算小demo
	</div>
	<div class="serarch">
				<form action="serarch.php" method="get">
					<input class="keyword" type="text" name="keyword" value="<?php  if(isset($_GET['keyword'])){echo $_GET['keyword'];}?>"placeholder="搜索其实很简单" />
					<input class="submit" type="submit"  value="" />
				</form>
			</div>
	<ul class="nav">
		<li><a href="http://www.hnust.edu.cn/" target="_blank">湖南科技大学</a></li>
		<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://jwc.hnust.edu.cn/" target="_blank">教务网</a></li>
	</ul>
	<div class="login_info">
		<a target="_blank"href="index.php" style="color:#fff;">网站首页</a>&nbsp;|&nbsp;
		
	</div>
</div>
<div id="sidebar" class="row">
<div class="col-md-2">
<ul>
		<li>
			<div class="small_title">计算系统</div>
			<ul class="child">
				<li><a <?php if(basename($_SERVER['SCRIPT_NAME'])=='definition.php'){echo 'class="current"';}?> href="definition.php">计算公式及解析</a></li>
				<li><a <?php if(basename($_SERVER['SCRIPT_NAME'])=='index.php'){echo 'class="current"';}?> href="index.php">具体计算</a></li>
				<?php 
				if(basename($_SERVER['SCRIPT_NAME'])=='serarch.php'){
				    echo '<li> <a class="current">计算历史查询</a><li>';
				}
				?>
			</ul>
		</li>
	</ul>
</div>
	
</div>
</div>
