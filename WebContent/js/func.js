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
function CellToTable(tableID,filename)
{
    try
    {
              // ����ActiveX�ؼ�����ȡExcel���
              var exApp = new ActiveXObject("Excel.Application");
            // ����һ��Excel�ļ�
            var oWB = exApp.WorkBooks.add();
            // ��ȡsheet1���CA
            var exSheet = exApp.ActiveWorkBook.WorkSheets(1);
          // ����sheet1������
           exSheet.name=filename;//"��ʾ���Ʊ��Excel��";
            // copyָ���ı��
            var sel=document.body.createTextRange();
        sel.moveToElementText(tableID);
        sel.select();
        sel.execCommand("Copy");
            // ճ����sheet��
            exSheet.Paste();
            // ��������Ի��򣬱���Excel�ļ� 
            exApp.Save();
            // �˳�Excelʵ��
            exApp.Quit();
            exApp = null;
            // ����Cleanup����������������
            idTmr = window.setInterval("Cleanup();",10);
    }catch(Exception )
    {
            //�û��������Ի����е�ȡ����ťʱ�ᷢ���쳣
    	alert(Exception);
    }
}
//�������ܣ�ɱ��Excel����
function Cleanup() {
      window.clearInterval(idTmr);
      CollectGarbage();
}

function dataToTxt(tableid,filename)
{
	var file_name=window.prompt("��ָ������ļ�����(.txt)","C://ExportTxt.txt");
	//var file_name=filename;
	if(file_name!=null)
	{
	var curTbl = document.getElementById(tableid);
	file_name=file_name.split("//").join("////");
	alert(file_name);
	var FSO=new ActiveXObject("Scripting.FileSystemObject");
	var f1 = FSO.CreateTextFile(file_name, true); 
	var Lenr = curTbl.rows.length; //ȡ�ñ������ 
	for (i = 0; i < Lenr; i++){ 
	var Lenc = curTbl.rows(i).cells.length; //ȡ��ÿ�е����� 
	for (j = 0; j < Lenc; j++){ 
	f1.write(curTbl.rows(i).cells(j).innerText+" "); //��ֵ 
	} 
	f1.write("\r\n");
	} 
	f1.close();
	}
}
function outdata(){
	var datatype=$('input[name="geshi"]:checked').val()+"";
	if (datatype==undefined){alert("��ѡ���ʽ��");}
	var dataname=$('input[name="filename"]:checked').val();
	if (dataname==undefined) dataname="output";
	tableid="info";
	alert(datatype)
	
	if(datatype=="excel")
	{
		alert("dd");
		CellToTable(tableid,dataname);
	}else
	{
		dataToTxt(tableid,dataname);
	}
}