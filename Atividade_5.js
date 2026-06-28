window.alert("Bem-vindo ao Site");
function mudar_cor(){
window.document.getElementById("titulo").style.color="blue";
}
function voltar_cor(){
window.document.getElementById("titulo").style.color="yellow";
}
function onclick_titulo(){
window.document.getElementById("titulo"). textContent="Seleção Brasileira:Rumo ao Hexa!"
}
function mudar_curiosidade(){
window.document.getElementById("curiosidade").textContent="O Pelé segue como o mais jovem campeão mundial, vencendo a Copa de 1958 com apenas 17 anos."
}
function trocar_imagem(){
window.document.getElementById("imagem_selecao").src="https://upload.wikimedia.org/wikipedia/commons/5/5e/Brazil_national_team_1970.jpg"
window.document.getElementById("ano_selecao").textContent="Seleção de 1970"
}
function mudar_tamanho(){
window.document.getElementById("imagem_selecao").style.width="700px"
}
function voltar_tamanho(){
window.document.getElementById("imagem_selecao").style.width="600px"
}