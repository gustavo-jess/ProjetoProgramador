package br.unipar.entity;

public class DepartamentoProjeto extends Funcionario{
    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    private String projeto;
}
