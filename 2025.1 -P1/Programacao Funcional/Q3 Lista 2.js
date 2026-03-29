function PFT(a,b,c){
    return (a + b > c) && (a + c > b) && (b + c > a)
}
if (PFT(1,2,3)) {
    console.log ("É UM TRIÂNGULO")
} else{
    console.log ("NÃO É UM TRIÂNGULO")
}