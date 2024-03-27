/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;


public class Produto {
    private int peso;
    private String nome;
    private int preco;
    
    public Produto(int peso, String nome, int preco){
        this.peso = peso;
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(){
        
    }
    
    public int getPeso(){
        return this.peso;
    }
    public String getNome(){
        return this.nome;
    }
    public int getPreco(){
        return this.preco;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(int preco){
        this.preco = preco;
    }
    
}
