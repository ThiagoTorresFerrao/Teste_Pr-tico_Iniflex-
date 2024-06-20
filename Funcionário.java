import java.math.BigDecimal;

public class Funcionário extends Pessoa {
    private BigDecimal salário;
    private String função;

    public Funcionário(String nome, LocalDate dataNascimento, BigDecimal salário, String função) {
        super(nome, dataNascimento);
        this.salário = salário;
        this.função = função;
    }

    public BigDecimal getSalário() {
        return salário;
    }

    public void setSalário(BigDecimal salário) {
        this.salário = salário;
    }

    public String getFunção() {
        return função;
    }
}
