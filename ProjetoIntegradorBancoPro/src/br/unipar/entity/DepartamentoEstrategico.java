package br.unipar.entity;

public class DepartamentoEstrategico extends Funcionario{
    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    private String estrategia;
}
