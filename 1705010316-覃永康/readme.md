# # **开发工具**：eclipse   **开发语言**：java
# ## **运行环境**：jre1.8.0_171
# **功能描述**：按照题目要求依次输入a年份，b字长，c程序员日指令条数，d程序员月工资，f程序员每月工作天数，然后点击确认，直接给出题目所需要的答案。
# **源代码文件**：
# R.java为主函数，s321.java为界面及功能函数.

    					E=4080*Math.pow(2.718, 0.28*(a-1960));//E代表计算机容量并计算
    					String E1=String.valueOf(E);
    					textField_5.setText(E1);
    					F=0.003*b*Math.pow(0.72, a-1974)*E;//F代表存储器价格并计算
    					String F1=String.valueOf(F);
    					textField_6.setText(F1);
    					G=E/(c*f)*d;//G代表存贮器装满程序所需成本
    					String G1=String.valueOf(G);
    					textField_7.setText(G1);