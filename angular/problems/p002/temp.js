var anoDescobrimentoBrasil = 1500;
var mensagem = "Seja bem vindo";
var anoCopa = true;
var listaFrutas = ['Uva', 'Maçã'];
var diasSemana;
(function (diasSemana) {
    diasSemana[diasSemana["Domingo"] = 0] = "Domingo";
    diasSemana[diasSemana["Segunda"] = 1] = "Segunda";
})(diasSemana || (diasSemana = {}));
;
console.log(anoDescobrimentoBrasil);
console.log(anoCopa);
console.log(mensagem);
console.log(listaFrutas);
console.log(diasSemana);
