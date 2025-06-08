<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
    <%@ include file="../../static/head.jsp" %>
    <link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css"
          rel="stylesheet">
    <script type="text/javascript" charset="utf-8">
        window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
    </script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
<style>
    .error {
        color: red;
    }
</style>
<body>
<!-- Pre Loader -->
<div class="loading">
    <div class="spinner">
        <div class="double-bounce1"></div>
        <div class="double-bounce2"></div>
    </div>
</div>
<!--/Pre Loader -->
<div class="wrapper">
    <!-- Page Content -->
    <div id="content">
        <!-- Top Navigation -->
        <%@ include file="../../static/topNav.jsp" %>
        <!-- Menu -->
        <div class="container menu-nav">
            <nav class="navbar navbar-expand-lg lochana-bg text-white">
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="ti-menu text-white"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul id="navUl" class="navbar-nav mr-auto">

                    </ul>
                </div>
            </nav>
        </div>
        <!-- /Menu --><!-- /Breadcrumb -->
        <!-- Main Content -->
        <div class="container" style="width: 600px">

            <div class="row" center>
                <!-- Widget Item -->
                <div class="col-md-12">
                    <div class="widget-area-2 lochana-box-shadow">
                        <h3 class="widget-title" style="margin-left: 195px">找回密码</h3>
                        <form id="zhaohui">
                            <div class="form-row">
                                    <input id="updateId" name="id" type="hidden">

                                <div class="form-group col-md-12">
                                    <label>账户</label>
                                    <input id="username" name="username" class="form-control"
                                           placeholder="账户">
                                </div>

                                <div class="form-group col-md-12">
                                    <label>姓名</label>
                                    <input id="name" name="name" class="form-control"
                                           placeholder="姓名">
                                </div>

                                <div class="form-group col-md-12">
                                    <label>身份证号</label>
                                    <input id="idNumber" name="idNumber" class="form-control"
                                           onchange="idNumberChickValue(this)"  placeholder="身份证号">
                                </div>

                                <div class="form-group col-md-12">
                                    <label>手机号</label>
                                    <input id="phone" name="phone" class="form-control"
                                           onchange="phoneChickValue(this)"  placeholder="手机号">
                                </div>

                                <div class="form-group col-md-12">
                                    <label>角色</label>
                                    <select id="jueseSelect" name="jueseSelect" class="form-control">
                                        <option value="yonghu">用户</option>
                                        <option value="jigou">机构</option>
                                    </select>
                                </div>
                                <div class="form-group col-md-12">
                                    <button id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
                                    <button id="exitBtn" type="button" class="btn btn-primary btn-lg">返回</button>
                                </div>
                            </div>
                        </form>

                    </div>
                    <!-- /Widget Item -->
                </div>
            </div>
            <!-- /Main Content -->
        </div>
        <!-- /Page Content -->
    </div>
    <!-- Back to Top -->
    <a id="back-to-top" href="#" class="back-to-top">
        <span class="ti-angle-up"></span>
    </a>
    <!-- /Back to Top -->
    <%@ include file="../../static/foot.jsp" %>
    <script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
    <script>
        <%@ include file="../../utils/menu.jsp"%>
        <%@ include file="../../static/setMenu.js"%>
        <%@ include file="../../utils/baseUrl.jsp"%>

        var tableName = "yonghu";
        var pageType = "register";
        var updateId = "";
        var crossTableId = -1;
        var crossTableName = '';
        var ruleForm = {};
        var crossRuleForm = {};

        // 下拉框数组
        <!-- 当前表的下拉框数组 -->
        var sexTypesOptions = [];
        var politicsTypesOptions = [];
        var xuexiaoTypesOptions = [];
        var xueyuanTypesOptions = [];
        var zhuanyeTypesOptions = [];

        var ruleForm = {};


        // 文件上传
        function upload() {
        <!-- 当前表的文件上传 -->


        }

        // 表单提交
        function submit() {

            if (validform() == true && compare() == true) {
                let data = {};
                let value = $('#zhaohui').serializeArray();
                $.each(value, function (index, item) {
                    data[item.name] = item.value;
                });
                var url = document.getElementById("jueseSelect").options[document.getElementById("jueseSelect").selectedIndex].value;//获取当前选择项的值.
                httpJson(url+"/zhaohui", "POST", data, (res) => {
                    if(res.code == 0){
                        window.sessionStorage.removeItem('id');
                        alert("密码重置成123456");
                        if (window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true") {
                            window.sessionStorage.removeItem('onlyme');
                            window.location.href="../../login.jsp";
                        } else {
                            window.location.href ="../../login.jsp";
                        }
                    }else{
                        alert(res.msg);
                    }
                });
            } else {
                alert("表单未填完整或有错误");
            }
        }

        <!-- 查询当前表的所有列表 -->
        function sexTypesSelect() {
            //填充下拉框选项
            http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=sex_types", "GET", {}, (res) => {
                if(res.code == 0){
                    sexTypesOptions = res.data.list;
                }
            });
        }
        function politicsTypesSelect() {
            //填充下拉框选项
            http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=politics_types", "GET", {}, (res) => {
                if(res.code == 0){
                    politicsTypesOptions = res.data.list;
                }
            });
        }
        function xuexiaoTypesSelect() {
            //填充下拉框选项
            http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=xuexiao_types", "GET", {}, (res) => {
                if(res.code == 0){
                    xuexiaoTypesOptions = res.data.list;
                }
            });
        }
        function xueyuanTypesSelect() {
            //填充下拉框选项
            http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=xueyuan_types", "GET", {}, (res) => {
                if(res.code == 0){
                    xueyuanTypesOptions = res.data.list;
                }
            });
        }
        function zhuanyeTypesSelect() {
            //填充下拉框选项
            http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=zhuanye_types", "GET", {}, (res) => {
                if(res.code == 0){
                    zhuanyeTypesOptions = res.data.list;
                }
            });
        }

        //初始化下拉框
        <!-- 初始化当前表的下拉框 -->
        function initializationSextypesSelect(){
            var sexTypesSelect = document.getElementById('sexTypesSelect');
            if(sexTypesSelect != null && sexTypesOptions != null  && sexTypesOptions.length > 0 ){
                for (var i = 0; i < sexTypesOptions.length; i++) {
                        sexTypesSelect.add(new Option(sexTypesOptions[i].indexName,sexTypesOptions[i].codeIndex));
                }
            }
        }
        function initializationPoliticstypesSelect(){
            var politicsTypesSelect = document.getElementById('politicsTypesSelect');
            if(politicsTypesSelect != null && politicsTypesOptions != null  && politicsTypesOptions.length > 0 ){
                for (var i = 0; i < politicsTypesOptions.length; i++) {
                        politicsTypesSelect.add(new Option(politicsTypesOptions[i].indexName,politicsTypesOptions[i].codeIndex));
                }
            }
        }
        function initializationXuexiaotypesSelect(){
            var xuexiaoTypesSelect = document.getElementById('xuexiaoTypesSelect');
            if(xuexiaoTypesSelect != null && xuexiaoTypesOptions != null  && xuexiaoTypesOptions.length > 0 ){
                for (var i = 0; i < xuexiaoTypesOptions.length; i++) {
                        xuexiaoTypesSelect.add(new Option(xuexiaoTypesOptions[i].indexName,xuexiaoTypesOptions[i].codeIndex));
                }
            }
        }
        function initializationXueyuantypesSelect(){
            var xueyuanTypesSelect = document.getElementById('xueyuanTypesSelect');
            if(xueyuanTypesSelect != null && xueyuanTypesOptions != null  && xueyuanTypesOptions.length > 0 ){
                for (var i = 0; i < xueyuanTypesOptions.length; i++) {
                        xueyuanTypesSelect.add(new Option(xueyuanTypesOptions[i].indexName,xueyuanTypesOptions[i].codeIndex));
                }
            }
        }
        function initializationZhuanyetypesSelect(){
            var zhuanyeTypesSelect = document.getElementById('zhuanyeTypesSelect');
            if(zhuanyeTypesSelect != null && zhuanyeTypesOptions != null  && zhuanyeTypesOptions.length > 0 ){
                for (var i = 0; i < zhuanyeTypesOptions.length; i++) {
                        zhuanyeTypesSelect.add(new Option(zhuanyeTypesOptions[i].indexName,zhuanyeTypesOptions[i].codeIndex));
                }
            }
        }




        // 获取富文本框内容
        function getContent() {
        //
        // <!-- 获取当前表的富文本框内容 -->
        // var aihaoContentEditor =UE.getEditor('aihaoContentEditor');
        // if (aihaoContentEditor.hasContents()) {
        //     $('#aihaoContent-input').attr('value', aihaoContentEditor.getPlainTxt());
        // }
        }

        //数字检查
        <!-- 当前表的数字检查 -->
        function idNumberChickValue(e){
            var this_val = e.value || 0;
            var reg=/^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
            if(!reg.test(this_val)){
                e.value = "";
                alert("身份证号不正确");
                return false;
            }
        }


        function phoneChickValue(e){
            var this_val = e.value || 0;
            var reg=/^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\d{8}$/;
            if(!reg.test(this_val)){
                e.value = "";
                alert("手机号不正确");
                return false;
            }
        }

        function exit() {
            window.sessionStorage.removeItem("id");
            window.location.href = "../../login.jsp";
        }
        // 表单校验
        function validform() {
            return $("#zhaohui").validate({
                rules: {
                        username: "required",
                        password: "required",
                        name: "required",
                        sexTypes: "required",
                        chushengriqi: "required",
                        nation: "required",
                        politicsTypes: "required",
                        xuexiaoTypes: "required",
                        xueyuanTypes: "required",
                        zhuanyeTypes: "required",
                        banji: "required",
                        xuehao: "required",
                        idNumber: "required",
                        phone: "required",
                        address: "required",
                        youxiang: "required",
                        youzhengbianma: "required",
                        aihaoContent: "required",
                },
                messages: {
                        username: "账户不能为空",
                        password: "密码不能为空",
                        name: "姓名不能为空",
                        sexTypes: "性别不能为空",
                        chushengriqi: "出生日期不能为空",
                        nation: "民族不能为空",
                        politicsTypes: "政治面貌不能为空",
                        xuexiaoTypes: "学校不能为空",
                        xueyuanTypes: "学院不能为空",
                        zhuanyeTypes: "专业不能为空",
                        banji: "班级不能为空",
                        xuehao: "学号不能为空",
                        idNumber: "身份证号不能为空",
                        phone: "手机号不能为空",
                        address: "家庭住址不能为空",
                        youxiang: "邮箱不能为空",
                        youzhengbianma: "邮政编码不能为空",
                        aihaoContent: "个人爱好不能为空",
                }
            }).form();
        }

        $(document).ready(function () {
            //设置右上角用户名
            $('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
            //设置项目名
            $('.sidebar-header h3 a').html(projectName)
            //设置导航栏菜单
            setMenu();
            $('#exitBtn').on('click', function (e) {
                e.preventDefault();
                exit();
            });
            //查询所有下拉框
        <!--  当前表的下拉框  -->
            sexTypesSelect();
            politicsTypesSelect();
            xuexiaoTypesSelect();
            xueyuanTypesSelect();
            zhuanyeTypesSelect();

            // 初始化下拉框
        <!--  初始化当前表的下拉框  -->
            initializationSextypesSelect();
            initializationPoliticstypesSelect();
            initializationXuexiaotypesSelect();
            initializationXueyuantypesSelect();
            initializationZhuanyetypesSelect();


            //注册表单验证
            $(validform());

            //初始化上传按钮
            upload();
        <%@ include file="../../static/myInfo.js"%>
                    $('#submitBtn').on('click', function (e) {
                        e.preventDefault();
                        //console.log("点击了...提交按钮");
                        submit();
                    });
        });



        //比较大小
        function compare() {
            var largerVal = null;
            var smallerVal = null;
            if (largerVal != null && smallerVal != null) {
                if (largerVal <= smallerVal) {
                    alert(smallerName + '不能大于等于' + largerName);
                    return false;
                }
            }
            return true;
        }


        // 用户登出
        <%@ include file="../../static/logout.jsp"%>
    </script>
</body>

</html>