<?php
if(isset($_POST["submit"])){
    $b=$_POST["year_p"];
    $c=$_POST["bit"];
    $result2=0.3 * $c *0.72**($b-1974);
}


//$result=3 * $a;
?>
<div id="main">
	<div class="title" style="margin-bottom:20px;">存储器容量需求计算</div>
	<form method="post"  >
		<table class="au">
			<tr>
				<td>请输入所要计算的年份:</td>
				<td><input value="<?php echo $b;?>" name="year_p" type="text" /></td>
				<td>
					输入年份应该是1960年以后的年份
				</td>
			</tr>
			<tr>
				<td>请输入计算机字长：</td>
				<td><input value="<?php echo $c;?>" name="bit" type="text" /></td>
				<td>
					输入年份应该是1974年以后的年份
				</td>
			</tr>
			<tr>
				<td>存储容量为：</td>
				<td><?php echo $result2;?>(美分/位)</td>
			</tr>
		</table>
		<input style="margin-top:20px;cursor:pointer;" class="btn" type="submit" name="submit" value="计算" />
	</form>
	<br /><br />
</div>