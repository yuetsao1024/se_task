 <script type="text/javascript" src="http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=default"></script> 
 # Task 1

### 1.  Devlopment Kit
1. Language : Python    version  3.7.6 
2. IDE :JetBrains PyCharm Community Edition 2019.2.1 x64
3. VCS : Git
4. Packger : Pyinstaller 3.7
5. GUI: tkinter 

### 2.  Code Structure
- src
	* show
	 	+ show.gif ----- 展示
	* static 
		+ cal.ico  ----- 图标
	* **count.py**  -----主程序 
### 3. Design 

~~秉承没有设计就是最好的设计~~

第一次使用python写gui
所以UI尽可能简单，但是功能一定要人性化

利用好组件库的特性，优化交互逻辑。

Button  Entry Label Scale RadioButton 是我用到的所有tkinter的组件

利用Scale优化了选择年份和月工作时间的交互，改输入数字为拖动比例尺选择，当然也可以自己填写。
利用RadioButton 勾选字长，因为CPU字长数现在民用只有三种字长 16位 32位 64位

这样的设计 更加的方便，提高了效率

### 4. count.py（源程序）

用3个frame划分窗体
 
分别是

1. 输入年份 计算需求量
2. 输入字长 计算价格
3. 输入工资及工作量 计算成本

每个窗体用组件填充 
再定义三个button的函数控制
分为 

countM

\[M = 4080e^{0.28(Y-1960)}\]

countP1

countP2

