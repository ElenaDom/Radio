package ru.netology.domain;

public class Radioman {
    private int volume = 10;
    private int station = 0;


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station > 9) {
            return;
        }

        if (station < 0) {
            return;
        }
        this.station = station;
    }


    public void increaseStation() {
        setStation(this.station - 1);
    }

    public void decreaseStation() {
        setStation(this.station + 1);
    }


    public void increaseVolume() {
        if (volume == 10) {
            return;
        }
        volume++;
    }


    public void decreaseVolume() {
        if (volume == 0) {
            return;
        }
        volume--;

}
    public void decreaseVolume() {
        if (volume == 0) {
            return;
        }
        volume--;

}

