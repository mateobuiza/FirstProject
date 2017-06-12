/**
 * Created by KleoG on 09/06/2017.
 */

/**
 * Create two fields. One called name, which is a String, and one which is called age which is an integer.
 *
 * Create a constructor, without parameters. Set name to equal mateo, and age to equal 22.
 *
 * Create another constructor, which accepts 2 parameters, string and int. Using the parameters, initialise the fields you
 * created.
 *
 * Create a method that accepts 3 integers in its parameters, works out the average of the three numbers and returns
 * the answer.
 *
 * Create another method, which accepts 3 integers in its parameters and finds out which one is the smallest number.
 * (possibly use if statements). Instead of returning the answer, print it out.
 *
 * Create a getter and setter for the 2 fields you created.
 *
 * Create one object of this class in main, and call all of the methods that you created.
 *
 */
public class MateoTask {

    public String name;
    public int age;
    public int average;

    public MateoTask() {

        name = "Mateo";
        age = 22;

    }

    public MateoTask (String name, int age){

        this.name = name;
        this.age = age;


    }

    public int getAverage (int age1, int age2, int age3){

//        int average;
//        average = (age1 + age2 + age3) /3;
//        return average;

        return (age1 + age2 + age3) / 3;

    }

    public void getSmallest (int no1, int no2, int no3) {

        int smallest = no1;
        if (smallest > no2) {

            no2 = smallest;
        }

        if (smallest > no3){

            no3 = smallest;
        }

        System.out.println(smallest);
    }


    public void setName(String name) {

        this.name = name;
    }

    public void setAge (int age){

        this.age = age;
    }


    public String getName() {

        return this.name;
    }

    public int getAge() {

        return this.age;
    }


}
