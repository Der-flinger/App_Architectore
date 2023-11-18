from random import randint
from Fabrics.gold_generator import GoldGenerator
from Fabrics.gem_generator import GemGenerator
from Fabrics.silver_generator import SilverGenerator
from Fabrics.ametist_generator import AmetistGenerator
from Fabrics.aquamarine_generator import AquamarineGenerator
from Fabrics.diamond_generator import DiamondGenerator
from Fabrics.emearld_generator import EmeraldGenerator
from Fabrics.ruby_generator import RubyGenerator
from Fabrics.sapphire_generator import SapphireGenerator


if __name__ == "__main__":
    GoldGenerator().create_item().open()

    generators = [
        GoldGenerator(),
        GemGenerator(),
        SilverGenerator(),
        AmetistGenerator(),
        AquamarineGenerator(),
        DiamondGenerator(),
        EmeraldGenerator(),
        RubyGenerator(),
        SapphireGenerator(),
    ]
    for i in range(10):
        generators[randint(0, 8)].create_item().open()
