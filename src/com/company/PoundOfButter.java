package com.company;
//Factory method
public class PoundOfButter {
    public static void main(String[] args) {
IProducer backer=new Backer();
backer.make(1);
IProduct bread=backer.make(1);
IProducer farmer =new Farmer();
IProduct butter=farmer.make(bread.getWeight());
IProducer judge=new Judge();
IProduct decision=judge.make(0);
System.out.println("A farmer sold a butter to the backer");
System.out.printf("The butter weight is %.2f pounds%n", butter.getWeight());
System.out.println("A backer took the farmer to a court");
System.out.println("The farmer put the bread on the scale");
System.out.printf("The bread weight is also %.2f pounds%n", bread.getWeight());
//typecast
System.out.printf(((Decision)decision).getDecision());
    }
}
//interface vs abstract class
interface IProduct{
double getWeight();
void setWeight(double weight);
}

class Bread implements IProduct{
    private double weight;
    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
this.weight=weight;
    }
}

class Butter implements IProduct{
    private double weight;
    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight=weight;
    }
}

class Decision implements IProduct{
    private double weight;

    public String getDecision() {
        return decision;
    }

    private final String decision="Don't try to cheat others";
    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void setWeight(double weight) {
        }


}
interface IProducer{
    IProduct make(double weight);
}

class Farmer implements  IProducer{

    @Override
    public IProduct make(double weight) {
        IProduct butter=new Butter();
        butter.setWeight(weight);
        return butter;
    }
}

class Backer implements  IProducer{

    @Override
    public IProduct make(double weight) {
        IProduct bread=new Bread();
        bread.setWeight(Math.random()*0.1+0.9);
        return bread;
    }
}

class Judge implements  IProducer{

    @Override
    public IProduct make(double weight) {
        IProduct decision=new Bread();
        decision.setWeight(Math.random()*0.1+0.9);
        return decision;
    }
}