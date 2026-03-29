function calcularDistancia(x1, y1, x2, y2) {
    if (y1 === y2) {
        // Paralela ao eixo X
        return Math.abs(x2 - x1);
    } else if (x1 === x2) {
        // Paralela ao eixo Y
        return Math.abs(y2 - y1);
    } else {
        // Reta inclinada (não paralela)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

// Exemplo de uso:
const x1 = 2, y1 = 3;
const x2 = 5, y2 = 7;

const distancia = calcularDistancia(x1, y1, x2, y2);
console.log(`A distância entre os pontos é: ${distancia.toFixed(2)}`);