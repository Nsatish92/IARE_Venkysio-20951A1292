def str(s):
    if(len(s)>1):
        return str(s[1:])+s[0]
    else:
        return s
s=input("Enter a string:")
print("Reversed string is:",str(s))
        
