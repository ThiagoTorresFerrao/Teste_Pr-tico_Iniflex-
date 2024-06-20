import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        List<Funcionário> funcionários = new ArrayList<>();

        // 3.1 Inserir todos os funcionários
        funcionários.add(new Funcionário("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        funcionários.add(new Funcionário("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        funcionários.add(new Funcionário("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        funcionários.add(new Funcionário("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        funcionários.add(new Funcionário("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        funcionários.add(new Funcionário("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        funcionários.add(new Funcionário("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        funcionários.add(new Funcionário("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        funcionários.add(new Funcionário("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        funcionários.add(new Funcionário("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

        // 3.2 Remover o funcionário “João” da lista
        funcionários.removeIf(f -> f.getNome().equals("João"));

        // 3.3 Imprimir todos os funcionários
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (Funcionário f : funcionários) {
            System.out.println(f.getNome() + ", " + f.getDataNascimento().format(formatter) + ", " +
                    String.format("%,.2f", f.getSalário()) + ", " + f.getFunção());
        }

        // 3.4 Atualizar salários com 10% de aumento
        for (Funcionário f : funcionários) {
            BigDecimal novoSalário = f.getSalário().multiply(BigDecimal.valueOf(1.1));
            f.setSalário(novoSalário);
        }

        // 3.5 Agrupar funcionários por função
        Map<String, List<Funcionário>> funcionáriosPorFunção = funcionários.stream().collect(Collectors.groupingBy(Funcionário::getFunção));

        // 3.6 Imprimir os funcionários, agrupados por função
        for (String função : funcionáriosPorFunção.keySet()) {
            System.out.println("Função: " + função);
            for (Funcionário f : funcionáriosPorFunção.get(função)) {
                System.out.println("\t" + f.getNome() + ", " + f.getDataNascimento().format(formatter) + ", " +
                        String.format("%,.2f", f.getSalário()) + ", " + f.getFunção());
            }
        }

        // 3.8 Imprimir funcionários que fazem aniversário no mês 10 e 12
        System.out.println("Funcionários que fazem aniversário em outubro e dezembro:");
        for (Funcionário f : funcionários) {
            int month = f.getDataNascimento().getMonthValue();
            if (month == 10 || month == 12) {
                System.out.println(f.getNome() + ", " + f.getDataNascimento().format(formatter));
            }
        }

        // 3.9 Imprimir o funcionário com a maior idade
        Funcionário maisVelho = Collections.max(funcionários, Comparator.comparing(Funcionário::getDataNascimento).reversed());
        System.out.println("Funcionário com a maior idade: " + maisVelho.getNome() + ", " +
                (LocalDate.now().getYear() - maisVelho.getDataNascimento().getYear()) + " anos");

        // 3.10 Imprimir a lista de funcionários por ordem alfabética
        List<Funcionário> funcionáriosOrdenados = new ArrayList<>(funcionários);
        funcionáriosOrdenados.sort(Comparator.comparing(Funcionário::getNome));
        System.out.println("Funcionários em ordem alfabética:");
        for (Funcionário f : funcionáriosOrdenados) {
            System.out.println(f.getNome());
        }

        // 3.11 Imprimir o total dos salários dos funcionários
        BigDecimal totalSalários = funcionários.stream().map(Funcionário::getSalário).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total dos salários: " + String.format("%,.2f", totalSalários));

        // 3.12 Imprimir quantos salários mínimos ganha cada funcionário
        BigDecimal salárioMínimo = new BigDecimal("1212.00");
        System.out.println("Salários mínimos por funcionário:");
        for (Funcionário f : funcionários) {
            BigDecimal múltiplosSalárioMínimo = f.getSalário().divide(salárioMínimo, 2, BigDecimal.ROUND_HALF_UP);
            System.out.println(f.getNome() + ": " + múltiplosSalárioMínimo + " salários mínimos");
        }
    }
}
