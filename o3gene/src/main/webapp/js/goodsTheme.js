$(function(){
	$(".goodsThemeBox").mouseenter(function(){
		$(this).find(".themeTitle").css("color","#AF5550");
	})
	$(".goodsThemeBox").mouseleave(function(){
		$(this).find(".themeTitle").css("color","#732C27");
	})
})