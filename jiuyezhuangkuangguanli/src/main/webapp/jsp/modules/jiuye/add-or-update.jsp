<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
    <%@ include file="../../static/head.jsp" %>
    <link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css"
          rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap-select.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
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
        <!-- /Menu -->
        <!-- Breadcrumb -->
        <!-- Page Title -->
        <div class="container mt-0">
            <div class="row breadcrumb-bar">
                <div class="col-md-6">
                    <h3 class="block-title">编辑就业信息</h3>
                </div>
                <div class="col-md-6">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="${pageContext.request.contextPath}/index.jsp">
                                <span class="ti-home"></span>
                            </a>
                        </li>
                        <li class="breadcrumb-item">就业信息管理</li>
                        <li class="breadcrumb-item active">编辑就业信息</li>
                    </ol>
                </div>
            </div>
        </div>
        <!-- /Page Title -->

        <!-- /Breadcrumb -->
        <!-- Main Content -->
        <div class="container">

            <div class="row">
                <!-- Widget Item -->
                <div class="col-md-12">
                    <div class="widget-area-2 lochana-box-shadow">
                        <h3 class="widget-title">就业信息信息</h3>
                        <form id="addOrUpdateForm">
                            <div class="form-row">
                            <!-- 级联表的字段 -->
                                    <%--<div class="form-group col-md-6">
                                        <label>用户</label>
                                        <div>
                                            <select id="yonghuSelect" name="yonghuSelect"
                                                    class="selectpicker form-control"  data-live-search="true"
                                                    title="请选择" data-header="请选择" data-size="5">
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>账户</label>
                                        <input id="username" name="username" class="form-control"
                                               placeholder="账户" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>姓名</label>
                                        <input id="name" name="name" class="form-control"
                                               placeholder="姓名" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>性别</label>
                                        <input id="sexValue" name="sexValue" class="form-control"
                                               placeholder="性别" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>照片</label>
                                        <img id="yonghuPhotoImg" src="" width="100" height="100">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>出生日期</label>
                                        <input id="chushengriqi" name="chushengriqi" class="form-control"
                                               placeholder="出生日期" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>民族</label>
                                        <input id="nation" name="nation" class="form-control"
                                               placeholder="民族" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>政治面貌</label>
                                        <input id="politicsValue" name="politicsValue" class="form-control"
                                               placeholder="政治面貌" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>学校</label>
                                        <input id="xuexiaoValue" name="xuexiaoValue" class="form-control"
                                               placeholder="学校" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>学院</label>
                                        <input id="xueyuanValue" name="xueyuanValue" class="form-control"
                                               placeholder="学院" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>专业</label>
                                        <input id="zhuanyeValue" name="zhuanyeValue" class="form-control"
                                               placeholder="专业" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>班级</label>
                                        <input id="banji" name="banji" class="form-control"
                                               placeholder="班级" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>学号</label>
                                        <input id="xuehao" name="xuehao" class="form-control"
                                               placeholder="学号" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>身份证号</label>
                                        <input id="idNumber" name="idNumber" class="form-control"
                                               placeholder="身份证号" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>手机号</label>
                                        <input id="phone" name="phone" class="form-control"
                                               placeholder="手机号" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>家庭住址</label>
                                        <input id="address" name="address" class="form-control"
                                               placeholder="家庭住址" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>邮箱</label>
                                        <input id="youxiang" name="youxiang" class="form-control"
                                               placeholder="邮箱" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>邮政编码</label>
                                        <input id="youzhengbianma" name="youzhengbianma" class="form-control"
                                               placeholder="邮政编码" readonly>
                                    </div>--%>
                            <!-- 当前表的字段 -->
                                    <input id="updateId" name="id" type="hidden">
                                <input id="yonghuId" name="yonghuId" type="hidden">
                                   <div class="form-group col-md-6">
                                       <label>是否就业</label>
                                       <select id="jiuyeTypesSelect" name="jiuyeTypes" class="form-control">
                                       </select>
                                   </div>
                                   <div class="form-group col-md-6">
                                       <label>就业地区</label>
                                       <select id="diquTypesSelect" name="diquTypes" class="form-control">
                                       </select>
                                   </div>
                                    <div class="form-group col-md-6">
                                        <label>公司名称</label>
                                        <input id="gongsiName" name="gongsiName" class="form-control"
                                               placeholder="公司名称">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>公司负责人姓名</label>
                                        <input id="fuzerenName" name="fuzerenName" class="form-control"
                                               placeholder="公司负责人姓名">
                                    </div>
                                <div class="form-group col-md-6">
                                    <label>公司负责人手机号</label>
                                    <input id="fuzerenIdNumber" name="fuzerenIdNumber" class="form-control"
                                           onchange="fuzerenIdNumberChickValue(this)"  placeholder="公司负责人手机号">
                                </div>
                                   <div class="form-group col-md-6">
                                       <label>担任职位</label>
                                       <select id="zhiweiTypesSelect" name="zhiweiTypes" class="form-control">
                                       </select>
                                   </div>
                                   <div class="form-group  col-md-6">
                                       <label>备注</label>
                                       <input id="beizhuContentupload" name="file" type="file">
                                       <script id="beizhuContentEditor" type="text/plain"
                                               style="width:800px;height:230px;"></script>
                                       <script type = "text/javascript" >
                                       //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
                                       //相见文档配置属于你自己的编译器
                                       var beizhuContentUe = UE.getEditor('beizhuContentEditor', {
                                           toolbars: [
                                               [
                                                   'undo', //撤销
                                                   'bold', //加粗
                                                   'redo', //重做
                                                   'underline', //下划线
                                                   'horizontal', //分隔线
                                                   'inserttitle', //插入标题
                                                   'cleardoc', //清空文档
                                                   'fontfamily', //字体
                                                   'fontsize', //字号
                                                   'paragraph', //段落格式
                                                   'inserttable', //插入表格
                                                   'justifyleft', //居左对齐
                                                   'justifyright', //居右对齐
                                                   'justifycenter', //居中对
                                                   'justifyjustify', //两端对齐
                                                   'forecolor', //字体颜色
                                                   'fullscreen', //全屏
                                                   'edittip ', //编辑提示
                                                   'customstyle', //自定义标题
                                               ]
                                           ]
                                       });
                                       </script>
                                       <input type="hidden" name="beizhuContent" id="beizhuContent-input">
                                   </div>
                                <div class="form-group col-md-12 mb-3">
                                    <button id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
                                    <button id="exitBtn" type="button" class="btn btn-primary btn-lg">返回</button>
                                </div>
                            </div>
                        </form>
                    </div>
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
</script><script type="text/javascript" charset="utf-8"
                 src="${pageContext.request.contextPath}/resources/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/laydate.js"></script>
