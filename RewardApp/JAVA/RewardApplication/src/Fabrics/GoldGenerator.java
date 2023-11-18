package Fabrics;

import Interface.IGameItems;
import Products.Gold;

public class GoldGenerator extends ItemGenerator {

    @Override
    public IGameItems createItem() {
        return new Gold();
    }

}
