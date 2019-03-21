// 定义服务层:
app.service("essayService",function($http){
	this.findAll = function(){
		return $http.get("../essay/findAll.do");
	}
	
	this.findPage = function(page,rows){
		return $http.get("../essay/findPage.do?pageNum="+page+"&pageSize="+rows);
	}
	
	this.add = function(entity){
		return $http.post("../essay/add.do",entity);
	}
	
	this.update=function(entity){
		return $http.post("../essay/update.do",entity);
	}
	
	this.findById=function(id){
		return $http.get("../essay/findOne.do?id="+id);
	}
	
	this.dele = function(ids){
		return $http.get("../essay/delete.do?ids="+ids);
	}
	

	

});