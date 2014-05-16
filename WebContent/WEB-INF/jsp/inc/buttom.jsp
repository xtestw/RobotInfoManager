<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


     <script src="<%=request.getContextPath()%>/lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>