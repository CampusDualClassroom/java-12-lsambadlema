package com.campusdual.classroom;

public class Car {
    private String brand;                 // Marca del coche
    private String model;                 // Modelo del coche
    private String fuel;                  // Tipo de combustible
    public int speedometer = 0;           // Velocidad actual
    public int tachometer = 0;            // Tacómetro (RPM)
    public int wheelsAngle = 0;           // Ángulo de las ruedas
    public String gear = "N";             // Marcha (por defecto Neutral)
    private boolean reverse = false;      // Estado de marcha atrás

    public static final int MAX_SPEED = 120; // Velocidad máxima
    public static final int MAX_ANGLE = 45;   // Ángulo máximo de giro

    // Constructor de la clase
    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    // Constructor vacío para la prueba
    public Car() {
        // Inicializa valores por defecto si se requiere en la prueba
    }

    // Método para verificar si el tacómetro es mayor que cero
    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    // Método para verificar si el tacómetro es cero
    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    // Método para encender el coche
    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000; // Valor correcto para encender el coche
            System.out.println("Vehículo encendido.");
        } else {
            System.out.println("El vehículo ya está encendido.");
        }
    }

    // Método para apagar el coche
    public void stop() {
        if (this.speedometer > 0) {
            System.out.println("No puedes apagar el vehículo mientras está en movimiento.");
        } else {
            this.tachometer = 0; // Apagar el coche
            System.out.println("Vehículo apagado.");
        }
    }

    // Método para acelerar el coche
    public void accelerate() {
        if (this.speedometer < MAX_SPEED) {
            this.speedometer += 10; // Aumentar la velocidad en 10 km/h
            if (this.speedometer > MAX_SPEED) {
                this.speedometer = MAX_SPEED; // Asegurarse de no superar la velocidad máxima
            }
            System.out.println("Velocidad actual: " + this.speedometer + " km/h.");
        }
    }

    // Método para frenar el coche
    public void brake() {
        if (this.speedometer - 10 < 0) {
            this.speedometer = 0; // No permitir velocidad negativa
        } else {
            this.speedometer -= 10; // Disminuir la velocidad en 10 km/h
        }
        System.out.println("Velocidad actual: " + this.speedometer + " km/h.");
    }

    // Método para girar el volante (ángulo de las ruedas)
    public void turnAngleOfWheels(int angle) {
        int newAngle = this.wheelsAngle + angle;
        if (newAngle > MAX_ANGLE) {
            this.wheelsAngle = MAX_ANGLE;
            System.out.println("No puedes girar más de " + MAX_ANGLE + " grados.");
        } else if (newAngle < -MAX_ANGLE) {
            this.wheelsAngle = -MAX_ANGLE;
            System.out.println("No puedes girar menos de " + -MAX_ANGLE + " grados.");
        } else {
            this.wheelsAngle = newAngle;
            System.out.println("Ángulo de las ruedas: " + this.wheelsAngle + " grados.");
        }
    }

    // Método para poner marcha atrás
    public void setReverse(boolean reverse) {
        if (reverse && this.speedometer > 0) {
            System.out.println("No puedes poner marcha atrás mientras el coche está en movimiento.");
        } else {
            this.reverse = reverse;
            this.gear = reverse ? "R" : "N"; // Cambiar la marcha
            System.out.println(reverse ? "Marcha atrás activada." : "Marcha atrás desactivada.");
        }
    }

    // Método para mostrar detalles del coche
    public void showDetails() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Combustible: " + this.fuel);
        System.out.println("Velocidad: " + this.speedometer + " km/h");
        System.out.println("Tacómetro: " + this.tachometer + " RPM");
        System.out.println("Ángulo de las ruedas: " + this.wheelsAngle + " grados");
        System.out.println("Marcha: " + this.gear);
    }
}
