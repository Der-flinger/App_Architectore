from Fabrics.item_fabric import ItemFabric
from Products.sapphire import Sapphire


class SapphireGenerator(ItemFabric):
    def create_item(self):
        return Sapphire()
