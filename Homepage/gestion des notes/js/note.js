/**récupération des informations saisie */
let boutonOk = document.getElementById("ok");
let nom = document.getElementById("nom");
let prenom = document.getElementById("prenom");
let dateDeNaissance = document.getElementById("naissance");
let filiere = document.getElementById("filiere");
let niveau = document.getElementById("niveau");
let annee = document.getElementById("année");
let semestre = document.getElementById("semestre");
let contenuePrincipale = document.getElementById("maincontent"); 
let formulaire = document.getElementById("infos");
/** ajout de l'evenement qui permet de verifier si tous les champs sont remplis avant d'afficher le tableau */
boutonOk.addEventListener('click', function(valider){
    valider.preventDefault();
  if(nom.value == "" || prenom.value == "" || dateDeNaissance.value == "" || filiere.value == ""
   || niveau.value == "" || annee.value == "" || semestre.value == "") {
   alert("echec! verifier que tous les champs sont remplis!");
   } 
  else
  {
   alert(" cliquer sur ok pour continuer");
   formulaire.style.display="none";
   document.getElementById("header").style.display="none";
    contenuePrincipale.style.display= "flex";
    document.getElementById("NOM2").innerText = nom.value;
    document.getElementById("PRENOM2").innerText = prenom.value;
    document.getElementById("level").innerText = niveau.value;
    document.getElementById("choix").innerText = filiere.value;
    document.getElementById("bornday").innerText = dateDeNaissance.value; 
    document.getElementById("SEMESTRE2").innerText = semestre.value; 
  }
});
 /**Enregistrement des notes 
 let inputs1 = document.getElementsByClassName('ITP').value;
 let inputs2 = document.getElementsByClassName('INP').value;
 let inputs3 = document.getElementsByClassName('IMP').value;
 let valider = document.getAnimations.ElementById("enregistrer");
 function valider(){
    if(inputs1 =="" || inputs2 == "" || inputs3 ==""){
          alert("echec! veuillez entrer une note avant d'enregistrer");
    }else{
      alert("enregitrement réussi");
    }
 }
 */