const numericos = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]
const maiorque = (limite)=> (lista) => lista.filter((x)=> x>limite)
console.log (maiorque(10)(numericos))

const lista = ["Maiara","Samara","Bea","Emilly"]
const letra2 = (letra) => (nome) => nome[1] == letra ? nome : ""
console.log (lista.filter(letra2("a")))

const nomemaiorque = (limite) => (list) => list.filter((x)=> x.length>limite)

console.log (lista[2].length)
