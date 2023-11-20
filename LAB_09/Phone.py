# -*- coding: cp1251 -*-

# Базовий клас телефон
class Phone:
    
    # Конструктор
    def __init__(self, brand, model):
        self.brand = brand
        self.model = model
        
    # Метод "здійснити дзвінок"
    def make_call(self, number):
        print(f"{self.brand} {self.model} здійснює дзвінок за номером {number}\n")