<script>
    <%@ include file="../../utils/menu.jsp"%>
    <%@ include file="../../static/setMenu.js"%>
    <%@ include file="../../utils/baseUrl.jsp"%>

    var tableName = "jiuye";
    var pageType = "add-or-update";
    var updateId = "";
    var crossTableId = -1;
    var crossTableName = '';
    var ruleForm = {};
    var crossRuleForm = {};


    // 下拉框数组
        <!-- 当前表的下拉框数组 -->
    var jiuyeTypesOptions = [];
    var diquTypesOptions = [];
    var zhiweiTypesOptions = [];
        <!-- 级联表的下拉框数组 -->
    var yonghuOptions = [];

    var ruleForm = {};


    // 文件上传
    function upload() {

        <!-- 当前表的文件上传 -->

        $('#beizhuContentupload').fileupload({
            url: baseUrl + 'file/upload',
            headers: {token: window.sessionStorage.getItem("token")},
            dataType: 'json',
            done: function (e, data) {
                UE.getEditor('beizhuContentEditor').execCommand('insertHtml', '<img src=\"' + baseUrl + 'upload/' + data.result.file + '\" width=900 height=560>');
            }
        });


    }




    function fuzerenIdNumberChickValue(e){
        var this_val = e.value || 0;
        var reg=/^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\d{8}$/;
        if(!reg.test(this_val)){
            e.value = "";
            alert("手机号不正确");
            return false;
        }
    }

    // 表单提交
    function submit() {
        if (validform() == true && compare() == true) {
            let data = {};
            getContent();
            let value = $('#addOrUpdateForm').serializeArray();
            $.each(value, function (index, item) {
                data[item.name] = item.value;
            });
            let json = JSON.stringify(data);
            var urlParam;
            var successMes = '';
            if (updateId != null && updateId != "null" && updateId != '') {
                urlParam = 'update';
                successMes = '修改成功';
            } else {
                urlParam = 'save';
                successMes = '添加成功';
            }
            httpJson("jiuye/" + urlParam, "POST", data, (res) => {
                if(res.code == 0){
                    window.sessionStorage.removeItem('addjiuye');
                    window.sessionStorage.removeItem('updateId');
                    let flag = true;
                    if (flag) {
                        alert(successMes);
                    }
                    if (window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true") {
                        window.sessionStorage.removeItem('onlyme');
                        window.sessionStorage.setItem("reload","reload");
                        window.parent.location.href = "${pageContext.request.contextPath}/index.jsp";
                    } else {
                        window.location.href = "list.jsp";
                    }
                }
            });
        } else {
            alert("表单未填完整或有错误");
        }
    }

    // 查询列表
        <!-- 查询当前表的所有列表 -->
        function jiuyeTypesSelect() {
            //填充下拉框选项
            http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=jiuye_types", "GET", {}, (res) => {
                if(res.code == 0){
                    jiuyeTypesOptions = res.data.list;
                }
            });
        }
        function diquTypesSelect() {
            //填充下拉框选项
            http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=diqu_types", "GET", {}, (res) => {
                if(res.code == 0){
                    diquTypesOptions = res.data.list;
                }
            });
        }
        function zhiweiTypesSelect() {
            //填充下拉框选项
            http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=zhiwei_types", "GET", {}, (res) => {
                if(res.code == 0){
                    zhiweiTypesOptions = res.data.list;
                }
            });
        }
        <!-- 查询级联表的所有列表 -->
        function yonghuSelect() {
            //填充下拉框选项
            http("yonghu/page?page=1&limit=100&sort=&order=", "GET", {}, (res) => {
                if(res.code == 0){
                    yonghuOptions = res.data.list;
                }
            });
        }

        function yonghuSelectOne(id) {
            http("yonghu/info/"+id, "GET", {}, (res) => {
                if(res.code == 0){
                ruleForm = res.data;
                yonghuShowImg();
                yonghuDataBind();
            }
        });
        }



    // 初始化下拉框
    <!-- 初始化当前表的下拉框 -->
        function initializationJiuyetypesSelect(){
            var jiuyeTypesSelect = document.getElementById('jiuyeTypesSelect');
            if(jiuyeTypesSelect != null && jiuyeTypesOptions != null  && jiuyeTypesOptions.length > 0 ){
                for (var i = 0; i < jiuyeTypesOptions.length; i++) {
                    jiuyeTypesSelect.add(new Option(jiuyeTypesOptions[i].indexName,jiuyeTypesOptions[i].codeIndex));
                }
            }
        }
        function initializationDiqutypesSelect(){
            var diquTypesSelect = document.getElementById('diquTypesSelect');
            if(diquTypesSelect != null && diquTypesOptions != null  && diquTypesOptions.length > 0 ){
                for (var i = 0; i < diquTypesOptions.length; i++) {
                    diquTypesSelect.add(new Option(diquTypesOptions[i].indexName,diquTypesOptions[i].codeIndex));
                }
            }
        }
        function initializationZhiweitypesSelect(){
            var zhiweiTypesSelect = document.getElementById('zhiweiTypesSelect');
            if(zhiweiTypesSelect != null && zhiweiTypesOptions != null  && zhiweiTypesOptions.length > 0 ){
                for (var i = 0; i < zhiweiTypesOptions.length; i++) {
                    zhiweiTypesSelect.add(new Option(zhiweiTypesOptions[i].indexName,zhiweiTypesOptions[i].codeIndex));
                }
            }
        }

    <!-- 初始化级联表的下拉框(要根据内容修改) -->
    <!-- 初始化级联表的下拉框(要根据内容修改) -->
    <!-- 初始化级联表的下拉框(要根据内容修改) -->
    <!-- 初始化级联表的下拉框(要根据内容修改) -->
    <!-- 初始化级联表的下拉框(要根据内容修改) -->
    <!-- 初始化级联表的下拉框(要根据内容修改) -->
        function initializationyonghuSelect() {
            var yonghuSelect = document.getElementById('yonghuSelect');
            if(yonghuSelect != null && yonghuOptions != null  && yonghuOptions.length > 0 ) {
                for (var i = 0; i < yonghuOptions.length; i++) {
                        yonghuSelect.add(new Option(yonghuOptions[i].name, yonghuOptions[i].id));
                }

                $("#yonghuSelect").change(function(e) {
                        yonghuSelectOne(e.target.value);
                });
            }

        }



    // 下拉框选项回显
    function setSelectOption() {

        <!-- 当前表的下拉框回显 -->

        var jiuyeTypesSelect = document.getElementById("jiuyeTypesSelect");
        if(jiuyeTypesSelect != null && jiuyeTypesOptions != null  && jiuyeTypesOptions.length > 0 ) {
            for (var i = 0; i < jiuyeTypesOptions.length; i++) {
                if (jiuyeTypesOptions[i].codeIndex == ruleForm.jiuyeTypes) {//下拉框value对比,如果一致就赋值汉字
                        jiuyeTypesSelect.options[i].selected = true;
                }
            }
        }

        var diquTypesSelect = document.getElementById("diquTypesSelect");
        if(diquTypesSelect != null && diquTypesOptions != null  && diquTypesOptions.length > 0 ) {
            for (var i = 0; i < diquTypesOptions.length; i++) {
                if (diquTypesOptions[i].codeIndex == ruleForm.diquTypes) {//下拉框value对比,如果一致就赋值汉字
                        diquTypesSelect.options[i].selected = true;
                }
            }
        }

        var zhiweiTypesSelect = document.getElementById("zhiweiTypesSelect");
        if(zhiweiTypesSelect != null && zhiweiTypesOptions != null  && zhiweiTypesOptions.length > 0 ) {
            for (var i = 0; i < zhiweiTypesOptions.length; i++) {
                if (zhiweiTypesOptions[i].codeIndex == ruleForm.zhiweiTypes) {//下拉框value对比,如果一致就赋值汉字
                        zhiweiTypesSelect.options[i].selected = true;
                }
            }
        }
        <!--  级联表的下拉框回显  -->
            var yonghuSelect = document.getElementById("yonghuSelect");
            if(yonghuSelect != null && yonghuOptions != null  && yonghuOptions.length > 0 ) {
                for (var i = 0; i < yonghuOptions.length; i++) {
                    if (yonghuOptions[i].id == ruleForm.yonghuId) {//下拉框value对比,如果一致就赋值汉字
                        yonghuSelect.options[i+1].selected = true;
                        $("#yonghuSelect" ).selectpicker('refresh');
                    }
                }
            }
    }


    // 填充富文本框
    function setContent() {

        <!-- 当前表的填充富文本框 -->
        if (ruleForm.beizhuContent != null && ruleForm.beizhuContent != 'null' && ruleForm.beizhuContent != '') {

            var beizhuContentUeditor = UE.getEditor('beizhuContentEditor');
            beizhuContentUeditor.ready(function () {
                var mes = '' + ruleForm.beizhuContent;
                beizhuContentUeditor.setContent(mes);
            });
        }
    }
    // 获取富文本框内容
    function getContent() {

        <!-- 获取当前表的富文本框内容 -->
        var beizhuContentEditor =UE.getEditor('beizhuContentEditor');
        if (beizhuContentEditor.hasContents()) {
                $('#beizhuContent-input').attr('value', beizhuContentEditor.getPlainTxt());
        }
    }
    //数字检查
        <!-- 当前表的数字检查 -->

    function exit() {
        window.sessionStorage.removeItem("updateId");
        window.sessionStorage.removeItem('addjiuye');
        window.location.href = "list.jsp";
    }
    // 表单校验
    function validform() {
        return $("#addOrUpdateForm").validate({
            rules: {
            },
            messages: {
            }
        }).form();
    }

    // 获取当前详情
    function getDetails() {
        var addjiuye = window.sessionStorage.getItem("addjiuye");
        if (addjiuye != null && addjiuye != "" && addjiuye != "null") {
            window.sessionStorage.removeItem('addjiuye');
            //注册表单验证
            $(validform());
            $('#submitBtn').text('新增');

        } else {
            $('#submitBtn').text('修改');
            var userId = window.sessionStorage.getItem('userId');
            updateId = userId;//先赋值登录用户id
            var uId  = window.sessionStorage.getItem('updateId');//获取修改传过来的id
            if (uId != null && uId != "" && uId != "null") {
                //如果修改id不为空就赋值修改id
                updateId = uId;
            }
            window.sessionStorage.removeItem('updateId');
            http("jiuye/info/" + updateId, "GET", {}, (res) => {
                if(res.code == 0)
                {
                    ruleForm = res.data
                    // 是/否下拉框回显
                    setSelectOption();
                    // 设置图片src
                    showImg();
                    // 数据填充
                    dataBind();
                    // 富文本框回显
                    setContent();
                    //注册表单验证
                    $(validform());
                }

            });
        }
    }

    // 清除可能会重复渲染的selection
    function clear(className) {
        var elements = document.getElementsByClassName(className);
        for (var i = elements.length - 1; i >= 0; i--) {
            elements[i].parentNode.removeChild(elements[i]);
        }
    }

    function dateTimePick() {
            laydate.render({
                elem: '#createTime'
                ,type: 'datetime'
            });
    }


    function dataBind() {


    <!--  级联表的数据回显  -->
        yonghuDataBind();


    <!--  当前表的数据回显  -->
        $("#updateId").val(ruleForm.id);
        $("#yonghuId").val(ruleForm.yonghuId);
        $("#gongsiName").val(ruleForm.gongsiName);
        $("#fuzerenName").val(ruleForm.fuzerenName);
        $("#fuzerenIdNumber").val(ruleForm.fuzerenIdNumber);
        $("#beizhuContent").val(ruleForm.beizhuContent);

    }
    <!--  级联表的数据回显  -->
    function yonghuDataBind(){

                    <!-- 把id赋值给当前表的id-->
        $("#yonghuId").val(ruleForm.id);

        $("#username").val(ruleForm.username);
        $("#password").val(ruleForm.password);
        $("#name").val(ruleForm.name);
        $("#sexValue").val(ruleForm.sexValue);
        $("#chushengriqi").val(ruleForm.chushengriqi);
        $("#nation").val(ruleForm.nation);
        $("#politicsValue").val(ruleForm.politicsValue);
        $("#xuexiaoValue").val(ruleForm.xuexiaoValue);
        $("#xueyuanValue").val(ruleForm.xueyuanValue);
        $("#zhuanyeValue").val(ruleForm.zhuanyeValue);
        $("#banji").val(ruleForm.banji);
        $("#xuehao").val(ruleForm.xuehao);
        $("#idNumber").val(ruleForm.idNumber);
        $("#phone").val(ruleForm.phone);
        $("#address").val(ruleForm.address);
        $("#youxiang").val(ruleForm.youxiang);
        $("#youzhengbianma").val(ruleForm.youzhengbianma);
        $("#aihaoContent").val(ruleForm.aihaoContent);
    }


    //图片显示
    function showImg() {
        <!--  当前表的图片  -->

        <!--  级联表的图片  -->
        yonghuShowImg();
    }


    <!--  级联表的图片  -->

    function yonghuShowImg() {
        $("#yonghuPhotoImg").attr("src",ruleForm.yonghuPhoto);
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
        //初始化时间插件
        dateTimePick();
        //查询所有下拉框
            <!--  当前表的下拉框  -->
            jiuyeTypesSelect();
            diquTypesSelect();
            zhiweiTypesSelect();
            <!-- 查询级联表的下拉框(用id做option,用名字及其他参数做名字级联修改) -->
            yonghuSelect();



        // 初始化下拉框
            <!--  初始化当前表的下拉框  -->
            initializationJiuyetypesSelect();
            initializationDiqutypesSelect();
            initializationZhiweitypesSelect();
            <!--  初始化级联表的下拉框  -->
            initializationyonghuSelect();

        $(".selectpicker" ).selectpicker('refresh');
        getDetails();
        //初始化上传按钮
        upload();
    <%@ include file="../../static/myInfo.js"%>
                $('#submitBtn').on('click', function (e) {
                    e.preventDefault();
                    //console.log("点击了...提交按钮");
                    submit();
                });
        readonly();
    });

    function readonly() {
        if (window.sessionStorage.getItem('role') != '管理员') {
            $('#jifen').attr('readonly', 'readonly');
            //$('#money').attr('readonly', 'readonly');
        }
    }

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