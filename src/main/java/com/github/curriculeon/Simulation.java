package com.github.curriculeon;

public class Simulation {
    public Integer numberOfDie =0;
    public Integer numberOfTosses = 0;
    public Dice dice= new Dice(numberOfDie);
    public Bins bins=new Bins();


    public Simulation(Integer numberOfDie, Integer numberOfTosses) {
        this.numberOfDie = numberOfDie;
        this.numberOfTosses = numberOfTosses;




    }

    public void run() {
        dice = new Dice(numberOfDie);
        bins= new Bins(dice.getRollMin(), dice.getRollMax());
        for(int i=0; i< numberOfTosses; i++){
            bins.incrementBin(numberOfTosses);
        }

    }

    public Double getPercentageOfOccurrences(Integer faceValueToCheck) {
      //  System.out.println(faceValueToCheck);
        return null;
    }

    @Override
    public String toString() {
        return "Simulation{" +
                "numberOfDie=" + numberOfDie +
                ", numberOfTosses=" + numberOfTosses +
                ", dice=" + dice +
                ", bins=" + bins +
                '}';
    }

    public Bins getBins() {
        return bins;
    }
}
