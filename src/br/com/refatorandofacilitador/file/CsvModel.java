package br.com.refatorandofacilitador.file;

public class CsvModel {
    private String ean;
    private String lote;
    private String validade;
    private String quantidade;
    private String resultado;
    private String inputFile;
    private String outputFile;

    public void setEan(String ean) { this.ean = ean; }
    public String getEan() { return ean; }

    public void setLote(String lote) { this.lote = lote; }
    public String getLote() { return lote; }

    public void setValidade(String validade) { this.validade = validade; }
    public String getValidade() { return validade; }

    public void setQuantidade(String quantidade) { this.quantidade = quantidade; }
    public String getQuantidade() { return quantidade; }

    public void setResultado(String resultado) { this.resultado = resultado; }
    public String getResultado() { return resultado; }

    public void setInputFile(String inputFile) {this.inputFile = inputFile; }
    public String getInputFile() { return inputFile; }

    public void setOutputFile(String outputFile) { this.outputFile = outputFile; }
    public String getOutputFile() { return outputFile; };

    @Override
    public String toString() {
        return getResultado()
                + "," + getLote()
                + "," + getValidade()
                + "," + getQuantidade()
                + "\n";
    }
}