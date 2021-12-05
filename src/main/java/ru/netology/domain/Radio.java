package ru.netology.domain;

public class Radio {
    private int numberRadioStation = 10;
    private int currentRadioStation;
    private int currentVolume;
    private boolean on;

    public Radio() {
    }

    public Radio(int numberRadioStation) {
        this.numberRadioStation = numberRadioStation;
    }

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public void setNumberRadioStation(int numberRadioStation) {
        if (numberRadioStation < 0) {
            return;
        }
        this.numberRadioStation = numberRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > numberRadioStation - 1) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < numberRadioStation - 1) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = numberRadioStation - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
