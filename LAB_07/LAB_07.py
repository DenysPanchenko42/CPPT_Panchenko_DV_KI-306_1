# -*- coding: cp1251 -*-

import sys

# �������� �����
rows_num = int(input("������ ����� �������: "))
lst = []
filler = input("������ ������ ����������: ")

# �������� �������� �������
if len(filler) != 1:
    print("\n������� ��� ������� ������� �����������.\n������� ������ ���� ������\n")
    sys.exit(1)

# ���������� �������
for i in range(rows_num):
    lst.append([])
    for j in range(rows_num):
        if j % 2 == 0:
            lst[i].append(ord(' '))
        else:  
            lst[i].append(ord(filler))

            
# ��������� �������
for i in range(rows_num):
    for j in range(rows_num ):
        print(chr(lst[i][j]), end=" ")
    print()