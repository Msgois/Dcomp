const aluno1 = {nome:"Gabriel",idade:19,matricula:202400068766,curso:"EC"}
const aluno2 = {nome:"Maiara",idade:18,matricula:202500012345,curso:"EC"}
const aluno3 = {nome:"Amizael",idade:19,matricula:202300014423,curso:"EC"}

const turma = [
    aluno1,aluno2,aluno3
]
const editarAluno = (turma, matricula, atualizacao) =>
  turma.map(aluno => aluno.matricula === matricula
      ? { ...aluno, ...atualizacao }
      : aluno
  )
const turmaAtualizada = editarAluno(turma, 202300014423, { idade: 22, nome: "Pedro" })
console.log (turmaAtualizada)

