var btnMostra = document.querySelector('#btnMostra');
var stampaUt = document.querySelector('#stampaUtenti');

var usersUrl = "http://localhost:8080/java-prima-api/utenti";

function stampaUtenti(){

  //fetch per poter leggere gli utenti
  fetch(usersUrl)
  .then(data =>{return data.json()})
  .then(res=>{
    console.log(res);
    let utenti = res.data;

    utenti.forEach(ut => {
      stampaUt.innerHTML += `<li>${ut.nome}${ut.cognome} - ${ut.email}</li>`
    });
  })
  
}

btnMostra.addEventListener("click",stampaUtenti);
