package Items;
import Game.GameSession;

public abstract class Item {
    protected String name;
    protected boolean isActive;
    protected int quantity;

    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity(){return quantity;}
    public void useItem(){if (quantity>0) quantity--;}
    public boolean isAvailable(){return quantity>0;}
    public void activate(){isActive = true; useItem();}
    public void deactivate(){isActive = false;}
    public boolean status(){return isActive;}
    
    public abstract String getName();
    public abstract void ApplyEffect(GameSession session);
}
