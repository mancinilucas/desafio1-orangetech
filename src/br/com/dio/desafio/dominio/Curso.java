package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private Integer cargaHoraria;

    public Curso(){}


    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + getTitulo() + '\''+
                ", Descricao='" + getDescricao() + '\''+
                ", Carga Horaria=" + cargaHoraria +
                '}';
    }
}
