package Fabrics;

import Interface.IGameItems;
import Products.Gem;

public class GemGenerator extends ItemGenerator {

    @Override
    public IGameItems createItem() {
        return new Gem();
    }

}
