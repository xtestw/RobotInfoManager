function post(URL, PARAMS) {      
    var temp = document.createElement("form");      
    temp.action = URL;      
    temp.method = "post";      
    temp.style.display = "none";      
    for (var x in PARAMS) {      
        var opt = document.createElement("textarea");      
        opt.name = x;      
        opt.value = PARAMS[x];      
        // alert(opt.name)      
        temp.appendChild(opt);      
    }      
    document.body.appendChild(temp);      
    temp.submit();      
    return temp;      
}      

function getAdapt(){
	
	if (window.XMLHttpRequest){
		return new XMLHttpRequest();
	}else{
		return new ActiveXObject("Microsoft.XMLHTTP");
	}
}


function ajaxFunc(URL,method,PARAMS){
	var httpAdapt=getAdapt();
	var parms="";
	for (var t in PARAMS){
		if (!parms.equals("")) parms+="&";
		parms+=t+"="+PARAMS[t];
	}
	if (method.equals("get")){
		httpAdapt.open("GET",URL+"?"+parms,true);
		httpAdapt.send();
	}else{
		httpAdapt.open("POST",URL,true);
		httpAdapt.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		httpAdapt.send(parms);
	}
	httpAdapt.onreadystatechange=function(){
		if (httpAdapt.readyState==4 && httpAdapt.status==200){
			alert(httpAdapt.responseText);
			return httpAdapt.responseText;
		}
	};
}