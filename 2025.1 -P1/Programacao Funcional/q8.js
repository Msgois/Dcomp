const quadrado = (a) => a**2
const quarta = (b) => quadrado(quadrado(b))
const resposta = quarta(1)
const resultado = resposta
console.log (resultado)