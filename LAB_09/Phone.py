# -*- coding: cp1251 -*-

# ������� ���� �������
class Phone:
    
    # �����������
    def __init__(self, brand, model):
        self.brand = brand
        self.model = model
        
    # ����� "�������� ������"
    def make_call(self, number):
        print(f"{self.brand} {self.model} ������� ������ �� ������� {number}\n")
