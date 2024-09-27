package com.mycompany.heroe1;

import java.util.Scanner;

public class Principal1 {

    public static void main(String[] args) {
        char tecla;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de tu heroe:" );
        String nombreHeroe = sc.next();

        Heroe heroeElegido = new Heroe(nombreHeroe);

        System.out.println("Hola mi nombre es " + heroeElegido.getNombre());
        System.out.println("Usa d para moverte y w para saltar");

        do {

            if (heroeElegido.getPosicion() % 10 == 0) {
                System.out.println("Hay un enemigo en el camino");
                tecla = sc.next().charAt(0);
                switch (tecla) {
                    case 'd':
                        heroeElegido.setPosicion();
                        heroeElegido.setVidas();
                        System.out.println("Has tomado una mala decisión");
                        System.out.println("Ha " + heroeElegido.getNombre() + " le quedan " + heroeElegido.getVidas() + " vidas");
                        break;
                    case 'w':
                        heroeElegido.setSaltando();
                        System.out.println("Has superado al enemigo.");
                        break;
                    default:
                        throw new AssertionError();
                }

            } else {
                tecla = sc.next().charAt(0);

                switch (tecla) {
                    case 'd':
                        heroeElegido.setPosicion();
                        break;
                    case 'w':
                        heroeElegido.setSaltando();
                        break;
                    default:
                        throw new AssertionError();
                }
            }

        } while (heroeElegido.getVidas() > 0);

        System.out.println("Game Over");

    }
}
