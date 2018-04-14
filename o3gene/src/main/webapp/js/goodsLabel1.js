$(function(){
	$("#goodsLabel1").find("img").mouseenter(function(){
		$(this).parents(".goodsBox").find(".goodsTitle span:first").removeClass("color-gray");
		$(this).parents(".goodsBox").find(".goodsTitle span:first").css("color","#732C27");
	});
	$("#goodsLabel1").find("img").mouseleave(function(){
		$(this).parents(".goodsBox").find(".goodsTitle span:first").addClass("color-gray");
		$(this).parents(".goodsBox").find(".goodsTitle span:first").css("color","#732C27");
	});
})