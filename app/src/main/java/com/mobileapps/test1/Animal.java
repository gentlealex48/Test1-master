package com.mobileapps.test1;

import java.util.ArrayList;

public class Animal {

    int energy = 10;

    int soundCost = 3;
    int eatBenefit = 5;
    int sleepBenefit = 10;
    ArrayList eatsFoodTypes;

    int countOfSpecies;

    public Animal(int energy, int soundCost, int eatBenefit, int sleepBenefit, int countOfSpecies) {
        this.energy = energy;
        this.soundCost = soundCost;
        this.eatBenefit = eatBenefit;
        this.sleepBenefit = sleepBenefit;
        this.countOfSpecies = countOfSpecies;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getSoundCost() {
        return soundCost;
    }

    public void setSoundCost(int soundCost) {
        this.soundCost = soundCost;
    }

    public int getEatBenefit() {
        return eatBenefit;
    }

    public void setEatBenefit(int eatBenefit) {
        this.eatBenefit = eatBenefit;
    }

    public int getSleepBenefit() {
        return sleepBenefit;
    }

    public void setSleepBenefit(int sleepBenefit) {
        this.sleepBenefit = sleepBenefit;
    }

    public int getCount() {
        return countOfSpecies;
    }

    public void setCountOfSpecies(int countOfSpecies) {
        this.countOfSpecies = countOfSpecies;
    }
}
