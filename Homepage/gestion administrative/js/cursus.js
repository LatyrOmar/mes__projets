let boutonValider = document.getElementById("valider");
let prenom = document.getElementById("prenom");
let nom = document.getElementById("nom");
let day = document.getElementById("datedenaissance");
let school = document.getElementById("ecole");
let diplome = document.getElementById("diplome");
let releve = document.getElementById("relevé");
let home = document.getElementById("adresse");
let niveau = document.getElementById("niveau");
let mention = document.getElementById("mention");
let mention2 = document.getElementById("mention2");
let bulletin = document.getElementById("bulletin1");
let bulletin1 = document.getElementById("bulletin2");
boutonValider.addEventListener('click', function(enregistrer){
  enregistrer.preventDefault();
if(prenom.value == "" || nom.value == "" || day.value == ""  || school.value == ""
   || diplome.value == "" || releve.value == "" || home.value == "" || niveau.value == "" 
   || mention.value == "" || mention2.value == "" || bulletin.value == "" || bulletin1.value == ""  ){

    alert("echec ! , impossible d'envoyer le formulaire ! , verifier que tous les champs sont remplis avant de valider !");
   }
   else{
    alert("les informations ont été envoyées avec succés!, cliquer sur ok pour continuer");
   } 
});