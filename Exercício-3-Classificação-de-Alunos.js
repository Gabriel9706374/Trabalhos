let Alunos = ["Ana", "Bruno", "Carlos", "Daniela", "Eduardo"]
let Notas = [9, 5, 7, 10, 4]
let Classificacao
let Destaque = 0
let Esta_Bom = 0
let Precisa_Melhorar = 0
let Total_de_Alunos = Alunos.length

for (let cont = 0; cont < Alunos.length; cont++){
    if (Notas[cont] >= 8){
        Classificacao = " Destaque"
        Destaque++
    }else if (Notas[cont] >= 6){
        Classificacao = " Está bom"
        Esta_Bom++
    }else{
        Classificacao = " Precisa melhorar"
        Precisa_Melhorar++
    }
    let Status = (Notas[cont] > 6)? " [Aprovado]" : " [Reprovado]"
    console.log(Alunos[cont] + "_Nota: " + Notas[cont] + Classificacao + Status)
}

console.log("Resumo: Destaque: " + Destaque + " Aluno" + " /Está Bom: " + Esta_Bom + " Aluno"+ "/Precisa_Melhorar: " + Precisa_Melhorar + " Aluno" + " /Total de Alunos: " + Total_de_Alunos)