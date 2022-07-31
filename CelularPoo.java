package com.mycompany.poojava;



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
   
    

