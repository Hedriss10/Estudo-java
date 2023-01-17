package Estudo;

import java.io.Serializable;

public class Pessoa implements Serializable {

    /*
    Getter e setter da class pessoa
     */
    private String nome;

    public String getNome(){
        return nome;
    }

    ///Set

    public void setNome(String nome){
        this.nome = nome;
    }

}
