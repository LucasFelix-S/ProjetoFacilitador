package br.com.refatorandofacilitador.file;

public class CsvModel {
    private String ean;
    private String lote;
    private String validade;
    private int quantidade;
    private String resultado;

    public void setEan(String ean) { this.ean = ean; }
    public String getEan() { return ean; }

    public void setLote(String lote) { this.lote = lote; }
    public String getLote() { return lote; }

    public void setValidade(String validade) { this.validade = validade; }
    public String getValidade() { return validade; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public int getQuantidade() { return quantidade; }

    public void setResultado(String resultado) { this.resultado = resultado; }
    public String getResultado() { return resultado; }

    @Override
    public String toString() {
        return getResultado()
                + "," + getLote()
                + "," + getValidade()
                + "," + getQuantidade()
                + "\n";
    }
}