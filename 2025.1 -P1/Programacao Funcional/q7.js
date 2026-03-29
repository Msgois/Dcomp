const menorv = (a,b,c) =>{
    if (a<=b && a<=c)
        return (a)
    else if (b<=a && b<=c)
        return (b)
    else if (c<=a && c<=b)
        return (c)
    else
    return (a)
}
const resposta = menorv(3,4222,13333)
const resultado = (`O menor valor entre os 3 é: ${resposta}`)
console.log (resultado)