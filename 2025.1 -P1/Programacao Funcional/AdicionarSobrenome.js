const lista = ["M","s","i","f","r","a"]
const Ultimolista = lista [lista.length -1]
const Penultimolista = lista [lista.length -2]
console.log (Ultimolista)
console.log (Penultimolista)

const elementos = lista.length
console.log (elementos)

const nomes = ["Maiara","Pedro","Samara"]
const adicionarsobrenomeigual = sobrenome => nome => `${nome} ${sobrenome}`

console.log (nomes.map(adicionarsobrenomeigual("Santos")))

