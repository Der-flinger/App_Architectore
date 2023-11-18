from Fabrics.item_fabric import ItemFabric
from Products.ruby import Ruby


class RubyGenerator(ItemFabric):
    def create_item(self):
        return Ruby()
