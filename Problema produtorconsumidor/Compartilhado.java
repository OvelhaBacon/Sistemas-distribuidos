/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class Compartilhado {
 private int buffer;
 private int tamanhoBuffer;
 public Compartilhado() {
this(0,5);
}
 public Compartilhado(int buffer, int tamanhoBuffer) {
    setBuffer(buffer);
    setTamanhoBuffer(tamanhoBuffer);
 }
//Gets e sets
 public synchronized void consumir() {
    setBuffer(getBuffer() - 1);
 }
 public synchronized void produzir() {
    setBuffer(getBuffer() + 1);
 }

    private void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    private void setTamanhoBuffer(int tamanhoBuffer) {
        this.tamanhoBuffer = tamanhoBuffer;
    }

    private int getBuffer() {
        return this.tamanhoBuffer;
    }
}