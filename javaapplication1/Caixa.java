/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Caixa {
 double saldoCaixa = 0.0;
 Cliente clienteDaVez = null;
 public synchronized void atender(Cliente c, int op, double v) {
 while (clienteDaVez != null) { try {
     wait();
     } catch (InterruptedException ex) {
         Logger.getLogger(Caixa.class.getName()).log(Level.SEVERE, null, ex);
     }
} //espera vez
 clienteDaVez = c;
 switch (op) {
 case -1 -> sacar(c, v);
 case 1 -> depositar(c, v);
 }
 }
 private synchronized void sacar(Cliente c, double valor) {
 while (saldoCaixa <= valor) { try {
     wait();
     } catch (InterruptedException ex) {
         Logger.getLogger(Caixa.class.getName()).log(Level.SEVERE, null, ex);
     }
} //espera saldo, vez
 if (valor > 0) {
saldoCaixa -= valor; clienteDaVez = null;
notifyAll();
 }
 }
 private synchronized void depositar(Cliente c, double valor) {
 if (valor > 0 ) {
saldoCaixa += valor; clienteDaVez = null;
notifyAll();
 }
 }
}
