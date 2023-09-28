/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myeducation.mygrade;

/**
 *
 * @author beyha
 */
public class Grade {
    
    private String name;
    private int math;
    private int sci;
    private int ang;

    public Grade(String name, int math, int sci, int ang) {
        this.name = name;
        this.math = math;
        this.sci = sci;
        this.ang = ang;
    }

    
    
 
    public Grade(String name, int math, int sci) {
        this.name = name;
        this.math = math;
        this.sci = sci;
    }

    public Grade() {
    }

    @Override
    public String toString() {
        return "Grade{" + "name=" + name + ", math=" + math + ", sci=" + sci + ", ang=" + ang + '}';
    }

    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    public int getAng() {
        return ang;
    }

    public void setAng(int ang) {
        this.ang = ang;
    }



public String getGrade(){
    
    int total = this.math + this.ang + this.sci;
    int avg = total / 3;
    
    if (avg <60) {
        return "Fail";
    } else { 
        return "Pass";
    }
    }
}
    
