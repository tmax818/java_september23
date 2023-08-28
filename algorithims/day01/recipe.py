class Recipe:

    Total_recipes = 0;    
    def __init__(self) -> None:
        Recipe.Total_recipes += 1    
    
    def printRecipe():
        print(self.rec)
        
    @classmethod
    def sayClass():
        pass
    
Recipe.sayClass()

recipe = Recipe()

recipe.printRecipe()
Recipe.get_all()