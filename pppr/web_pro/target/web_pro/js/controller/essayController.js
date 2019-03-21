// 定义控制器:
app.controller("essayController",function($scope,$controller,$http,essayService){
	// AngularJS中的继承:伪继承
	$controller('baseController',{$scope:$scope});
	
	// 查询所有的文章列表的方法:
	$scope.findAll = function(){
		// 向后台发送请求:
		essayService.findAll().success(function(response){
			$scope.list = response;

		});
	}

	// 分页查询
	$scope.findPage = function(page,rows){
		// 向后台发送请求获取数据:
		essayService.findPage(page,rows).success(function(response){
			$scope.paginationConf.totalItems = response.total
			$scope.list = response.rows
		});
	}
	
	// 保存文章的方法:
	$scope.save = function(){
		// 区分是保存还是修改
		var object;
		if($scope.entity.id != null){
			// 更新
			object = essayService.update($scope.entity);
		}else{
			// 保存
			object = essayService.add($scope.entity);
		}
		object.success(function(response){
			// {flag:true,message:xxx}
			// 判断保存是否成功:
			if(response.flag){
				// 保存成功
				alert(response.message);
				$scope.reloadList();
			}else{
				// 保存失败
				alert(response.message);
			}
		});
	}
	
	// 查询一个:
	$scope.findById = function(id){
		essayService.findById(id).success(function(response){
			// {id:xx,name:yy,firstChar:zz}
			$scope.entity = response;
		});
	}
	
	// 删除文章:
	$scope.dele = function(){
		essayService.dele($scope.selectIds).success(function(response){
			// 判断保存是否成功:
			if(response.flag==true){
				// 保存成功
				alert(response.message);
				$scope.reloadList();
				$scope.selectIds = [];
			}else{
				// 保存失败
				alert(response.message);
			}
		});
	}
	

	

	
});
