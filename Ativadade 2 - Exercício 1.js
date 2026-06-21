let idade = 20;
let ingresso = true;

let Verificação = idade >= 18 && ingresso === true;
let respostas = {
    true: "Entrada permitida",
    false: "Entrada negada"
};

console.log(respostas[Verificação]);