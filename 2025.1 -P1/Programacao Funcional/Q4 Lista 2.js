function PFT(a,b,c){
    return (a + b > c) && (a + c > b) && (b + c > a)
}
function CST (a,b,c){
 if (!PFT(a,b,c)) {   // O COMANDO if(!) representa "SE A CONDIÇÃO NÃO FOR VERDADEIRA"
    return "NÃO É UM TRIÂNGULO";
}

if (a===b && b===c) { // O === COMPARA SE OS VALORES E OS TIPOS SÃO IGUAIS
    return "É UM TRIÂNGULO EQUILÁTERO";
} else if (a===b||b===c||c==a){
    return "É UM TRIÂNGULO ISÓSCELES";
} else {
    return "É UM TRIÂNGULO ESCALENO";
}
}
const l1=1
const l3=2
const l2=3
const classificação = CST(l1,l3,l2);
console.log(`O triângulo é: ${classificação}`)
