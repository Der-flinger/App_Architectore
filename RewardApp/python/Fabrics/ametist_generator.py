from Fabrics.item_fabric import ItemFabric
from Products.ametist import Ametist


class AmetistGenerator(ItemFabric):
    def create_item(self):
        return Ametist()
