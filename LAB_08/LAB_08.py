# -*- coding: cp1251 -*-

import os
import struct
import sys
import math

# Запис даних в текстовий файл
def writeResTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))
 
# Читання даних з текстового файлу
def readResTxt(fName):
    result = 0.0
    try:
       if os.path.exists(fName):
          with open(fName, 'r') as f:
             result = f.read()
       else:
        raise FileNotFoundError(f"Файл {fName} не знайдено.")
    except FileNotFoundError as e:
        print(e)
    return result

# Запис даних в бінарний файл
def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', result))

# Читання даних з бінарного файлу
def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"Файл {fName} не знайдено.")
    except FileNotFoundError as e:
        print(e)
    return result

# Обчислення виразу
def calculate(x):
    return math.sin(x) * math.tan(8*x)

# Точка входу в програму main
if __name__ == "__main__":
    data = float(input("Введіть число: "))
    result = calculate(data)
    print(f"\nРезультат для sin(x)/ctg(8x): {result}")
    try:
        writeResTxt("textRes.txt", result)
        writeResBin("binRes.bin", result)
        print("\nРезультат з бінарного файлу: {0}".format(readResBin("binRes.bin")))
        print("\nРезультат з текстового файлу: {0}\n".format(readResTxt("textRes.txt")))
    except FileNotFoundError as e:
        print (e)
        sys.exit(1)

