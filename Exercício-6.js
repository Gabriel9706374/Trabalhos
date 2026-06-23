let idade = 16;
let matriculado = true;

if (matriculado = false || idade <= 0){
    console.log("Aluno não Matriculado ou Idade Inválida");
}else if (idade <= 5){
    console.log("Educação Infantil");
}else if (idade >= 6 && idade <= 10){
    console.log("Ensino Fundamental I");
}else if (idade >= 11 && idade <= 14){
    console.log("Ensino Fundamental II");
}else if (idade >= 15 && idade <= 17){
    console.log("Ensino Médio");
}else{
    console.log("Ensino Superior ou EJA");
}