package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    public void shouldIncreaseVolumeNotMax() {
        Radioman radioman = new Radioman();
        radioman.setVolume(7);
        radioman.increaseVolume();
        assertEquals(8, radioman.getVolume());
    }
    @Test
    public void shouldIncreaseVolumeMax() {
        Radioman radioman = new Radioman();
        radioman.setVolume(10);
        radioman.increaseVolume();
        assertEquals(10, radioman.getVolume());
    }
    @Test
    public void shouldDecreaseVolumeNotMin() {
        Radioman radioman = new Radioman();
        radioman.setVolume(7);
        radioman.decreaseVolume();
        assertEquals(6, radioman.getVolume());
    }
    @Test
    public void shouldDecreaseVolumeMin() {
        Radioman radioman = new Radioman();
        radioman.setVolume(0);
        radioman.decreaseVolume();
        assertEquals(0, radioman.getVolume());
    }
    @Test
    public void shouldIncreaseStation() {
        Radioman radioman = new Radioman();
        radioman.setStation(7);
        radioman.increaseStation();
        assertEquals(8, radioman.getStation());
    }
    @Test
    public void shouldIncreaseStationMax() {
        Radioman radioman = new Radioman();
        radioman.setStation(9);
        radioman.increaseStation();
        assertEquals(0, radioman.getStation());

    }
    @Test
    public void shouldDecreaseStation() {
        Radioman radioman = new Radioman();
        radioman.setStation(7);
        radioman.decreaseStation();
        assertEquals(6, radioman.getStation());
    }
    @Test
    public void shouldDecreaseStationMin() {
        Radioman radioman = new Radioman();
        radioman.setStation(0);
        radioman.decreaseStation();
        assertEquals(9, radioman.getStation());
    }
}


