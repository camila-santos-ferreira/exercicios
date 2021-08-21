alunos = ["Enzo","Valentina","Joana","Marcio"]
notas= [[5.6,7.2],[9.1,8.4],[5.8,4.6],[4.5,8.5]]


for(x = 0; x < alunos.length; x++){
    
    alunoSelect = x

    nome = alunos[alunoSelect]
    nota = notas[alunoSelect]

    nota1 = nota[0]
    nota2 = nota[1]

    media = (nota1+nota2)/2

    console.log("Nome: " + nome + " | " + "Média: " + media)

}
