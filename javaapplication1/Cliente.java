/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class Cliente implements Runnable {
 private Compartilhado x;
 private int tempo;
 public Cliente(Compartilhado x) {
 }
 //Gets e sets
 public int getTempo(){
     return this.tempo;
 }
 @Override
public void run() {
 while (true) {
    try {
       Thread.sleep((int) (Math.random() * getTempo()));
    } catch (InterruptedException e) {
    }
    System.out.println("Cliente");
    x.produzir();
 }
 }
 
}

