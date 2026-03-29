const aluno1 = {nome:"Gabriel",idade:19,matricula:202400068766,curso:"EC"}
const aluno2 = {nome:"Maiara",idade:18,matricula:202500012345,curso:"EC"}
const aluno3 = {nome:"Amizael",idade:19,matricula:202300014423,curso:"EC"}

const turma = [
    aluno1,aluno2,aluno3
]

const adicionarAluno = (turma, nome, idade, matricula, curso) => {
    const novoAluno = {
        nome: nome,
        idade: idade,
        matricula: matricula,
        curso: curso
    }

    return [...turma,novoAluno]
}
console.log (adicionarAluno(turma,"Kalil",30,200000078986,"SI"))