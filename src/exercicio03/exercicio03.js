const faturamentoDiario = require("./dados.json");

faturamentoDiario.forEach((listaFaturamento) => {
   console.log(listaFaturamento);
});


var faturamentoIgualAZero = faturamentoDiario.filter((igualAZero) => igualAZero.valor == 0 );
console.log("Faturamento igual a zero = ", faturamentoIgualAZero);


const menorValorDiferenteZero = faturamentoDiario
  .filter((maiorQueZero) => maiorQueZero.valor !== 0)
  .reduce(function (prev, current) {
    return prev.valor <= current.valor ? prev : current;
   });
console.log("Menor valor faturado maior que zero = ", menorValorDiferenteZero);

console.log()
const maiorValorFaturado = faturamentoDiario
.reduce(function (prev, current) {
    return prev.valor > current.valor ? prev : current; 
  });
  console.log("Maior valor faturado = ",  maiorValorFaturado);


  let mediaFaturamentoMensal = faturamentoDiario
  .filter((maiorQueZero) => maiorQueZero.valor > 0)
  .reduce((total, valor, índice, array) => {
    total.valor += valor.valor;
    if (índice === array.length - 1) {
      return total.valor / array.length;
    } else {
      return total;
    }
  });
console.log("Média Mensal = " + mediaFaturamentoMensal.toFixed(4));

let faturamentoMaiorQueMediaMensal = faturamentoDiario
.filter((maiorQueMediaMensal) => maiorQueMediaMensal.valor > mediaFaturamentoMensal);
console.log("Fatumento maior que a média Mensal = ", faturamentoMaiorQueMediaMensal);