<?php
include 'inc/config.inc.php';
include 'inc/mysql.inc.php';
$link=connect();
if(isset($_POST["submit1"])){
    
    $a=$_POST["year_m"];
    $result1=4080 * exp( 0.28*($a-1960));
    //$result2 = $result1.substring(0,6);
    $query="insert into volume(year,time,volume) values({$_POST['year_m']},now(),{$result1})";
    execute($link,$query);
    
}


//$result=3 * $a;
?>
<div id="main">
	<div class="title" style="margin-bottom:20px;">存储器容量需求计算</div>
	<form method="post"  >
		<table class="au">
			<tr>
				<td>请输入所要计算的年份:</td>
				<td><input value="<?php echo $a;?>" name="year_m" type="text" /></td>
				<td>
					输入年份应该是1960年以后的年份
				</td>
			</tr>
			<tr>
				<td>存储容量为：</td>
				<td><?php echo $result1;?></td>
			</tr>
		</table>
		<input style="margin-top:20px;cursor:pointer;" class="btn" type="submit" name="submit1" value="计算" />
	</form>
</div>