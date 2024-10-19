package com.github.curriculeon;

import java.util.Arrays;
import java.util.Random;

public class Bins {
    public Integer minFaceValue;
    public Integer maxFaceValue;
    public Integer randomNumber;
    public  Bin[] bins = new Bin[]{};
    public Integer faceValueOfBin;
    public Bins() {

    }

    public Bins(Integer minFaceValue, Integer maxFaceValue) {
        if(minFaceValue > maxFaceValue){
            throw new NegativeArraySizeException();
        } else if(minFaceValue ==null || maxFaceValue==null){
            throw new NullPointerException();
        }
        this.minFaceValue = minFaceValue;
        this.maxFaceValue = maxFaceValue;
        if(!minFaceValue.equals(maxFaceValue)){
            Random random = new Random();
            this.randomNumber = random.nextInt(maxFaceValue -minFaceValue) + minFaceValue;
        }


    }

    public void incrementBin(Integer faceValueToIncrement) {
    boolean exist = false;
        System.out.println("inside");
        System.out.println(bins);
            for(Bin bin: bins){
                System.out.println("inside for loop");
                if(bin.faceValueToTrack.equals(faceValueToIncrement)){
                    System.out.println("inside if statuement");
                    System.out.println("inside bin");
                    bin.increment();
                    System.out.println(bin.getNumberOfOccurrences());
                    exist = true;
                    break;
                }
            }
            if(!exist){
                System.out.println("inside false");
                this.bins= Arrays.copyOf(bins, bins.length+1);
                Bin bin1 = new Bin(faceValueToIncrement);
                bin1.increment();
                bins[bins.length-1] = bin1;
                System.out.println(bins.length);

            }


    }

    public Bin getBin(Integer faceValueOfBin) {
        boolean exist = false;
        Bin newBin = new Bin(faceValueOfBin);
        for(Bin bin: bins){
            if(bin.getFaceValueToTrack().equals(faceValueOfBin)){
                exist = true;
                return bin;
            }
        }
        if(!exist){
            this.bins = Arrays.copyOf(bins, bins.length+1);
            this.bins[this.bins.length -1] = newBin;
        }

        return (faceValueOfBin != null && !exist) ? newBin : null ;
    }

    public Bin[] getBins() {
        return bins;
    }
}
