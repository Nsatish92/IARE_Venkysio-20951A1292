def reverseStr(strs):
    n = len(strs)
    str1 = ''
    i = n - 1
    while i >= 0:
        str1 += strs[i]
        i -= 1
    print(str1)    
strs =input()
reverseStr(strs);
