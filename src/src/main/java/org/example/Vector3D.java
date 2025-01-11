package org.example;

public class Vector3D {
    double x;
    double y;
    double z;

    Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getZ() {
        return z;
    }

    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

    double getMagnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    Vector3D normalize() {
        double mag = this.getMagnitude();
        if (mag == 0) {
            throw new IllegalStateException("Vector magnitude must be >0");
        } else {
            return new Vector3D(x / mag, y / mag, z / mag);
        }
    }
}
