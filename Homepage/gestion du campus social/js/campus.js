let nom = document.getElementById("nom");
let prenom = document.getElementById("prenom");
let dateDeNaissance = document.getElementById("naissance");
let nationalite = document.getElementById("nationalité");
let genre = document.getElementById("genre");
let adresse = document.getElementById("adresse");
let INE = document.getElementById("INE");
let filiere = document.getElementById("filière");
let niveau = document.getElementById("niveau");
let campus = document.getElementById("campus");
let numeroChambre = document.getElementById("chambre");
let boutonLoger = document.getElementById("bouton");
let voirCampus = document.getElementById("voirCampus");

function validation (){
    if(nom.value == "" || prenom.value == "" || dateDeNaissance.value == "" || nationalite.value == "" 
     || genre.value == "" || adresse.value == "" || INE.value == "" || filiere.value == "" ||
    niveau.value == "" || campus.value == "" || numeroChambre.value == "" )
    {
        alert("echec ! formulaire non envoyé verifier que tous les champs sont remplis. ");
    }
     else{
   
        alert("Requête envoyée avec succès ! cliquer sur ok pour continuer.");
     }
};
voirCampus.addEventListener('click', function(){
   var psswrd = 'admin';
    prompt("Entrer votre identifiant");
    var passwrd2 = prompt("Entrer votre mot de passe");
    if(psswrd != passwrd2){
        alert("mot de passe ou identifant incorrect !");
    }
    else{
   alert("cette page n'est pas displonible pour le moment. réessayer utérieurment !");
    }
});
