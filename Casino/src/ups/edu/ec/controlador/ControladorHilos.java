package ups.edu.ec.controlador;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import ups.edu.ec.modelo.*;

public class ControladorHilos extends Thread implements Runnable {

    Thread hilo = new Thread(this);

    String juego;

    JTextField jtf1;
    JTextField jtf2;
    JTextField jtf3;
    JTextField jtf4;
    JTextField jtf5;
    JTextArea jtA1;

    Cliente c1;
    Cliente c2;
    Cliente c3;
    Cliente c4;
    Cliente crupier;

    int numero;
    int tiempo;
    int apuesta1 = 10;
    int apuesta2 = 10;
    int apuesta3 = 10;
    int apuesta4 = 10;

    ControladorJuegos controladorJuegos;
    ControladorCliente controladorCliente;

    public ControladorHilos(Cliente c1, Cliente c2, Cliente c3, Cliente c4, JTextArea jta, JTextField jtf1,
            JTextField jtf2, JTextField jtf3, JTextField jtf4, String juego, Cliente crupier, JTextField jtf5,
            ControladorJuegos controladorJuegos, ControladorCliente controladorCliente, int tiempo) {

        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.crupier = crupier;

        jtA1 = jta;

        this.jtf1 = jtf1;
        this.jtf2 = jtf2;
        this.jtf3 = jtf3;
        this.jtf4 = jtf4;
        this.jtf5 = jtf5;

        this.tiempo = tiempo;

        this.juego = juego;

        this.controladorJuegos = controladorJuegos;
        this.controladorCliente = controladorCliente;

    }

    public ControladorHilos() {
    }

    volatile boolean i = true;

    public void parar() {
        i = false;
    }

