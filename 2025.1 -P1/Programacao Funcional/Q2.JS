
const qtd= (a,b,c) =>{
    if (a===b && b===c){
        return "3"}
else if (a===b || b===c || c===a){
    return "2"}
    else{
        return "0"
    }
}
const teste = (qtd(3,2,1))
const resultado = `A quantidade de números iguais é: ${teste}`
console.log (resultado)