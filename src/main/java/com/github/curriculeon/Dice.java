package com.github.curriculeon;

public class Dice {

    /**
     * @param numberOfDie - number of die-objects to be contained
     */
    public Die[] dice = null;
    public Integer numberOfDie = 0;
    public Integer numberOfFaces=0;
    public Dice(Integer numberOfDie) {
        this(numberOfDie, 6);


    }

    /**
     * @param numberOfDie - number of die-objects to be contained
     * @param numberOfFaces - number of faces on a single die-object
     */
    public Dice(Integer numberOfDie, Integer numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
        this.numberOfDie = numberOfDie;
        dice = new Die[numberOfDie];
        for(int i =0; i< numberOfDie; i++){
            Die newDie = new Die(numberOfFaces);
            newDie.roll();
            dice[i] = newDie;
        }
    }

    /**
     * Create a random number from 1 to 6 for each dice you roll
     * sum all of the random numbers up and that equals total for that roll
     */
    public Integer rollAndSum() {
        if(numberOfDie.equals(0) && numberOfFaces.equals(0)){
            throw new ArrayIndexOutOfBoundsException();
        }

        else if( numberOfFaces.equals(numberOfDie) || (numberOfDie.equals(0) || numberOfFaces.equals(0))){
            throw new IllegalArgumentException();
        }
        Integer results =0;
        for (Die die: dice){
            results+= die.getCurrentFaceValue();
        }
        return results;
    }

    /**
     * @return the absolute minimum value that can be rolled by this set of die
     */
    public Integer getRollMin() {
        return dice.length;
    }

    /**
     * @return the absolute maximum value that can be rolled by this set of die
     */
    public Integer getRollMax() {
        if(numberOfDie == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        return numberOfDie *numberOfFaces;
    }
}
