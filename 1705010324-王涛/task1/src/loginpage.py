# -*- coding: utf-8 -*-
'''
Created on 2019年9月4日

@author: Administrator
'''
from tkinter import *
from MainPage1 import *

class LoginPage(object): 
    def __init__(self, master=None): 
        self.root = master
        self.root.geometry('%dx%d' % (200,180))
        self.createPage()
        
    def createPage(self):
        self.page = Frame(self.root)  
        self.page.pack()
        Button(self.page, text='第一题',command=self.loginCheck).grid(row=1, stick=W, pady=10)
        
    def loginCheck(self):
        self.page.destroy()
        MainPage(self.root)
