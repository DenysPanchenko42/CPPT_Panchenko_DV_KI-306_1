# -*- coding: cp1251 -*-

import sys

# Введення даних
rows_num = int(input("Введіть розмір матриці: "))
lst = []
filler = input("Введіть символ заповнювач: ")

# Перевірка наявності помилки
if len(filler) != 1:
    print("\nПомилка при введенні символа заповнювача.\nПотрібно ввести один символ\n")
    sys.exit(1)

# Заповнення матриці
for i in range(rows_num):
    lst.append([])
    for j in range(rows_num):
        if j % 2 == 0:
            lst[i].append(ord(' '))
        else:  
            lst[i].append(ord(filler))

            
# Виведення матриці
for i in range(rows_num):
    for j in range(rows_num ):
        print(chr(lst[i][j]), end=" ")
    print()