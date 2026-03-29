const carrinho= [
    {nome: `Caixadecanudinho`, qtd: 3, preço: 10.50, fragil: true},
    {nome: `PeitodeFrango`, qtd: 4, preço: 22.99 , fragil: true},
    {nome: `Guarana`, qtd: 2, preço: 8.90, fragil: false},
    {nome: `Balões`,qtd: 5, preço: 3, fragil: false},
    {nome: `CocaCola`,qtd: 2, preço: 8.90,fragil:false },
    {nome: `Vela`,qtd:1,preço: 5.55,fragil: true},
    {nome: `Massaprontadechocolate`,qtd:1,preço:10.90,fragil:false},
    {nome:`Leite condesado`,qtd:2,preço:5.60,fragil:false},
    {nome:`Cartela de Ovos`,qtd:2,preço:14.99,fragil:true},
    {nome: `CoxinhasProntas`,qtd:100,preço:0.50,fragil:true}
]
const somatodos=(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10)=> 
    p1.qtd*p1.preço+ p10.qtd*p10.preço+
 p2.qtd*p2.preço+
 p3.qtd*p3.preço+
 p4.qtd*p4.preço+
 p5.qtd*p5.preço+
 p6.qtd*p6.preço+
 p7.qtd*p7.preço+
 p8.qtd*p8.preço+
 p9.qtd*p9.preço

const somafrageis=(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10)=> {
    const test1= p1.fragil ? p1.qtd *p1.preço : 0
    const test2= p2.fragil ? p2.qtd *p2.preço : 0
    const test3= p3.fragil ? p3.qtd *p3.preço : 0
    const test4= p4.fragil ? p4.qtd*p4.preço : 0
    const test5= p5.fragil ? p5.qtd*p5.preço : 0
    const test6= p6.fragil ? p6.qtd*p6.preço : 0
    const test7= p7.fragil ? p7.qtd*p7.preço : 0
    const test8= p8.fragil ? p8.qtd*p8.preço : 0
    const test9= p9.fragil ? p9.qtd*p9.preço : 0
    const test10= p10.fragil ? p10.qtd*p10.preço : 0
return test1+test2+test3+test4+test5+test6+test7+test8+test9+test10
}
const desconto = d => valor => (1-d)*valor

console.log (`O resultado da soma do carrinho com o desconto de 10% é ${desconto(0.1)(somatodos(carrinho[0],carrinho[1],carrinho[2],
    carrinho[3],carrinho[4],carrinho[5],carrinho[6],carrinho[7],
    carrinho[8],carrinho[9]))}`)
console.log (`O resultado da soma dos produtos frageis do carrinho é ${somafrageis(carrinho[0],carrinho[1],carrinho[2],
    carrinho[3],carrinho[4],carrinho[5],carrinho[6],carrinho[7],carrinho[8],carrinho[9])}`)
