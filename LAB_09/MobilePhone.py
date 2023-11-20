# -*- coding: cp1251 -*-

from Phone import Phone

# Похідний клас мобільний телефон
class MobilePhone(Phone):
    
    # Конструктор
    def __init__(self, brand, model, os):
        super().__init__(brand, model)
        self.os = os
        
    # Метод "завантажити застосунок"
    def install_app(self, app_name):
        print(f"Завантаження {app_name} на пристрій {self.brand} {self.model}\n")
