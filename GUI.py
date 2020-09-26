import tkinter\

root=tkinter.Tk()
S=tkinter.Scrollbar(root)
T=tkinter.Text(root)

T.focus_set()
S.pack(side=tkinter.RIGHT,fill=tkinter.Y)
T.pack(side=tkinter.LEFT,fill=tkinter.Y)
S.config(command=T.yview)
T.config(yscrollcommand=S.set)

for i in range(40):
    T.insert(tkinter.END,"THSI IS LINE %d\n"%i)
    T.yview(tkinter.MOVETO,1.0)

tkinter.mainloop()


 
