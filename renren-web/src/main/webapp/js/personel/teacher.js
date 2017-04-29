$(function () {
    $("#jqGrid").jqGrid({
        url: '../teacher/list',
        datatype: "json",
        colModel: [			
			{ label: 'teacherId', name: 'teacherId', index: 'teacher_id', width: 50, key: true },
			{ label: '姓名', name: 'name', index: 'name', width: 80 }, 			
			{ label: '教龄', name: 'teachAge', index: 'teach_age', width: 80 }, 			
			{ label: '', name: 'lastUpdate', index: 'last_update', width: 80 }, 			
			{ label: '出生日期', name: 'born', index: 'born', width: 80 }, 			
			{ label: '性别', name: 'sex', index: 'sex', width: 80 }, 			
			{ label: '主教科目', name: 'subjectId', index: 'subject_id', width: 80 }, 			
			{ label: '', name: 'positionId', index: 'position_id', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		teacher: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.teacher = {};
		},
		update: function (event) {
			var teacherId = getSelectedRow();
			if(teacherId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(teacherId)
		},
		saveOrUpdate: function (event) {
			var url = vm.teacher.teacherId == null ? "../teacher/save" : "../teacher/update";
			$.ajax({
				type: "POST",
			    url: url,
			    data: JSON.stringify(vm.teacher),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var teacherIds = getSelectedRows();
			if(teacherIds == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: "../teacher/delete",
				    data: JSON.stringify(teacherIds),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(teacherId){
			$.get("../teacher/info/"+teacherId, function(r){
                vm.teacher = r.teacher;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});