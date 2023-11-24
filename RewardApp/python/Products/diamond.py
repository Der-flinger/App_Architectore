from Products.i_game_item import GameItem


class Diamond(GameItem):
    def open(Self):
        print("\033[3;36;40m Diamond!\033[0m")
