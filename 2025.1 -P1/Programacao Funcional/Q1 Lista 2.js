
function Aret(A1,A2) {
    A1=5                 
    A2=4
    return A1*A2
}
const resultado = `A área do retângulo é: ${Aret()}`
console.log (resultado)

// OU PODERIA SER:
//OBS: AS DUAS FUNÇÕES SÃO PURAS

function Aretan(A3,A4){
    return A3*A4
}
const resultadp = `A área do retângulo é: ${Aretan(5,4)}`
console.log (resultadp)
