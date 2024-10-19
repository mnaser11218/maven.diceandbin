package com.github.curriculeon;

import java.util.Random;

public class Die {
    public Integer numberOfFaces=6;
    public Integer currentFaceValue;
    public Die() {
    }

    public Die(Integer numberOfFaces) {

        this.numberOfFaces = numberOfFaces;
    }

    public void roll() {
//        if(numberOfFaces.equals(1)){
//            throw new IllegalArgumentException();
//        }
        if(numberOfFaces == null){
            throw new NullPointerException();
        }
        Random random = new Random();
        Integer value = random.nextInt(6 - 1)+1;
        this.currentFaceValue = value;

    }

    public Integer getCurrentFaceValue() {
        return this.currentFaceValue;   }

    public Integer getNumberOfFaces() {
        return this.numberOfFaces;    }
}
