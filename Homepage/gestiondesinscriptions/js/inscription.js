//affichage du formulaire
function affichageFormulaireInscription (){
    let formulaire1 = document.getElementById('formulaire');
    let choix = document.getElementById('Inscription-ou-Réinscription');
    let ufr = document.getElementById('UFR1');
    choix.style.display = "none";
    formulaire1.style.display = "flex";
    ufr.innerText = "Dernier établissement fréquenté";
}
function affichageFormulaireDeRéinscription (){
    let formulaire1 = document.getElementById('formulaire');
    let choix = document.getElementById('Inscription-ou-Réinscription');
    let identifiant = prompt("Saisissez votre INE");
    let INE= "2022";
    if( identifiant!=INE){
        alert("Erreur ! ,INE incorrect");
    }
    else{
        choix.style.display = "none";
        formulaire1.style.display = "flex";
    }
}
// recupération  des informations saisie par l'utilisateur //
const inscription = document.getElementById('valider');
const prenomSaisie =document.getElementById("prenom");
const nomSaisie = document.getElementById("nom");
const dateSaisie = document.getElementById("date");
const Email= document.getElementById("mail");
const numero =document.getElementById("phone");
const ufrSaisie = document.getElementById("UFR");
const filiereSaisie = document.getElementById("filière");
const niveau = document.getElementById("level");

inscription.addEventListener('click',function(inscrir){
    inscrir.preventDefault();
    if( prenomSaisie.value == "" || nomSaisie.value == "" || dateSaisie.value == "" ||
    Email.value == "" || numero.value == "" || ufrSaisie.value == "" || filiereSaisie.value == "" ||
    niveau.value == "" ) {
        alert("echec ! veuillez remplir tous les champs.");
        }
        else {
   alert("Inscription réussi! "+prenomSaisie.value+ ' ' + nomSaisie.value+ 
   " votre requête a été envoyer avec succées.\n Un mail vous sera envoyé pour valider l'inscription.");
        }           
});
// affichage de la liste des étudiants inscrits //
document.getElementById("text1").addEventListener('click', function(voir){
    voir.preventDefault();
    var psswrd = 'admin';
    prompt("Entrer votre identifiant");
    var passwrd2 = prompt("Entrer votre mot de passe");
    if(psswrd != passwrd2){
        alert("mot de passe ou identifant incorrect !");
    }
    else{
        document.getElementById("formulaire").style.display = "none";
        document.getElementById("level").innerText = "Inscrits";
            document.getElementById("etudiantsInscrits").style.display = "flex";
    
    }
   
   });



