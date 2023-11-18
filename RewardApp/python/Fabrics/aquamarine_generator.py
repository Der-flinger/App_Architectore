from Fabrics.item_fabric import ItemFabric
from Products.aquamarine import Aquamarine


class AquamarineGenerator(ItemFabric):
    def create_item(self):
        return Aquamarine()
