let cardapio = 3;
let quantidade = 2;
let pedido_tradicional = (cardapio < 2)? " Pizza" : " Hamburguer";

switch (cardapio){
  case 1:
    console.log ("Pedido Tradicional: " + quantidade + pedido_tradicional);
    break;
  case 2:
    console.log("Pedido Tradicional: " + quantidade + pedido_tradicional);
    break;
  case 3:
    console.log("Pedido saudável: " + quantidade + " Salada");
    break;
  case 4:
    console.log("Bebida escolhida: " + quantidade + " Refrigerante")
  default:
    console.log(quantidade + " Alimento escolhido" );
    break;
}