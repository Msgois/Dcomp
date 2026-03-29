const aluno1 = {nome:"Gabriel",idade:19,matricula:202400068766,curso:"EC"}
const aluno2 = {nome:"Maiara",idade:18,matricula:202500012345,curso:"EC"}
const aluno3 = {nome:"Amizael",idade:19,matricula:202300014423,curso:"EC"}

const turma = [
    aluno1,aluno2,aluno3
]
const listarAlunos = turma =>
  turma.map(({ nome, idade, matricula, curso }) =>
    console.log(`Nome: ${nome}, Idade: ${idade}, Matrícula: ${matricula}, Curso: ${curso}`)
  )

listarAlunos(turma)