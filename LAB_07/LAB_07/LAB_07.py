import sys

rows_num = int(input("Enter the size of the square matrix: "))
lst = []
filler = input("Enter a placeholder character: ")

if len(filler) != 1:
    print("\nInvalid placeholder character\n")
    sys.exit(1)

for i in range(rows_num):
    lst.append([])
    for j in range(rows_num):
        if j % 2 == 0:
            lst[i].append(ord(' '))
        else:  
            lst[i].append(ord(filler))
for i in range(rows_num):
    for j in range(rows_num ):
        print(chr(lst[i][j]), end=" ")
    print()