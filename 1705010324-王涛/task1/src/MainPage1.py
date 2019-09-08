# -*- coding: utf-8 -*-
'''
Created on 2019年9月4日

@author: Administrator
'''
from tkinter import *
import math

class MainPage(object):
    def __init__(self, master=None):
        self.root = master #定义内部变量root 
        self.root.geometry('%dx%d' % (300, 250)) #设置窗口大小 
        self.year = IntVar() 
        self.date = IntVar()
        self.instruction=IntVar()
        self.salary=IntVar() 
        self.createPage() 
     
    def createPage(self):
        self.page = Frame(self.root) #创建Frame 
        self.page.pack() 
        Label(self.page,text="年份：").grid(row=0,column=0)
        Label(self.page,text="字长：").grid(row=1,column=0)
        Label(self.page,text="指令：").grid(row=2,column=0)
        Label(self.page,text="工资（美元）：").grid(row=3,column=0)
        Label(self.page,text="需求（字）：").grid(row=4,column=0)
        Label(self.page,text="储存器价格（美元）：").grid(row=5,column=0)
        Label(self.page,text="成本（美元）：").grid(row=6,column=0)
        
        self.e1=Entry(self.page,textvariable=self.year)
        self.e2=Entry(self.page,textvariable=self.date)
        self.e3=Entry(self.page,textvariable=self.instruction)
        self.e4=Entry(self.page,textvariable=self.salary)
        self.e5=Entry(self.page)
        self.e6=Entry(self.page)
        self.e7=Entry(self.page)
        self.e1.grid(row=0,column=1,padx=10,pady=5)
        self.e2.grid(row=1,column=1,padx=10,pady=5)
        self.e3.grid(row=2,column=1,padx=10,pady=5)
        self.e4.grid(row=3,column=1,padx=10,pady=5)
        self.e5.grid(row=4,column=1,padx=10,pady=5)
        self.e6.grid(row=5,column=1,padx=10,pady=5)
        self.e7.grid(row=6,column=1,padx=10,pady=5)
        Button(self.page,text="确定",width=10,command=self.show).grid(row=7,column=0,sticky=W)
        Button(self.page,text="退出",width=10,command=self.page.quit).grid(row=7,column=1,sticky=E)
    def show(self):
        a=self.year.get()
        b=self.date.get()
        e=self.instruction.get()
        f=self.salary.get()
        c=math.exp(0.28*(a-1960))*4080
        c1=round(c,2)
        d=0.003*b*0.72**(a-1974)*c
        d1=round(d,2)
        g=(f/(e*30))*c1
        g1=round(g,2)
        self.e5.insert(0,c1)
        self.e6.insert(0,d1)
        self.e7.insert(0,g1)



