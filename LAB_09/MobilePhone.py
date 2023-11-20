from Phone import Phone

class MobilePhone(Phone):
    def __init__(self, brand, model, os):
        super().__init__(brand, model)
        self.os = os

    def install_app(self, app_name):
        print(f"Installing {app_name} on {self.brand} {self.model}")
