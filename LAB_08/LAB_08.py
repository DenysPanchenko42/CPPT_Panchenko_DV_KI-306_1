# -*- coding: cp1251 -*-

import os
import struct
import sys
import math

# ����� ����� � ��������� ����
def writeResTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))
 
# ������� ����� � ���������� �����
def readResTxt(fName):
    result = 0.0
    try:
       if os.path.exists(fName):
          with open(fName, 'r') as f:
             result = f.read()
       else:
        raise FileNotFoundError(f"���� {fName} �� ��������.")
    except FileNotFoundError as e:
        print(e)
    return result

# ����� ����� � ������� ����
def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', result))

# ������� ����� � �������� �����
def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"���� {fName} �� ��������.")
    except FileNotFoundError as e:
        print(e)
    return result

# ���������� ������
def calculate(x):
    return math.sin(x) * math.tan(8*x)

# ����� ����� � �������� main
if __name__ == "__main__":
    data = float(input("������ �����: "))
    result = calculate(data)
    print(f"\n��������� ��� sin(x)/ctg(8x): {result}")
    try:
        writeResTxt("textRes.txt", result)
        writeResBin("binRes.bin", result)
        print("\n��������� � �������� �����: {0}".format(readResBin("binRes.bin")))
        print("\n��������� � ���������� �����: {0}\n".format(readResTxt("textRes.txt")))
    except FileNotFoundError as e:
        print (e)
        sys.exit(1)

