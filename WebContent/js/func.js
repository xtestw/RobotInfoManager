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
              // 加载ActiveX控件，获取Excel句柄
              var exApp = new ActiveXObject("Excel.Application");
            // 创建一个Excel文件
            var oWB = exApp.WorkBooks.add();
            // 获取sheet1句柄CA
            var exSheet = exApp.ActiveWorkBook.WorkSheets(1);
          // 设置sheet1的名称
           exSheet.name=filename;//"演示复制表格到Excel中";
            // copy指定的表格
            var sel=document.body.createTextRange();
        sel.moveToElementText(tableID);
        sel.select();
        sel.execCommand("Copy");
            // 粘贴到sheet中
            exSheet.Paste();
            // 弹出保存对话框，保存Excel文件 
            exApp.Save();
            // 退出Excel实例
            exApp.Quit();
            exApp = null;
            // 调用Cleanup（）进行垃圾回收
            idTmr = window.setInterval("Cleanup();",10);
    }catch(Exception )
    {
            //用户点击保存对话框中的取消按钮时会发生异常
    	alert(Exception);
    }
}
//函数功能：杀掉Excel进程
function Cleanup() {
      window.clearInterval(idTmr);
      CollectGarbage();
}

function dataToTxt(tableid,filename)
{
	var file_name=window.prompt("请指定输出文件名称(.txt)","C://ExportTxt.txt");
	//var file_name=filename;
	if(file_name!=null)
	{
	var curTbl = document.getElementById(tableid);
	file_name=file_name.split("//").join("////");
	alert(file_name);
	var FSO=new ActiveXObject("Scripting.FileSystemObject");
	var f1 = FSO.CreateTextFile(file_name, true); 
	var Lenr = curTbl.rows.length; //取得表格行数 
	for (i = 0; i < Lenr; i++){ 
	var Lenc = curTbl.rows(i).cells.length; //取得每行的列数 
	for (j = 0; j < Lenc; j++){ 
	f1.write(curTbl.rows(i).cells(j).innerText+" "); //赋值 
	} 
	f1.write("\r\n");
	} 
	f1.close();
	}
}
function outdata(){
	var datatype=$('input[name="geshi"]:checked').val()+"";
	if (datatype==undefined){alert("请选择格式！");}
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