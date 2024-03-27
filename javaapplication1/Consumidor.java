/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class Consumidor implements Runnable {
 private Compartilhado x;
 private int tempo;
 public Consumidor(Compartilhado x) {
     this.x = x;
 }
 //Gets e sets
 public int getTempo(){
    return this.tempo;
 }
  public void setTempo(int tempo){
    this.tempo = tempo;
 }
public void run() {
 while (true) {
    try {
       Thread.sleep((int) (Math.random() * getTempo()));
    } catch (InterruptedException e) {
    }
    System.out.println("Consumidor");
    x.produzir();
 }
 }
 
}

