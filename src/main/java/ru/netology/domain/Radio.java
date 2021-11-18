package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation >9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation ==9) {
            currentRadioStation = 0;
        }
    }
    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume > 10) {
            return;
        }
        if (CurrentVolume < 0) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
