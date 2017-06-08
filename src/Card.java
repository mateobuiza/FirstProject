/**
 * Created by Mateo on 07/06/2017.
 */
public class Card {
    protected String name;
    protected int defence, attack;

    public Card (String name, int defence, int attack) {

        this.name = name;
        this.defence = defence;
        this.attack = attack;

    }
    public String getName()
    {
        return name;
    }

    public int getAttack()
    {
       return attack;
    }

    public int getDefence()
    {
        return defence;
    }

}
