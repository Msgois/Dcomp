const nomes = (nome) => (sobrenome) => `${sobrenome},${nome}`
const resposta = nomes("Maiara")
console.log (resposta("Gois"))