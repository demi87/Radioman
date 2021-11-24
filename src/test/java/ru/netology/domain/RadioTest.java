package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldCurrentRadioStation8() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(8);
        int expected = 8;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    void shouldCurrentRadioStation0() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(0);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    void shouldCurrentRadioStation1() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(1);
        int expected = 1;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCurrentRadioStation10() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(10);

        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCurrentRadioStationminus1() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    void shouldNextRadioStationin9to0() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(9);
        stat.nextRadioStation();
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    void shouldNextRadioStationin7to8() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(7);
        stat.nextRadioStation();
        int expected = 8;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    void shouldPrevRadioStation0() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(0);
        stat.prevRadioStation();
        int expected = 9;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    void shouldPrevRadioStation5() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(5);
        stat.prevRadioStation();
        int expected = 4;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    void sholdCurrentVolume0() {
        Radio stat = new Radio();
        stat.setCurrentVolume(0);
        int expected = 0;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void sholdCurrentVolumeMin1() {
        Radio stat = new Radio();
        stat.setCurrentVolume(-1);
        int expected = 0;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCurrentVolume10() {
        Radio stat = new Radio();
        stat.setCurrentVolume(10);
        int expected = 10;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseVolume11() {
        Radio stat = new Radio();
        stat.setCurrentVolume(11);
        stat.increaseVolume();
        int expected = 1;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseVolume10() {
        Radio stat = new Radio();
        stat.setCurrentVolume(10);
        stat.increaseVolume();
        int expected = 10;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseVolume9() {
        Radio stat = new Radio();
        stat.setCurrentVolume(9);
        stat.increaseVolume();
        int expected = 10;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseVolume0() {
        Radio stat = new Radio();
        stat.setCurrentVolume(0);
        stat.increaseVolume();
        int expected = 1;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseVolumeMin1() {
        Radio stat = new Radio();
        stat.setCurrentVolume(-1);
        stat.increaseVolume();
        int expected = 1;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldDecreaseVolume0() {
        Radio stat = new Radio();
        stat.setCurrentVolume(0);
        stat.decreaseVolume();
        int expected = 0;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldDecreaseVolume1() {
        Radio stat = new Radio();
        stat.setCurrentVolume(1);
        stat.decreaseVolume();
        int expected = 0;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }

}