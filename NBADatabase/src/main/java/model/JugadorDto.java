package model;

public class JugadorDto {
    private String nombreCompleto;
    private String nombreEquipo;
    private String posicion;
    private String altura;
    private String peso;
    private String numero;
    private String fechaDraft;
    private String procedencia;


    public JugadorDto(String nombreCompleto, String nombreEquipo, String posicion, String altura, String peso, String numero, String fechaDraft, String procedencia) {
        this.nombreCompleto = nombreCompleto;
        this.nombreEquipo = nombreEquipo;
        this.posicion = posicion;
        this.altura = altura;
        this.peso = peso;
        this.numero = numero;
        this.fechaDraft = fechaDraft;
        this.procedencia = procedencia;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaDraft() {
        return fechaDraft;
    }

    public void setFechaDraft(String fechaDraft) {
        this.fechaDraft = fechaDraft;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
}