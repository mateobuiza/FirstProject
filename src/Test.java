/**
 * Created by Mateo on 08/06/2017.
 */
public class Test {


    //These are fields (variables). The whole class can access these variables.
    //the variable name has been declared of type string.
    public String name;

    //Ths is an empty constructor with no paramaters

    public Test(){

        name = "Mateo";
    }

    //This is another constructor with a paramater (name).
    public Test(String name){

        this.name = name;
    }

    //Methods are written here, outside the constructor.
    //This method is a getter
    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }

}
