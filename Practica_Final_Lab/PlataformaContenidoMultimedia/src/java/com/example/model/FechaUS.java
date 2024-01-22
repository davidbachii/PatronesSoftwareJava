/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

/**
 *
 * @author david
 */

public class FechaUS {

    /**
     * Entero que representa el año.
     */
    private int year;
    /**
     * Entero que representa el mes.
     */
    private int month;
    /**
     * Entero que representa el día.
     */
    private int day;

    /**
     * Constructor
     *
     * @param month Entero que representa el mes.
     * @param day Entero que representa el día.
     * @param year Entero que representa el año.
     */
    public FechaUS(int month, int day, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Constructor
     *
     * @param date Fecha en formato de USA:. AAAA-MM-DD
     *
     */
    public FechaUS(String date) {
        String[] st = date.split("-");
        String aa = st[0];
        String mm = st[1];
        String dd = st[2];

        this.day = Integer.parseInt(dd);
        this.month = Integer.parseInt(mm);
        this.year = Integer.parseInt(aa);
    }

    /**
     * Devuelve una cadena con la fecha en formato de USA: AAAA-MM-DD.
     *
     * @return Fecha en formato de USA: AAAA-MM-DD.
     */
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    /**
     * Devuelve el año.
     *
     * @return Entero que representa el año.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Establece el año.
     *
     * @param year Entero que representa el año.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Devuelve el día.
     *
     * @return Entero que representa el día.
     */
    public int getDay() {
        return this.day;
    }

    /**
     * Establece el día.
     *
     * @param day Entero que representa el día.
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Devuelve el mes.
     *
     * @return Entero que representa el mes.
     */
    public int getMonth() {
        return this.month;
    }

    /**
     * Establece el mes.
     *
     * @param month Entero que representa el mes.
     */
    public void setMonth(int month) {
        this.month = month;
    }
}
