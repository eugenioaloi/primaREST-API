var btnMostra = document.querySelector('#btnMostra');
var stampaUt = document.querySelector('#stampaUtenti');

var usersUrl = "http://localhost:8081/java-prima-api/users";

function stampaUtenti(){

  //fetch per poter leggere gli utenti
  fetch(usersUrl)
  .then(data =>{return data.json()})
  .then(res=>{
    res.forEach(ut => {//stampa il risultato nei li
      stampaUt.innerHTML += `<li> ${ut.nome} ${ut.cognome} - ${ut.email} </li>`
    });
   
  })
  
}

btnMostra.addEventListener("click",stampaUtenti);
