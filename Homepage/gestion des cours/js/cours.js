let boutonEditer = document.getElementById("bouton");
let consulter = document.getElementById("emploisdutemps");
let boutonEnregistrer = document.getElementById("enregistrer");
let filière = document.getElementById("filière");
let niveau = document.getElementById("niveau");
let largeTableInputs = document.getElementsByClassName("large");
let mediumTableInputs = document.getElementsByClassName("medium");
//définir l'emplois du temps //
boutonEditer.addEventListener('click', function(editer){
    editer.preventDefault();
    if(filière.value == "" || niveau.value == ""){
        alert("Echec ! Veuillez saisir la filière et le niveau des édutiants avant de cliquer.");
    }
    else{
        var psswrd = 'admin';
    prompt("Entrer votre identifiant");
    var passwrd2 = prompt("Entrer votre mot de passe");
    if(psswrd != passwrd2){
        alert("mot de passe ou identifant incorrect !");
    }
    else{
        alert("succés ! ,cliquer sur ok pour continuer.");
        document.getElementById("nomdufilière").innerText = filière.value;
        document.getElementById("level").innerText = niveau.value;
        document.getElementById("repartition").style.display = "flex";
        document.getElementById("formulaire").style.display = "none";
        document.getElementById("header").style.display = "none";
    }
    }
});
// affichage de l'emplois du temps
consulter.addEventListener('click', function(afficher){
    afficher.preventDefault();
    if(filière.value == "" || niveau.value == ""){
        alert("Echec ! Veuillez saisir la filière et le niveau  avant de cliquer .");
    }
    else{
        alert("l'emplois du temps de cette classe n'a pas encore été défis ");
       
    }
});
//enregistrement de l'emplois du temps
boutonEnregistrer.addEventListener('click', function(enregistre){
    enregistre.preventDefault();
    if(largeTableInputs.value == "" || mediumTableInputs.value == ""){
        alert("echec ! veuillez remplir le tableau avant de cliquer sur enregistre!");
    }
    else{
        alert("l'enregistrement a été effectuer avec succés!");
        largeTableInputs.value = "" ; 
        mediumTableInputs.value = "" ;
    }

});