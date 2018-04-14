$(function() {
	/*初始化userLabel位置*/
	setUserLabel();
	
	/*点击弹出用户面板*/
	$('.nav-item-click').click(function() {
		if (2 != $(this).children('ul').attr("z-index")) {
			$(this).children('ul').attr('z-index', 2);
			$(this).children('ul').stop(true, true).slideDown(300);
		} else {
			$(this).children('ul').removeAttr('z-index');
			$(this).children('ul').stop(true, true).slideUp(300);
		}
	})
	
	/*从用户面板移除，收回用户面板*/
	$('.nav-item-click').mouseleave(function(){
		$(this).children('ul').removeAttr('z-index');
		$(this).children('ul').stop(true, true).slideUp(300);
	})
	
	/*悬停改变图标颜色*/
	$(".user-item-down a").mouseenter(function(){
		$(this).children(".user-fa").css("color","#b0544f");
	});
	$(".user-item-down a").mouseleave(function(){
		$(this).children(".user-fa").css("color","#D87C77");
	});
})
/*取消子元素点击事件的冒泡*/
function cancelClick(e) {
	//取消冒泡
	e.cancelBubble = true;
}

/*设置用户面板的位置*/
function setUserLabel(){
	var temp=$(".nav-item-click").width()-$("#user-label").width()+14;
	console.log($(".nav-item-click").width());
	console.log($("#user-label").width());
	$("#user-label").css("left",temp);
}