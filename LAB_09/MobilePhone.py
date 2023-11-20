# -*- coding: cp1251 -*-

from Phone import Phone

# �������� ���� �������� �������
class MobilePhone(Phone):
    
    # �����������
    def __init__(self, brand, model, os):
        super().__init__(brand, model)
        self.os = os
        
    # ����� "����������� ����������"
    def install_app(self, app_name):
        print(f"������������ {app_name} �� ������� {self.brand} {self.model}\n")
