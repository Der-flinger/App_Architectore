package Fabrics;

import Interface.IGameItems;

public abstract class ItemGenerator {

    public abstract IGameItems createItem();

    public void openReward() {
        createItem().open();
    }
}
