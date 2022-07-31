/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poojava;

/**
 *
 * @author gusta
 */

public class CelularPoo {
    
    String nome,sistemaOperacional;
    int armazenamento;
    double tela;
    
    public CelularPoo(){
        
    
    }
    public CelularPoo(String n, int a, double t){
        this.nome = n;
        this.armazenamento = a;
        this.tela = t;
        
        
    }
    
    public void setNome(String x){

        nome = x; 

    } 
    public void setSistemaOperacional(String y){

        sistemaOperacional = y; 

    } 

    public void setArmazenamento(int a){ 

        

        if (a > 0){ 

        armazenamento = a; 

    }
        
    }
    
    public void setTela(double t){
        
        if (t > 0){
            
            tela = t;
        
        }
    
    
    
    }
    
    public String getNome(){ 

         

        return nome; 

    } 
    public String getSistemaOperacional(){ 

         

        return sistemaOperacional; 
    
    }
    public int getArmazenamento(){
        
        return armazenamento;
    }
    public double getTela(){
        
        return tela;
    }
   
}
   
    

