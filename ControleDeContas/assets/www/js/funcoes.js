 function isNumberKey(e){
 	var charCode = e.keyCode;
 	if (charCode != 46 && charCode > 31 
 		&& (charCode < 48 || charCode > 57))
 		return false;

 	return true;
 }