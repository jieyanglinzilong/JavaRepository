<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="../../baselist.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
</head>

<body>
<form name="icform" method="post">

    <div id="menubar">
        <div id="middleMenubar">
            <div id="innerMenubar">
                <div id="navMenubar">
                    <ul>
                        <li id="view"><a href="/jkssm/basicinfo/factory/list.action?pageNo=${page.pageNo}"
                                         onclick="formSubmit('toview.action','_self');this.blur();">查看</a></li>
                        <li id="new"><a href="#" onclick="formSubmit('tocreate.action','_self');this.blur();">新增</a>
                        </li>
                        <li id="update"><a href="#" onclick="formSubmit('toupdate.action','_self');this.blur();">修改</a>
                        </li>
                        <%--<li id="delete"><a href="#" onclick="formSubmit('deleteById.action','_self');this.blur();">删除</a></li>--%>
<%--                        <li id="delete"><a href="#"--%>
<%--                                           onclick="formSubmit('deleteIds.action','_self');this.blur();">删除N</a></li>--%>
						<li id="delete"><a href="#"
										   onclick="deleteIds();this.blur();">删除N</a></li>
                        <li id="new"><a href="#" onclick="formSubmit('start.action','_self');this.blur();">启用</a></li>
                        <li id="new"><a href="#" onclick="formSubmit('stop.action','_self');this.blur();">停用</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <div class="textbox" id="centerTextbox">
        <div class="textbox-header">
            <div class="textbox-inner-header">
                <div class="textbox-title">
                    生产厂家列表
                </div>
            </div>
        </div>

        <div>

            <div class="eXtremeTable">
                <table id="ec_table" class="tableRegion" width="98%">
                    <thead>
                    <tr>
                        <td class="tableHeader"><input type="checkbox" name="selid" onclick="checkAll('id',this)"></td>
                        <td class="tableHeader">序号</td>
                        <td class="tableHeader">厂家全称</td>
                        <td class="tableHeader">缩写</td>
                        <td class="tableHeader">联系人</td>
                        <td class="tableHeader">电话</td>
                        <td class="tableHeader">手机</td>
                        <td class="tableHeader">传真</td>
                        <td class="tableHeader">验货员</td>
                        <td class="tableHeader">状态</td>
                        <td class="tableHeader">操作</td>
                    </tr>
                    </thead>
                    <tbody class="tableBody">
                    <c:forEach items="${page.results}" var="o" varStatus="status">
                        <tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'">
                            <td><input type="checkbox" name="id" value="${o.factoryId}"
                                       onclick="selectid('${o.factoryId}', this)"/></td>
                            <td>${status.index+1}</td>
                            <td><a href="toview.action?id=${o.factoryId}">${o.fullName}</a></td>
                            <td>${o.factoryName}</td>
                            <td>${o.contacts}</td>
                            <td>${o.phone}</td>
                            <td>${o.mobile}</td>
                            <td>${o.fax}</td>
                            <td>${o.inspector}</td>
                            <td>
                                <c:if test="${o.state==1}"><a href="stop.action?id=${o.factoryId}"><font color="green">启用</font></a></c:if>
                                <c:if test="${o.state==0}"><a href="start.action?id=${o.factoryId}">停用</a></c:if>
                            </td>
                            <td>
                                <a href="delete.action?factoryId='${o.factoryId}'">删除</a>

                            </td>
                            <td>
                                <a href="toModify.action?factoryId=${o.factoryId}">修改</a>
                            </td>

                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <span>${page.pageLinks("/jkssm/basicinfo/factory/list.action")}</span>
            </div>
        </div>
    </div>
 </form>
</body>
<script type="text/javascript">
	ids=[];
	function selectid(id, obj){
		if(obj.checked){
			ids.push(id);
		}else {
			for(var i=0;i<ids.length;i++){
				if(ids[i]==id){
					ids.splice(i,1);
				}
			}
		}
	}
	function deleteIds() {
		if (ids.length == 0) {
			window.alert("没有选中要删除的数据！");
		} else {
			formSubmit('deleteIds.action?ids='+ids,'_self');
		}
	}
</script>
</html>

