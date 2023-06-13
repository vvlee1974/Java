package ru.geekbrains.lesson2.ClassWork.Ex205;

import javax.print.attribute.standard.PresentationDirection;

import static java.lang.Math.sqrt;

public class Vector {
    public double x;
    public double y;
    public double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return длина вектора
     */
    public double vectorLength() {
        return sqrt(x * x + y * y + z * z);
    }


    /**
     * @param vector2 с которым происходит взаимодействие
     * @return скалярное произведение
     */
    public double scalarMulti(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    /**
     * @param vector2 с которым происходит взаимодействие
     * @return векторное произведение
     */
    public Vector vectorMulti(Vector vector2) {
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x
        );

    }


    /**
     * @param vector2 с которым происходит взаимодействие
     * @return угол между векторами (косинус угла)
     */
    public double vectorCos(Vector vector2) {
        return this.scalarMulti(vector2) / (this.vectorLength() * vector2.vectorLength());
    }
}
