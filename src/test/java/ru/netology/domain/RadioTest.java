package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio stat = new Radio();

    @Test
    void shouldNumberRadioStation() {
        stat.setNumberRadioStation(10);
        int expected = 10;
        int actual = stat.getNumberRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberRadioStationMinus5() {
        stat.setNumberRadioStation(-5);
        int expected = 10;
        int actual = stat.getNumberRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStation8() {
        stat.setCurrentRadioStation(8);
        int expected = 8;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStation0() {
        stat.setCurrentRadioStation(0);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStation1() {
        stat.setCurrentRadioStation(1);
        int expected = 1;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStation10() {
        stat.setCurrentRadioStation(10);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationminus1() {
        stat.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadioStationin9to0() {
        stat.setCurrentRadioStation(9);
        stat.nextRadioStation();
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadioStationin7to8() {
        stat.setCurrentRadioStation(7);
        stat.nextRadioStation();
        int expected = 8;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadioStationin8to9() {
        stat.setCurrentRadioStation(8);
        stat.nextRadioStation();
        int expected = 9;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStation0() {
        stat.setCurrentRadioStation(0);
        stat.prevRadioStation();
        int expected = 9;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStation1() {
        stat.setCurrentRadioStation(1);
        stat.prevRadioStation();
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStation5() {
        stat.setCurrentRadioStation(5);
        stat.prevRadioStation();
        int expected = 4;
        int actual = stat.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void sholdCurrentVolume0() {
        stat.setCurrentVolume(0);
        int expected = 0;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void sholdCurrentVolumeMin1() {
        stat.setCurrentVolume(-1);
        int expected = 0;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentVolume100() {
        stat.setCurrentVolume(100);
        int expected = 100;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentVolume101() {
        stat.setCurrentVolume(101);
        int expected = 0;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume100() {
        stat.setCurrentVolume(100);
        stat.increaseVolume();
        int expected = 100;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume99() {
        stat.setCurrentVolume(99);
        stat.increaseVolume();
        int expected = 100;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume0() {
        stat.setCurrentVolume(0);
        stat.increaseVolume();
        int expected = 1;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMin1() {
        stat.setCurrentVolume(-1);
        stat.increaseVolume();
        int expected = 1;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume0() {
        stat.setCurrentVolume(0);
        stat.decreaseVolume();
        int expected = 0;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume1() {
        stat.setCurrentVolume(1);
        stat.decreaseVolume();
        int expected = 0;
        int actual = stat.getCurrentVolume();
        assertEquals(expected, actual);
    }

}