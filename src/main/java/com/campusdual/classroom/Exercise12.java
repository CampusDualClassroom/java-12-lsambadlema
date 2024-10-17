package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        // Crear un objeto Car
        Car myCar = new Car("Citroen", "Xsara", "Diésel");

        // Prueba 1: Verificar el estado inicial del tacómetro
        System.out.println("Tacómetro inicial: " + myCar.tachometer); // Debería ser 0

        // Prueba 2: Encender el coche
        myCar.start(); // Debería encender el coche
        System.out.println("Tacómetro tras encender: " + myCar.tachometer); // Debería ser 1000

        // Prueba 3: Intentar encender el coche nuevamente
        myCar.start(); // No debería encender nuevamente

        // Prueba 4: Acelerar el coche
        myCar.accelerate(); // Debería aumentar la velocidad
        System.out.println("Velocidad tras acelerar: " + myCar.speedometer);

        // Prueba 5: Frenar el coche
        myCar.brake(); // Debería reducir la velocidad
        System.out.println("Velocidad tras frenar: " + myCar.speedometer);

        // Prueba 6: Girar las ruedas
        myCar.turnAngleOfWheels(20); // Debería permitir girar 20 grados
        System.out.println("Ángulo de las ruedas: " + myCar.wheelsAngle); // Debería ser 20

        // Prueba 7: Intentar girar las ruedas más de 45 grados
        myCar.turnAngleOfWheels(50); // Debería limitar el ángulo a 45
        System.out.println("Ángulo de las ruedas: " + myCar.wheelsAngle); // Debería ser 45

        // Prueba 8: Poner marcha atrás
        myCar.setReverse(true); // Debería activar marcha atrás

        // Prueba 9: Intentar apagar el coche mientras está en movimiento
        myCar.stop(); // No debería poder apagarse mientras se mueve

        // Prueba 10: Acelerar y luego detener el coche
        myCar.accelerate(); // Acelera una vez más
        myCar.stop(); // Ahora debería poder apagarse
        System.out.println("Tacómetro tras detener: " + myCar.tachometer); // Debería ser 0

        // Detalles del coche
        myCar.showDetails(); // Mostrar detalles finales
    }
}
