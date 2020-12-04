package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {


    @Test
    public void shouldIncreaseStation() {
        Radioman radioman = new Radioman();
        radioman.increaseStation();
        int actual = radioman.getStation();
        assertEquals(0, actual);
    }


    @Test
    public void shouldDecreaseStation() {
        Radioman radioman = new Radioman();
        radioman.decreaseStation();
        radioman.decreaseStation();
        radioman.decreaseStation();
        radioman.decreaseStation();
        radioman.decreaseStation();
        radioman.decreaseStation();
        radioman.decreaseStation();
        radioman.decreaseStation();
        radioman.decreaseStation();
        radioman.decreaseStation();
        radioman.decreaseStation();
        radioman.decreaseStation();
        int actual = radioman.getStation();
        assertEquals(9, actual);
    }
    @Test
    public void shouldIncreaseStationNegative() {
        Radioman radioman = new Radioman();
        radioman.setStation(30);
        assertEquals(0, radioman.getStation());
    }
    @Test
    public void shouldDecreaseVolume() {
        Radioman radioman = new Radioman();
        radioman.decreaseVolume();
        radioman.decreaseVolume();
        radioman.decreaseVolume();
        radioman.decreaseVolume();
        radioman.decreaseVolume();
        radioman.decreaseVolume();
        radioman.decreaseVolume();
        radioman.decreaseVolume();
        radioman.decreaseVolume();
        radioman.decreaseVolume();
        assertEquals(0, radioman.getVolume());
    }
    @Test
    public void shouldIncreaseVolume() {
        Radioman radioman = new Radioman();
        radioman.increaseVolume();
        int actual = radioman.getVolume();
        assertEquals(10, actual);
    }
    @Test
    public void shouldIncreaseVolumeNegative() {
        Radioman radioman = new Radioman();
        radioman.setVolume(20);
        assertEquals(20, radioman.getVolume());
    }
}