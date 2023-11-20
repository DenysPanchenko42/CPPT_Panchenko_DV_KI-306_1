# -*- coding: cp1251 -*-

from Phone import Phone
from MobilePhone import MobilePhone

# Точка входу в програму main
if __name__ == "__main__":

    # Створення об'єкту телефон
    phone = Phone("Generic", "Phone")
    phone.make_call("123-456-7890")

    # Створення об'єкту мобільний телефон
    mobile_phone = MobilePhone("Samsung", "Galaxy", "Android")
    mobile_phone.make_call("987-654-3210")
    mobile_phone.install_app("Якийсь застосунок")
