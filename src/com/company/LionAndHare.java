package com.company;

public class LionAndHare {
    public static void main(String[] args) {
        Hare hare = new CleverHare();
        Lion lion = new StupidLion();
        hare.meetWithLion(lion);
        lion.meetWithHare(hare);
    }
}

abstract class Lion{
    public boolean intellect;
    abstract public  void meetWithHare(Hare hare);
    }

    abstract class Hare{
    public boolean intellect;
    abstract public void meetWithLion(Lion lion);
    }

    class  CleverHare extends Hare{
        public CleverHare() {
            this.intellect=true;
        }

        @Override
        public void meetWithLion(Lion lion) {
            if (lion.intellect)
System.out.println("The lion is clever, my attempt is falls");
            else
System.out.println("The lion is stupid, I will try to fool him");


        }
    }

class  StupidHare extends Hare{
    public StupidHare() {
        this.intellect=false;
    }

    @Override
    public void meetWithLion(Lion lion) {
        if (lion.intellect)
            System.out.println("The lion is clever, I will not do anything");
        else
            System.out.println("The lion is stupid, I afraid of him");


    }
}

class  CleverLion extends Lion{
    public CleverLion() {
        this.intellect=true;
    }

    @Override
    public void meetWithHare(Hare hare) {
        if (hare.intellect)
            System.out.println("The hare is clever. I don't want to eat him");
        else
            System.out.println("The hare is stupid. I'd rather eat him");
    }

}

class  StupidLion extends Lion{
    public StupidLion() {
        this.intellect=false;
    }

    @Override
    public void meetWithHare(Hare hare) {
        if (hare.intellect)
System.out.println("The hare is clever. I don't want to eat him");
        else
System.out.println("It is another hare. I'm very hungry");
    }

}