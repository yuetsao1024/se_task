from tkinter import *
import math

def countM():
    try:
        Y = float(inp1.get())
    except Exception:
        print("Trans to float error")
    res=4080 * (math.e ** (0.28*(Y - 1960)))
    i=0
    s = '%d\n' % res
    v.set('存储容量需求为' + s + '字\n')
    return res

def countP1():
    try:
        Y = float(inp1.get())
        flag=o.get()
    except Exception:
        print("Trans to float error")
    if(flag==16):
        res = 0.048 * (0.72 ** (Y - 1974)) * countM()
        s = '%d\n' % res
        v2.set(s + '美元')
    else :
        res = 0.003 * (0.72 ** (Y - 1974)) * countM()*flag
        s = '%d\n' % res
        v2.set(s + '美元')
def countP2():
    try:
        a = float(inp2.get())
        b = float(inp3.get())
        c = float(inp4.get())
    except Exception:
        print("Trans to float error")
    res=countM()/a/b*c
    s = '%d\n' % res
    v3.set(s+'美元')
    return countM()/a/b*c
root = Tk()
root.title("计算机容量与价格计算")
root.geometry("720x405")
frame=Frame(root,bg='white')
frame.place(x=0,y=0,width=720,height=405,relx=0,rely=0)

frame1=Frame(frame,bg='white')
# frame 1
ylabel = Label(frame1, text="请输入年份:", font=16,bg='white')
ylabel.pack(side=LEFT)

inp1 = Entry(frame1,font=16,bg='#f0f0f0',width=10)
inp1.pack(side=LEFT,padx=20)

btn1 = Button(frame1, text='计算需求量', command=countM,width=10,bg='SkyBlue')
btn1.pack(side=LEFT,padx=20)

v=StringVar()
res1=Label(frame1,textvariable=v,width=40,font=16,height=3)
res1.pack()
frame1.pack(pady=10)
## end frame1

## frame 2 start
frame2 =Frame(frame,bg='white',pady=10)
frame4 =Frame(frame2,bg='white')
o=IntVar();
tip =Label(frame4,text="请勾选\n计算机字长",bg='white')
tip.pack(side=LEFT)
rd = Radiobutton(frame4, text="16位", variable=o, value=16,bg='white')
rd.pack()
rd2 = Radiobutton(frame4, text="32位", variable=o, value=32,bg='white')
rd2.pack()
rd3 = Radiobutton(frame4, text="64位", variable=o, value=64,bg='white')
rd3.pack()
frame4.pack(side=LEFT,fill=Y,padx=20)

btn2 = Button(frame2, text='计算价格', command=countP1,width=10,bg='SkyBlue')
btn2.pack(side=LEFT)

v2=StringVar()
res2=Label(frame2,textvariable=v2,width=40,font=16,height=3)
res2.pack(side=LEFT,padx=20)

frame2.pack()
# frame2 end

#frame3 start
frame3 =Frame(frame,bg='white',pady=10)
labelfr=Frame(frame3,bg='white')
daytime = Label(labelfr, text="月工作几日:", font=16,bg='white')
daytime.pack(pady=5)
everyday = Label(labelfr, text="每天的开发量:", font=16,bg='white')
everyday.pack(pady=5)
paying = Label(labelfr, text="月工资:", font=16,bg='white')
paying.pack(pady=5)
labelfr.pack(side=LEFT,fill=Y)

inputfr =Frame(frame3,bg='white')
inp2 = Entry(inputfr,font=16,bg='#f0f0f0',width=10)
inp2.pack(pady=5)
inp3 = Entry(inputfr,font=16,bg='#f0f0f0',width=10)
inp3.pack(pady=5)
inp4 = Entry(inputfr,font=16,bg='#f0f0f0',width=10)
inp4.pack(pady=5)

inputfr.pack(side=LEFT,padx=10,fill=Y)

btn4 = Button(frame3, text='计算成本', command=countP2,width=10,bg='SkyBlue')
btn4.pack(side=LEFT)

v3=StringVar()
res3=Label(frame3,textvariable=v3,width=40,font=16,height=3)
res3.pack(side=LEFT,padx=10)
frame3.pack()
# frame3 emd

root.mainloop()