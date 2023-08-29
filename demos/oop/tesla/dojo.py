class Dojo:
    
    TotalDojos = 0
    def __init__(self) -> None:
        Dojo.TotalDojos += 1
    
    def addNinja(ninja):
        pass
    
    @classmethod
    def Display_total_dojos():
        print(Dojo.TotalDojos)
    
burbank = Dojo()

burbank.addNinja("Braxton")
Dojo.Display_total_dojos()
Recipe.get_all()