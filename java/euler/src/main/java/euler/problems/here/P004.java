package euler.problems.here;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import euler.problems.Dinheiro;
import euler.problems.Problem;

public class P004 implements Problem {

	@Override
	public String solve(List<String> input) {
		List<String> saida = new ArrayList<>();

		input.stream().map(BigDecimal::new).forEach(n -> {
			Map<Dinheiro, BigInteger> dindins = getQuantidadeDinheiros(n);
			String linha = dindins /**/
					.entrySet() /**/
					.stream() /**/
					.map(e -> e.getValue() + "=" + String.format(Locale.US, "%.2f", e.getKey().getValor())) /**/
					.collect(Collectors.joining(","));
			saida.add(linha);
		});

		return String.join("\r\n", saida);
	}

	private Map<Dinheiro, BigInteger> getQuantidadeDinheiros(BigDecimal valor) {
		Map<Dinheiro, BigInteger> mapa = new EnumMap<>(Dinheiro.class);

		for (Dinheiro dindin : Dinheiro.values()) {
			BigDecimal div = valor.divide(BigDecimal.valueOf(dindin.getValor()));
			if (div.compareTo(BigDecimal.ONE) >= 0) { // se div >= 1
				mapa.put(dindin, div.toBigInteger());
				valor = valor.remainder(BigDecimal.valueOf(dindin.getValor()));
			}
			if (valor.equals(BigDecimal.ZERO)) {
				break;
			}
		}

		return mapa;
	}

}
