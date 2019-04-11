// Project JS here
function openRequestedWeb(webRequired, whereOpen) {
	var windowObjectReference = 
		window.open(webRequired, whereOpen);
	return windowObjectReference;
};

document.getElementById("form1").addEventListener("submit", function(event){
    console.log(event);
    
	event.preventDefault();
	event.stopPropagation();
	
	var objUser = new Object();
	objUser.usuario = document.getElementById("usuario").value;
	objUser.clave = document.getElementById("password").value;
	objUser.id = 0;
	
	var stringJSONUser = JSON.stringify(objUser);
	
	var xhttp = new XMLHttpRequest();
	
	xhttp.onreadystatechange = function() {
		if (this.readyState === 4 && this.status === 200) {
			var respuestaRecibida = this.responseText;		
			if(respuestaRecibida === "ERROR"){
				$("#myModal").modal("show");
		  		infoNomPartStyleChange ("usrIncorrecto" , "display: inline");		    
			}
			else {
				openRequestedWeb("page3", "_self");
			}		   
		}			
	}	
	
	xhttp.open("POST", "irformulario", true);
	xhttp.setRequestHeader("Content-type",
						   "application/x-www-form-urlencoded");
	xhttp.send("userJSON="+stringJSONUser);
	
});