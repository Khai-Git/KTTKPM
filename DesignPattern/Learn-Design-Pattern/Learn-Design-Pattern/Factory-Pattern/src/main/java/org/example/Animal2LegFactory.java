package org.example;

public class Animal2LegFactory extends AnimalFactory {

    private TowLeg leg;

    @Override
    public Animal createAnimal(int type) {
        if (type==1){
            leg = new Chicken();
            return leg;
        }else if (type==2){
            leg = new Duck();
            return leg;
        }
        return null;
    }
}
