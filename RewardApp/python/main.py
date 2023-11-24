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
    generators = []

    generators.append(DiamondGenerator())

    for i in range(3):
        generators.append(GoldGenerator())

    for i in range(10):
        generators.append(SilverGenerator())
        generators.append(AmetistGenerator())
        generators.append(AquamarineGenerator())
        generators.append(GemGenerator())
        generators.append(EmeraldGenerator())
        generators.append(RubyGenerator())
        generators.append(SapphireGenerator())
    for i in range(100):
        generators[randint(0, len(generators) - 1)].create_item().open()
