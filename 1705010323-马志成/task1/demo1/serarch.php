<?php
include_once 'inc/config.inc.php';
include_once 'inc/mysql.inc.php';
$link=connect();
if(!isset($_GET['keyword'])){
    $_GET['keyword']='';
}
$_GET['keyword']=trim($_GET['keyword']);
$_GET['keyword']=escape($link, $_GET['keyword']);
$query="select count(*) from volume where year like '%{$_GET['keyword']}%'";
$count_all=num($link, $query);

?>
<?php include_once 'inc/header.php';?>
<div id="main" >
	<div class="title">计算历史查询</div>
	<h3>共有<?php echo $count_all?>条匹配的记录</h3>
	<table class="list">
		<tr>
			<th>计算年限</th>	 	 	
			<th>计算值</th>
			<th>操作时间</th>
		</tr>
		<?php 
		$query="select *  from volume";
		$result=execute($link, $query);
		while($data=mysqli_fetch_assoc($result)){  
$html=<<<A
        <tr>
            <td>{$data['id']}</td>
			<td>{$data['year']}</td>
			<td>{$data['volume']}</td>
            <td>{$data['time']}</td>
			
		</tr>
A;
        echo $html;

		}
		?>

	</table>
</div>
<?php include_once 'inc/fooder.inc.php';?>