    @Override
    public void run() {

        while (i == true) {

            jtA1.append("Esperando a..." + c1.getNombre() + "\n");

            int numero1 = (int) (Math.random() * 37 + 1);
            jtA1.append(c1.getNombre() + " Saco--->" + numero1 + "\n");
            jtf1.setText(numero1 + "");

            jtA1.append("Esperando a..." + c2.getNombre() + "\n");

            int numero2 = (int) (Math.random() * 37 + 1);
            jtA1.append(c2.getNombre() + " Saco--->" + numero2 + "\n");
            jtf2.setText(numero2 + "");

            jtA1.append("Esperando a..." + c3.getNombre() + "\n");

            int numero3 = (int) (Math.random() * 37 + 1);
            jtA1.append(c3.getNombre() + " Saco--->" + numero3 + "\n");
            jtf3.setText(numero3 + "");

            jtA1.append("Esperando a..." + c4.getNombre() + "\n");

            int numero4 = (int) (Math.random() * 37 + 1);
            jtA1.append(c4.getNombre() + " Saco--->" + numero4 + "\n");
            jtf4.setText(numero4 + "");
            jtA1.append("Esperando a crupier...\n");
            try {
                hilo.sleep(tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControladorHilos.class.getName()).log(Level.SEVERE, null, ex);
            }
            numero = (int) (Math.random() * 37 + 1);
            jtA1.append(crupier.getNombre() + " Saco--->" + numero + "\n");

            if (numero == 0) {
                crupier.setDinero(crupier.getDinero() + 40);
            } else {

                if (juego.equalsIgnoreCase("1")) {

                    if (c1.getDinero() < 10) {
                        jtA1.append(c1.getNombre() + " no tiene dinero \n");

                    } else {
                        if (numero1 == numero) {

                            List<Juegos> ju = c1.getListajuegos();
                            Juegos j = new Juegos();
                            j.setCliente(c1);
                            j.setNombreJuego("Numero concreto");
                            j.setNumeroGanador(numero + "");
                            ju.add(j);
                            controladorJuegos.crear(j);

                            jtA1.append(c1.getNombre() + " Gano \n");
                            c1.setDinero(c1.getDinero() + 360);
                            c1.setListajuegos(ju);
                            controladorCliente.actualizar(c1);

                            crupier.setDinero(crupier.getDinero() - 10);
                            controladorCliente.actualizar(crupier);

                        } else {
                            c1.setDinero(c1.getDinero() - 10);
                            controladorCliente.actualizar(c1);
                            crupier.setDinero(crupier.getDinero() + 10);
                            controladorCliente.actualizar(crupier);
                            Juegos jue = new Juegos();
                            jue.setCliente(null);
                            jue.setNombreJuego("Numero concreto");
                            jue.setNumeroGanador(numero + "");
                            controladorJuegos.crear(jue);
                        }

                    }

                    if (c2.getDinero() < 10) {
                        jtA1.append(c2.getNombre() + " no tiene dinero \n");
                    } else {
                        if (numero2 == numero) {
                            List<Juegos> ju = c2.getListajuegos();
                            Juegos j = new Juegos();
                            j.setCliente(c2);
                            j.setNombreJuego("Numero concreto");
                            j.setNumeroGanador(juego);
                            ju.add(j);

                            jtA1.append(c2.getNombre() + " Gano \n");
                            c2.setDinero(c2.getDinero() + 360);
                            controladorCliente.actualizar(c2);

                        } else {
                            c2.setDinero(c2.getDinero() - 10);
                            controladorCliente.actualizar(c2);
                            crupier.setDinero(crupier.getDinero() + 10);
                            controladorCliente.actualizar(crupier);
                            Juegos jue = new Juegos();
                            jue.setCliente(null);
                            jue.setNombreJuego("Numero concreto");
                            jue.setNumeroGanador(numero + "");
                            controladorJuegos.crear(jue);
                        }
                    }

                    if (c3.getDinero() < 10) {
                        jtA1.append(c3.getNombre() + " no tiene dinero \n");
                    } else {
                        if (numero3 == numero) {
                            List<Juegos> ju = c3.getListajuegos();
                            Juegos j = new Juegos();
                            j.setCliente(c3);
                            j.setNombreJuego("Numero concreto");
                            j.setNumeroGanador(juego);
                            ju.add(j);

                            jtA1.append(c3.getNombre() + " Gano \n");
                            c3.setDinero(c3.getDinero() + 360);
                            controladorCliente.actualizar(c3);
                        } else {
                            c3.setDinero(c3.getDinero() - 10);
                            controladorCliente.actualizar(c3);
                            crupier.setDinero(crupier.getDinero() + 10);
                            controladorCliente.actualizar(crupier);
                            Juegos jue = new Juegos();
                            jue.setCliente(null);
                            jue.setNombreJuego("Numero concreto");
                            jue.setNumeroGanador(numero + "");
                            controladorJuegos.crear(jue);
                        }
                    }

                    if (c4.getDinero() < 10) {
                        jtA1.append(c4.getNombre() + " no tiene dinero \n");
                    } else {
                        if (numero4 == numero) {
                            List<Juegos> ju = c4.getListajuegos();
                            Juegos j = new Juegos();
                            j.setCliente(c4);
                            j.setNombreJuego("Numero concreto");
                            j.setNumeroGanador(juego);
                            ju.add(j);

                            jtA1.append(c4.getNombre() + " Gano \n");
                            c4.setDinero(c4.getDinero() + 360);
                            controladorCliente.actualizar(c4);
                        } else {
                            c4.setDinero(c4.getDinero() - 10);
                            controladorCliente.actualizar(c4);
                            crupier.setDinero(crupier.getDinero() + 10);
                            controladorCliente.actualizar(crupier);
                            Juegos jue = new Juegos();
                            jue.setCliente(null);
                            jue.setNombreJuego("Numero concreto");
                            jue.setNumeroGanador(numero + "");
                            controladorJuegos.crear(jue);
                        }
                    }

                }
                if (juego.equalsIgnoreCase("2")) {

                    if (c1.getDinero() < 10) {
                        jtA1.append(c1.getNombre() + " no tiene dinero \n");
                    } else {
                        if (numero1 % 2 == 0 && numero % 2 == 0 || numero1 % 2 != 0 && numero % 2 != 0) {
                            List<Juegos> ju = c1.getListajuegos();
                            Juegos j = new Juegos();
                            j.setCliente(c1);
                            j.setNombreJuego("Par impar");
                            j.setNumeroGanador(numero + "");
                            ju.add(j);
                            controladorJuegos.crear(j);

                            jtA1.append(c1.getNombre() + " Gano \n");
                            c1.setDinero(c1.getDinero() + 20);
                            c1.setListajuegos(ju);
                            controladorCliente.actualizar(c1);

                            crupier.setDinero(crupier.getDinero() - 10);
                            controladorCliente.actualizar(crupier);

                        } else {
                            c1.setDinero(c1.getDinero() - 10);
                            controladorCliente.actualizar(c1);
                            crupier.setDinero(crupier.getDinero() + 10);
                            controladorCliente.actualizar(crupier);
                            Juegos jue = new Juegos();
                            jue.setCliente(null);
                            jue.setNombreJuego("Par impar");
                            jue.setNumeroGanador(numero + "");
                            controladorJuegos.crear(jue);
                        }
                    }

                    if (c2.getDinero() < 10) {
                        jtA1.append(c2.getNombre() + " no tiene dinero \n");
                    } else {
                        if (numero2 % 2 == 0 && numero % 2 == 0 || numero2 % 2 != 0 && numero % 2 != 0) {
                            List<Juegos> ju = c2.getListajuegos();
                            Juegos j = new Juegos();
                            j.setCliente(c2);
                            j.setNombreJuego("Par impar");
                            j.setNumeroGanador(juego);
                            ju.add(j);

                            jtA1.append(c2.getNombre() + " Gano \n");
                            c2.setDinero(c2.getDinero() + 20);
                            controladorCliente.actualizar(c2);

                        } else {
                            c2.setDinero(c2.getDinero() - 10);
                            controladorCliente.actualizar(c2);
                            crupier.setDinero(crupier.getDinero() + 10);
                            controladorCliente.actualizar(crupier);
                            Juegos jue = new Juegos();
                            jue.setCliente(null);
                            jue.setNombreJuego("Par impar");
                            jue.setNumeroGanador(numero + "");
                            controladorJuegos.crear(jue);
                        }
                    }
                    if (c3.getDinero() < 10) {
                        jtA1.append(c3.getNombre() + " no tiene dinero \n");
                    } else {
                        if (numero3 % 2 == 0 && numero % 2 == 0 || numero3 % 2 != 0 && numero % 2 != 0) {
                            List<Juegos> ju = c3.getListajuegos();
                            Juegos j = new Juegos();
                            j.setCliente(c3);
                            j.setNombreJuego("Par impar");
                            j.setNumeroGanador(juego);
                            ju.add(j);

                            jtA1.append(c3.getNombre() + " Gano \n");
                            c3.setDinero(c3.getDinero() + 20);
                            controladorCliente.actualizar(c3);
                        } else {
                            c3.setDinero(c3.getDinero() - 10);
                            controladorCliente.actualizar(c3);
                            crupier.setDinero(crupier.getDinero() + 10);
                            controladorCliente.actualizar(crupier);
                            Juegos jue = new Juegos();
                            jue.setCliente(null);
                            jue.setNombreJuego("Par impar");
                            jue.setNumeroGanador(numero + "");
                            controladorJuegos.crear(jue);
                        }
                    }
                    if (c4.getDinero() < 10) {
                        jtA1.append(c4.getNombre() + " no tiene dinero \n");
                    } else {
                        if (numero4 % 2 == 0 && numero % 2 == 0 || numero4 % 2 != 0 && numero % 2 != 0) {
                            List<Juegos> ju = c4.getListajuegos();
                            Juegos j = new Juegos();
                            j.setCliente(c4);
                            j.setNombreJuego("Par impar");
                            j.setNumeroGanador(juego);
                            ju.add(j);

                            jtA1.append(c4.getNombre() + " Gano \n");
                            c4.setDinero(c4.getDinero() + 20);
                            controladorCliente.actualizar(c4);
                        } else {
                            c4.setDinero(c4.getDinero() - 10);
                            controladorCliente.actualizar(c4);
                            crupier.setDinero(crupier.getDinero() + 10);
                            controladorCliente.actualizar(crupier);
                            Juegos jue = new Juegos();
                            jue.setCliente(null);
                            jue.setNombreJuego("Par impar");
                            jue.setNumeroGanador(numero + "");
                            controladorJuegos.crear(jue);
                        }
                    }

                }

                if (juego.equalsIgnoreCase("3")) {

                    if (c1.getDinero() < apuesta1) {
                        jtA1.append(c1.getNombre() + " no tiene dinero \n");
                    } else {
                        if (numero1 == numero) {
                            List<Juegos> ju = c1.getListajuegos();
                            Juegos j = new Juegos();
                            j.setCliente(c1);
                            j.setNombreJuego("Martingala");
                            j.setNumeroGanador(numero + "");
                            ju.add(j);
                            controladorJuegos.crear(j);

                            jtA1.append(c1.getNombre() + " Gano \n");
                            c1.setDinero(c1.getDinero() + 360);
                            c1.setListajuegos(ju);
                            controladorCliente.actualizar(c1);

                            crupier.setDinero(crupier.getDinero() - apuesta1);
                            apuesta1 = apuesta1 * 2;
                            controladorCliente.actualizar(crupier);

                        } else {
                            c2.setDinero(c1.getDinero() - 10);
                            controladorCliente.actualizar(c1);
                            crupier.setDinero(crupier.getDinero() + 10);
                            controladorCliente.actualizar(crupier);
                            Juegos jue = new Juegos();
                            jue.setCliente(null);
                            jue.setNombreJuego("Martingala");
                            jue.setNumeroGanador(numero + "");
                            controladorJuegos.crear(jue);
                        }
                    }
                    if (c2.getDinero() < apuesta2) {
                        jtA1.append(c2.getNombre() + " no tiene dinero \n");
                    } else {
                        if (numero2 == numero) {
                            List<Juegos> ju = c2.getListajuegos();
                            Juegos j = new Juegos();
                            j.setCliente(c2);
                            j.setNombreJuego("Martingala");
                            j.setNumeroGanador(juego);
                            ju.add(j);

                            jtA1.append(c2.getNombre() + " Gano \n");
                            c2.setDinero(c2.getDinero() + 360);
                            controladorCliente.actualizar(c2);

                        } else {
                            c2.setDinero(c2.getDinero() - apuesta2);
                            apuesta2 = apuesta2 * 2;
                            controladorCliente.actualizar(c2);
                            crupier.setDinero(crupier.getDinero() + 10);
                            controladorCliente.actualizar(crupier);
                            Juegos jue = new Juegos();
                            jue.setCliente(null);
                            jue.setNombreJuego("Martingala");
                            jue.setNumeroGanador(numero + "");
                            controladorJuegos.crear(jue);
                        }
                    }
                    if (c3.getDinero() < apuesta3) {
                        jtA1.append(c3.getNombre() + " no tiene dinero \n");
                    } else {
                        if (numero3 == numero) {
                            List<Juegos> ju = c3.getListajuegos();
                            Juegos j = new Juegos();
                            j.setCliente(c3);
                            j.setNombreJuego("Martingala");
                            j.setNumeroGanador(juego);
                            ju.add(j);

                            jtA1.append(c3.getNombre() + " Gano \n");
                            c3.setDinero(c3.getDinero() + 360);
                            controladorCliente.actualizar(c3);
                        } else {
                            c3.setDinero(c3.getDinero() - 10);
                            controladorCliente.actualizar(c3);
                            crupier.setDinero(crupier.getDinero() + apuesta3);
                            apuesta3 = apuesta3 * 10;
                            controladorCliente.actualizar(crupier);
                            Juegos jue = new Juegos();
                            jue.setCliente(null);
                            jue.setNombreJuego("Martingala");
                            jue.setNumeroGanador(numero + "");
                            controladorJuegos.crear(jue);
                        }
                    }
                    if (c4.getDinero() < apuesta4) {
                        jtA1.append(c4.getNombre() + " no tiene dinero \n");
                    } else {
                        if (numero4 == numero) {
                            List<Juegos> ju = c4.getListajuegos();
                            Juegos j = new Juegos();
                            j.setCliente(c4);
                            j.setNombreJuego("Martingala");
                            j.setNumeroGanador(juego);
                            ju.add(j);

                            jtA1.append(c4.getNombre() + " Gano \n");
                            c4.setDinero(c4.getDinero() + 360);
                            controladorCliente.actualizar(c4);
                        } else {
                            c4.setDinero(c4.getDinero() - apuesta4);
                            apuesta4 = apuesta4 * 2;
                            controladorCliente.actualizar(c4);
                            crupier.setDinero(crupier.getDinero() + 10);
                            controladorCliente.actualizar(crupier);
                            Juegos jue = new Juegos();
                            jue.setCliente(null);
                            jue.setNombreJuego("Martingala");
                            jue.setNumeroGanador(numero + "");
                            controladorJuegos.crear(jue);
                        }
                    }

                }
            }

        }

    }

}
