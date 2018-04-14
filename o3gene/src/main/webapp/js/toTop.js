$(function() {
	/*页面加载完成，首次调用位置设置方法*/
	set();
	/*页面加载完成，首次调用隐藏、显示方法*/
	show();
	
	/*监听窗口尺寸，调用位置设置方法*/
	window.onresize = function() {
		set();
	}
	
	/*返回顶部*/
	$("#to-top").click(function(){
		$(window).scrollTop(0);
	})
	$("#to-bottom").click(function(){
		$(window).scrollTop(document.body.scrollHeight);
	})
	
	/*监听滚动条，特定时候显示top图标*/
	$(window).scroll(function(event){
		show();
    });
})


/*定义方法：设置电梯导航的位置*/
function set() {
	/*topBar中的标的对象*/
	var container_obj = $(".container");
	var offset = container_obj.offset();
	/*电梯对象*/
	var to_top_obj = $("#to-top");
	var to_bottom_obj=$("#to-bottom");
	if ($(window).width() > container_obj.width() + 20 + to_top_obj.width() * 2+5) {
		$("#to-top").css("left", offset.left + container_obj.width()+5);
		$("#to-bottom").css("left", offset.left + container_obj.width()+5);
	}else {
		$("#to-top").css("right",-to_top_obj.width());
		$("#to-bottom").css("right",-to_top_obj.width());
	}
	$("#to-top").css("top", $(window).height() - to_top_obj.height()*2 - 20);
	$("#to-bottom").css("top", $(window).height() - to_top_obj.height() - 18);
}

/*定义方法：特定时候显示top图标*/
function show(){
	/*topBar中的标的对象*/
	var container_obj = $(".container");
	if($(document).scrollTop()>container_obj.height()){
		$("#to-top").show(300);
	}else{
		$("#to-top").hide(300);
	}
	if(document.body.scrollHeight>$(window).height()*2&&$(document).scrollTop()>$(window).height()&&document.body.scrollHeight-$(document).scrollTop()>$(window).height()*2){
		$("#to-bottom").show(300);
	}else{
		$("#to-bottom").hide(300);
	}
}