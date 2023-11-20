from Phone import Phone
from MobilePhone import MobilePhone
    
if __name__ == "__main__":

    phone = Phone("Generic", "Phone")
    phone.make_call("123-456-7890")

    mobile_phone = MobilePhone("Samsung", "Galaxy", "Android")
    mobile_phone.make_call("987-654-3210")
    mobile_phone.install_app("Sample App")
