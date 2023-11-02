var nombre= document.getElementById('nbr');
var cpt = 0;
function augmenter(){
    cpt++;
    nombre.innerHTML= cpt;
}
function diminuer(){
    cpt--;
    nombre.innerHTML= cpt;
}