package ru.netology.domain;

public class Radioman {
    private int volume;
    private int station;
    private int stationControl;

    public Radioman() {
        stationControl = 10;
    }

    public Radioman(int stationControl) {
        this.stationControl = stationControl;
    }

    public int getStationControl() {
        return stationControl;
    }

    public void setStationControl(int stationControl) {

        this.stationControl = stationControl;
    }

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
        if (station > 10) {
            if (station > this.stationControl)
            this.station = 0;
            return;
        }

        if (station < 0) {
            this.station = 10;
            this.station = this.stationControl;
            return;
        }
        this.station = station;
    }

    public void increaseStation() {
        setStation(this.station + 1);
    }

    public void decreaseStation() {
        setStation(this.station - 1);
    }

    public void increaseVolume() {
        if (volume == 100) {
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
}
