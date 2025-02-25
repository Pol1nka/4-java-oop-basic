package com.example.task01;

import java.rmi.MarshalException;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip(){
        int temp=this.x;
        this.x=-y;
        this.y=-temp;
    }

    public double distance (Point point){
        return  Math.sqrt(Math.pow((y - point.y),2) +  Math.pow((x - point.x), 2));
    }

    public String toString(){
        return "("+x+";"+y+")";
    }
}
